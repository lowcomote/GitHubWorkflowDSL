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
import githubwf.githubwf.services.NormalJobContainerOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNormalJobContainerOneOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Credentials", "Container", "Password", "Username", "Options", "Volumes", "Image", "Ports", "Env", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Options=8;
    public static final int Null=14;
    public static final int True=15;
    public static final int RULE_STRING=23;
    public static final int False=13;
    public static final int Image=10;
    public static final int Env=12;
    public static final int RULE_SL_COMMENT=28;
    public static final int Comma=16;
    public static final int Container=5;
    public static final int Volumes=9;
    public static final int Colon=17;
    public static final int RightCurlyBracket=21;
    public static final int RULE_E_DOUBLE=25;
    public static final int EOF=-1;
    public static final int RightSquareBracket=19;
    public static final int Password=6;
    public static final int RULE_ID=26;
    public static final int RULE_WS=29;
    public static final int LeftCurlyBracket=20;
    public static final int Ports=11;
    public static final int RULE_E_INT=24;
    public static final int RULE_ANY_OTHER=30;
    public static final int Username=7;
    public static final int RULE_INT=22;
    public static final int RULE_ML_COMMENT=27;
    public static final int LeftSquareBracket=18;
    public static final int Credentials=4;

    // delegates
    // delegators


        public InternalNormalJobContainerOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobContainerOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobContainerOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobContainerOneOf1Parser.g"; }



     	private NormalJobContainerOneOf1GrammarAccess grammarAccess;

        public InternalNormalJobContainerOneOf1Parser(TokenStream input, NormalJobContainerOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobContainerOneOf1";
       	}

       	@Override
       	protected NormalJobContainerOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobContainerOneOf1"
    // InternalNormalJobContainerOneOf1Parser.g:58:1: entryRuleNormalJobContainerOneOf1 returns [EObject current=null] : iv_ruleNormalJobContainerOneOf1= ruleNormalJobContainerOneOf1 EOF ;
    public final EObject entryRuleNormalJobContainerOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobContainerOneOf1 = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:58:65: (iv_ruleNormalJobContainerOneOf1= ruleNormalJobContainerOneOf1 EOF )
            // InternalNormalJobContainerOneOf1Parser.g:59:2: iv_ruleNormalJobContainerOneOf1= ruleNormalJobContainerOneOf1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobContainerOneOf1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobContainerOneOf1=ruleNormalJobContainerOneOf1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobContainerOneOf1; 
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
    // $ANTLR end "entryRuleNormalJobContainerOneOf1"


    // $ANTLR start "ruleNormalJobContainerOneOf1"
    // InternalNormalJobContainerOneOf1Parser.g:65:1: ruleNormalJobContainerOneOf1 returns [EObject current=null] : (otherlv_0= Container otherlv_1= Colon ( (lv_container_2_0= ruleContainer ) ) ) ;
    public final EObject ruleNormalJobContainerOneOf1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_container_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:71:2: ( (otherlv_0= Container otherlv_1= Colon ( (lv_container_2_0= ruleContainer ) ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:72:2: (otherlv_0= Container otherlv_1= Colon ( (lv_container_2_0= ruleContainer ) ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:72:2: (otherlv_0= Container otherlv_1= Colon ( (lv_container_2_0= ruleContainer ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:73:3: otherlv_0= Container otherlv_1= Colon ( (lv_container_2_0= ruleContainer ) )
            {
            otherlv_0=(Token)match(input,Container,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobContainerOneOf1Access().getContainerKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobContainerOneOf1Access().getColonKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:81:3: ( (lv_container_2_0= ruleContainer ) )
            // InternalNormalJobContainerOneOf1Parser.g:82:4: (lv_container_2_0= ruleContainer )
            {
            // InternalNormalJobContainerOneOf1Parser.g:82:4: (lv_container_2_0= ruleContainer )
            // InternalNormalJobContainerOneOf1Parser.g:83:5: lv_container_2_0= ruleContainer
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobContainerOneOf1Access().getContainerContainerParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_container_2_0=ruleContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobContainerOneOf1Rule());
              					}
              					set(
              						current,
              						"container",
              						lv_container_2_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.Container");
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
    // $ANTLR end "ruleNormalJobContainerOneOf1"


    // $ANTLR start "entryRuleContainerPropertiesAbstract"
    // InternalNormalJobContainerOneOf1Parser.g:104:1: entryRuleContainerPropertiesAbstract returns [EObject current=null] : iv_ruleContainerPropertiesAbstract= ruleContainerPropertiesAbstract EOF ;
    public final EObject entryRuleContainerPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPropertiesAbstract = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:104:68: (iv_ruleContainerPropertiesAbstract= ruleContainerPropertiesAbstract EOF )
            // InternalNormalJobContainerOneOf1Parser.g:105:2: iv_ruleContainerPropertiesAbstract= ruleContainerPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPropertiesAbstract=ruleContainerPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPropertiesAbstract; 
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
    // $ANTLR end "entryRuleContainerPropertiesAbstract"


    // $ANTLR start "ruleContainerPropertiesAbstract"
    // InternalNormalJobContainerOneOf1Parser.g:111:1: ruleContainerPropertiesAbstract returns [EObject current=null] : (this_ContainerImage_0= ruleContainerImage | this_ContainerCredentials_1= ruleContainerCredentials | this_ContainerEnv_2= ruleContainerEnv | this_ContainerPorts_3= ruleContainerPorts | this_ContainerVolumes_4= ruleContainerVolumes | this_ContainerOptions_5= ruleContainerOptions ) ;
    public final EObject ruleContainerPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerImage_0 = null;

        EObject this_ContainerCredentials_1 = null;

        EObject this_ContainerEnv_2 = null;

        EObject this_ContainerPorts_3 = null;

        EObject this_ContainerVolumes_4 = null;

        EObject this_ContainerOptions_5 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:117:2: ( (this_ContainerImage_0= ruleContainerImage | this_ContainerCredentials_1= ruleContainerCredentials | this_ContainerEnv_2= ruleContainerEnv | this_ContainerPorts_3= ruleContainerPorts | this_ContainerVolumes_4= ruleContainerVolumes | this_ContainerOptions_5= ruleContainerOptions ) )
            // InternalNormalJobContainerOneOf1Parser.g:118:2: (this_ContainerImage_0= ruleContainerImage | this_ContainerCredentials_1= ruleContainerCredentials | this_ContainerEnv_2= ruleContainerEnv | this_ContainerPorts_3= ruleContainerPorts | this_ContainerVolumes_4= ruleContainerVolumes | this_ContainerOptions_5= ruleContainerOptions )
            {
            // InternalNormalJobContainerOneOf1Parser.g:118:2: (this_ContainerImage_0= ruleContainerImage | this_ContainerCredentials_1= ruleContainerCredentials | this_ContainerEnv_2= ruleContainerEnv | this_ContainerPorts_3= ruleContainerPorts | this_ContainerVolumes_4= ruleContainerVolumes | this_ContainerOptions_5= ruleContainerOptions )
            int alt1=6;
            switch ( input.LA(1) ) {
            case Image:
                {
                alt1=1;
                }
                break;
            case Credentials:
                {
                alt1=2;
                }
                break;
            case Env:
                {
                alt1=3;
                }
                break;
            case Ports:
                {
                alt1=4;
                }
                break;
            case Volumes:
                {
                alt1=5;
                }
                break;
            case Options:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:119:3: this_ContainerImage_0= ruleContainerImage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPropertiesAbstractAccess().getContainerImageParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerImage_0=ruleContainerImage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerImage_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobContainerOneOf1Parser.g:128:3: this_ContainerCredentials_1= ruleContainerCredentials
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPropertiesAbstractAccess().getContainerCredentialsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerCredentials_1=ruleContainerCredentials();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerCredentials_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobContainerOneOf1Parser.g:137:3: this_ContainerEnv_2= ruleContainerEnv
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPropertiesAbstractAccess().getContainerEnvParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerEnv_2=ruleContainerEnv();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerEnv_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobContainerOneOf1Parser.g:146:3: this_ContainerPorts_3= ruleContainerPorts
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPropertiesAbstractAccess().getContainerPortsParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerPorts_3=ruleContainerPorts();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerPorts_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobContainerOneOf1Parser.g:155:3: this_ContainerVolumes_4= ruleContainerVolumes
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPropertiesAbstractAccess().getContainerVolumesParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerVolumes_4=ruleContainerVolumes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerVolumes_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobContainerOneOf1Parser.g:164:3: this_ContainerOptions_5= ruleContainerOptions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPropertiesAbstractAccess().getContainerOptionsParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerOptions_5=ruleContainerOptions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerOptions_5;
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
    // $ANTLR end "ruleContainerPropertiesAbstract"


    // $ANTLR start "entryRuleContainerCredentialsPropertiesAbstract"
    // InternalNormalJobContainerOneOf1Parser.g:176:1: entryRuleContainerCredentialsPropertiesAbstract returns [EObject current=null] : iv_ruleContainerCredentialsPropertiesAbstract= ruleContainerCredentialsPropertiesAbstract EOF ;
    public final EObject entryRuleContainerCredentialsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerCredentialsPropertiesAbstract = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:176:79: (iv_ruleContainerCredentialsPropertiesAbstract= ruleContainerCredentialsPropertiesAbstract EOF )
            // InternalNormalJobContainerOneOf1Parser.g:177:2: iv_ruleContainerCredentialsPropertiesAbstract= ruleContainerCredentialsPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerCredentialsPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerCredentialsPropertiesAbstract=ruleContainerCredentialsPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerCredentialsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleContainerCredentialsPropertiesAbstract"


    // $ANTLR start "ruleContainerCredentialsPropertiesAbstract"
    // InternalNormalJobContainerOneOf1Parser.g:183:1: ruleContainerCredentialsPropertiesAbstract returns [EObject current=null] : (this_ContainerCredentialsUsername_0= ruleContainerCredentialsUsername | this_ContainerCredentialsPassword_1= ruleContainerCredentialsPassword | ( ( ruleContainerCredentialsAdditionalProperties )=>this_ContainerCredentialsAdditionalProperties_2= ruleContainerCredentialsAdditionalProperties ) ) ;
    public final EObject ruleContainerCredentialsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerCredentialsUsername_0 = null;

        EObject this_ContainerCredentialsPassword_1 = null;

        EObject this_ContainerCredentialsAdditionalProperties_2 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:189:2: ( (this_ContainerCredentialsUsername_0= ruleContainerCredentialsUsername | this_ContainerCredentialsPassword_1= ruleContainerCredentialsPassword | ( ( ruleContainerCredentialsAdditionalProperties )=>this_ContainerCredentialsAdditionalProperties_2= ruleContainerCredentialsAdditionalProperties ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:190:2: (this_ContainerCredentialsUsername_0= ruleContainerCredentialsUsername | this_ContainerCredentialsPassword_1= ruleContainerCredentialsPassword | ( ( ruleContainerCredentialsAdditionalProperties )=>this_ContainerCredentialsAdditionalProperties_2= ruleContainerCredentialsAdditionalProperties ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:190:2: (this_ContainerCredentialsUsername_0= ruleContainerCredentialsUsername | this_ContainerCredentialsPassword_1= ruleContainerCredentialsPassword | ( ( ruleContainerCredentialsAdditionalProperties )=>this_ContainerCredentialsAdditionalProperties_2= ruleContainerCredentialsAdditionalProperties ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:191:3: this_ContainerCredentialsUsername_0= ruleContainerCredentialsUsername
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerCredentialsPropertiesAbstractAccess().getContainerCredentialsUsernameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerCredentialsUsername_0=ruleContainerCredentialsUsername();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerCredentialsUsername_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobContainerOneOf1Parser.g:200:3: this_ContainerCredentialsPassword_1= ruleContainerCredentialsPassword
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerCredentialsPropertiesAbstractAccess().getContainerCredentialsPasswordParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerCredentialsPassword_1=ruleContainerCredentialsPassword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerCredentialsPassword_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobContainerOneOf1Parser.g:209:3: ( ( ruleContainerCredentialsAdditionalProperties )=>this_ContainerCredentialsAdditionalProperties_2= ruleContainerCredentialsAdditionalProperties )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:209:3: ( ( ruleContainerCredentialsAdditionalProperties )=>this_ContainerCredentialsAdditionalProperties_2= ruleContainerCredentialsAdditionalProperties )
                    // InternalNormalJobContainerOneOf1Parser.g:210:4: ( ruleContainerCredentialsAdditionalProperties )=>this_ContainerCredentialsAdditionalProperties_2= ruleContainerCredentialsAdditionalProperties
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainerCredentialsPropertiesAbstractAccess().getContainerCredentialsAdditionalPropertiesParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerCredentialsAdditionalProperties_2=ruleContainerCredentialsAdditionalProperties();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ContainerCredentialsAdditionalProperties_2;
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
    // $ANTLR end "ruleContainerCredentialsPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalNormalJobContainerOneOf1Parser.g:224:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:224:46: (iv_ruleValue= ruleValue EOF )
            // InternalNormalJobContainerOneOf1Parser.g:225:2: iv_ruleValue= ruleValue EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:231:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalNormalJobContainerOneOf1Parser.g:237:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalNormalJobContainerOneOf1Parser.g:238:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalNormalJobContainerOneOf1Parser.g:238:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt3=6;
            switch ( input.LA(1) ) {
            case Credentials:
            case Container:
            case Password:
            case Username:
            case Options:
            case Volumes:
            case Image:
            case Ports:
            case Env:
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
                    // InternalNormalJobContainerOneOf1Parser.g:239:3: this_StringValue_0= ruleStringValue
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
                    // InternalNormalJobContainerOneOf1Parser.g:248:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalNormalJobContainerOneOf1Parser.g:257:3: this_NullValue_2= ruleNullValue
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
                    // InternalNormalJobContainerOneOf1Parser.g:266:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalNormalJobContainerOneOf1Parser.g:275:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalNormalJobContainerOneOf1Parser.g:284:3: this_BooleanValue_5= ruleBooleanValue
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
    // InternalNormalJobContainerOneOf1Parser.g:296:1: entryRuleEnvAbstract returns [EObject current=null] : iv_ruleEnvAbstract= ruleEnvAbstract EOF ;
    public final EObject entryRuleEnvAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvAbstract = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:296:52: (iv_ruleEnvAbstract= ruleEnvAbstract EOF )
            // InternalNormalJobContainerOneOf1Parser.g:297:2: iv_ruleEnvAbstract= ruleEnvAbstract EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:303:1: ruleEnvAbstract returns [EObject current=null] : ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull ) ;
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
            // InternalNormalJobContainerOneOf1Parser.g:309:2: ( ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull ) )
            // InternalNormalJobContainerOneOf1Parser.g:310:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )
            {
            // InternalNormalJobContainerOneOf1Parser.g:310:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:311:3: ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:311:3: ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber )
                    // InternalNormalJobContainerOneOf1Parser.g:312:4: ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber
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
                    // InternalNormalJobContainerOneOf1Parser.g:323:3: this_EnvTypeString_1= ruleEnvTypeString
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
                    // InternalNormalJobContainerOneOf1Parser.g:332:3: this_EnvTypeInteger_2= ruleEnvTypeInteger
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
                    // InternalNormalJobContainerOneOf1Parser.g:341:3: this_EnvTypeBoolean_3= ruleEnvTypeBoolean
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
                    // InternalNormalJobContainerOneOf1Parser.g:350:3: this_EnvTypeObject_4= ruleEnvTypeObject
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
                    // InternalNormalJobContainerOneOf1Parser.g:359:3: this_EnvTypeArray_5= ruleEnvTypeArray
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
                    // InternalNormalJobContainerOneOf1Parser.g:368:3: this_EnvTypeNull_6= ruleEnvTypeNull
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
    // InternalNormalJobContainerOneOf1Parser.g:380:1: entryRuleEnvPropertiesAbstract returns [EObject current=null] : iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF ;
    public final EObject entryRuleEnvPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvPropertiesAbstract = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:380:62: (iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF )
            // InternalNormalJobContainerOneOf1Parser.g:381:2: iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:387:1: ruleEnvPropertiesAbstract returns [EObject current=null] : ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties ) ;
    public final EObject ruleEnvPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:393:2: ( ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties ) )
            // InternalNormalJobContainerOneOf1Parser.g:394:2: ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties )
            {
            // InternalNormalJobContainerOneOf1Parser.g:394:2: ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties )
            // InternalNormalJobContainerOneOf1Parser.g:395:3: ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties
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


    // $ANTLR start "entryRuleContainerPortsItemsAbstract"
    // InternalNormalJobContainerOneOf1Parser.g:408:1: entryRuleContainerPortsItemsAbstract returns [EObject current=null] : iv_ruleContainerPortsItemsAbstract= ruleContainerPortsItemsAbstract EOF ;
    public final EObject entryRuleContainerPortsItemsAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsAbstract = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:408:68: (iv_ruleContainerPortsItemsAbstract= ruleContainerPortsItemsAbstract EOF )
            // InternalNormalJobContainerOneOf1Parser.g:409:2: iv_ruleContainerPortsItemsAbstract= ruleContainerPortsItemsAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsAbstract=ruleContainerPortsItemsAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsAbstract; 
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
    // $ANTLR end "entryRuleContainerPortsItemsAbstract"


    // $ANTLR start "ruleContainerPortsItemsAbstract"
    // InternalNormalJobContainerOneOf1Parser.g:415:1: ruleContainerPortsItemsAbstract returns [EObject current=null] : ( ( ( ruleContainerPortsItemsTypeNumber )=>this_ContainerPortsItemsTypeNumber_0= ruleContainerPortsItemsTypeNumber ) | this_ContainerPortsItemsTypeString_1= ruleContainerPortsItemsTypeString | this_ContainerPortsItemsTypeInteger_2= ruleContainerPortsItemsTypeInteger | this_ContainerPortsItemsTypeBoolean_3= ruleContainerPortsItemsTypeBoolean | this_ContainerPortsItemsTypeObject_4= ruleContainerPortsItemsTypeObject | this_ContainerPortsItemsTypeArray_5= ruleContainerPortsItemsTypeArray | this_ContainerPortsItemsTypeNull_6= ruleContainerPortsItemsTypeNull ) ;
    public final EObject ruleContainerPortsItemsAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerPortsItemsTypeNumber_0 = null;

        EObject this_ContainerPortsItemsTypeString_1 = null;

        EObject this_ContainerPortsItemsTypeInteger_2 = null;

        EObject this_ContainerPortsItemsTypeBoolean_3 = null;

        EObject this_ContainerPortsItemsTypeObject_4 = null;

        EObject this_ContainerPortsItemsTypeArray_5 = null;

        EObject this_ContainerPortsItemsTypeNull_6 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:421:2: ( ( ( ( ruleContainerPortsItemsTypeNumber )=>this_ContainerPortsItemsTypeNumber_0= ruleContainerPortsItemsTypeNumber ) | this_ContainerPortsItemsTypeString_1= ruleContainerPortsItemsTypeString | this_ContainerPortsItemsTypeInteger_2= ruleContainerPortsItemsTypeInteger | this_ContainerPortsItemsTypeBoolean_3= ruleContainerPortsItemsTypeBoolean | this_ContainerPortsItemsTypeObject_4= ruleContainerPortsItemsTypeObject | this_ContainerPortsItemsTypeArray_5= ruleContainerPortsItemsTypeArray | this_ContainerPortsItemsTypeNull_6= ruleContainerPortsItemsTypeNull ) )
            // InternalNormalJobContainerOneOf1Parser.g:422:2: ( ( ( ruleContainerPortsItemsTypeNumber )=>this_ContainerPortsItemsTypeNumber_0= ruleContainerPortsItemsTypeNumber ) | this_ContainerPortsItemsTypeString_1= ruleContainerPortsItemsTypeString | this_ContainerPortsItemsTypeInteger_2= ruleContainerPortsItemsTypeInteger | this_ContainerPortsItemsTypeBoolean_3= ruleContainerPortsItemsTypeBoolean | this_ContainerPortsItemsTypeObject_4= ruleContainerPortsItemsTypeObject | this_ContainerPortsItemsTypeArray_5= ruleContainerPortsItemsTypeArray | this_ContainerPortsItemsTypeNull_6= ruleContainerPortsItemsTypeNull )
            {
            // InternalNormalJobContainerOneOf1Parser.g:422:2: ( ( ( ruleContainerPortsItemsTypeNumber )=>this_ContainerPortsItemsTypeNumber_0= ruleContainerPortsItemsTypeNumber ) | this_ContainerPortsItemsTypeString_1= ruleContainerPortsItemsTypeString | this_ContainerPortsItemsTypeInteger_2= ruleContainerPortsItemsTypeInteger | this_ContainerPortsItemsTypeBoolean_3= ruleContainerPortsItemsTypeBoolean | this_ContainerPortsItemsTypeObject_4= ruleContainerPortsItemsTypeObject | this_ContainerPortsItemsTypeArray_5= ruleContainerPortsItemsTypeArray | this_ContainerPortsItemsTypeNull_6= ruleContainerPortsItemsTypeNull )
            int alt5=7;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:423:3: ( ( ruleContainerPortsItemsTypeNumber )=>this_ContainerPortsItemsTypeNumber_0= ruleContainerPortsItemsTypeNumber )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:423:3: ( ( ruleContainerPortsItemsTypeNumber )=>this_ContainerPortsItemsTypeNumber_0= ruleContainerPortsItemsTypeNumber )
                    // InternalNormalJobContainerOneOf1Parser.g:424:4: ( ruleContainerPortsItemsTypeNumber )=>this_ContainerPortsItemsTypeNumber_0= ruleContainerPortsItemsTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getContainerPortsItemsAbstractAccess().getContainerPortsItemsTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerPortsItemsTypeNumber_0=ruleContainerPortsItemsTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ContainerPortsItemsTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobContainerOneOf1Parser.g:435:3: this_ContainerPortsItemsTypeString_1= ruleContainerPortsItemsTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPortsItemsAbstractAccess().getContainerPortsItemsTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerPortsItemsTypeString_1=ruleContainerPortsItemsTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerPortsItemsTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobContainerOneOf1Parser.g:444:3: this_ContainerPortsItemsTypeInteger_2= ruleContainerPortsItemsTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPortsItemsAbstractAccess().getContainerPortsItemsTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerPortsItemsTypeInteger_2=ruleContainerPortsItemsTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerPortsItemsTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobContainerOneOf1Parser.g:453:3: this_ContainerPortsItemsTypeBoolean_3= ruleContainerPortsItemsTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPortsItemsAbstractAccess().getContainerPortsItemsTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerPortsItemsTypeBoolean_3=ruleContainerPortsItemsTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerPortsItemsTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobContainerOneOf1Parser.g:462:3: this_ContainerPortsItemsTypeObject_4= ruleContainerPortsItemsTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPortsItemsAbstractAccess().getContainerPortsItemsTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerPortsItemsTypeObject_4=ruleContainerPortsItemsTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerPortsItemsTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobContainerOneOf1Parser.g:471:3: this_ContainerPortsItemsTypeArray_5= ruleContainerPortsItemsTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPortsItemsAbstractAccess().getContainerPortsItemsTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerPortsItemsTypeArray_5=ruleContainerPortsItemsTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerPortsItemsTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNormalJobContainerOneOf1Parser.g:480:3: this_ContainerPortsItemsTypeNull_6= ruleContainerPortsItemsTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContainerPortsItemsAbstractAccess().getContainerPortsItemsTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContainerPortsItemsTypeNull_6=ruleContainerPortsItemsTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContainerPortsItemsTypeNull_6;
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
    // $ANTLR end "ruleContainerPortsItemsAbstract"


    // $ANTLR start "entryRuleContainerPortsItemsPropertiesAbstract"
    // InternalNormalJobContainerOneOf1Parser.g:492:1: entryRuleContainerPortsItemsPropertiesAbstract returns [EObject current=null] : iv_ruleContainerPortsItemsPropertiesAbstract= ruleContainerPortsItemsPropertiesAbstract EOF ;
    public final EObject entryRuleContainerPortsItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsPropertiesAbstract = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:492:78: (iv_ruleContainerPortsItemsPropertiesAbstract= ruleContainerPortsItemsPropertiesAbstract EOF )
            // InternalNormalJobContainerOneOf1Parser.g:493:2: iv_ruleContainerPortsItemsPropertiesAbstract= ruleContainerPortsItemsPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsPropertiesAbstract=ruleContainerPortsItemsPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleContainerPortsItemsPropertiesAbstract"


    // $ANTLR start "ruleContainerPortsItemsPropertiesAbstract"
    // InternalNormalJobContainerOneOf1Parser.g:499:1: ruleContainerPortsItemsPropertiesAbstract returns [EObject current=null] : ( ( ruleContainerPortsItemsAdditionalProperties )=>this_ContainerPortsItemsAdditionalProperties_0= ruleContainerPortsItemsAdditionalProperties ) ;
    public final EObject ruleContainerPortsItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerPortsItemsAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:505:2: ( ( ( ruleContainerPortsItemsAdditionalProperties )=>this_ContainerPortsItemsAdditionalProperties_0= ruleContainerPortsItemsAdditionalProperties ) )
            // InternalNormalJobContainerOneOf1Parser.g:506:2: ( ( ruleContainerPortsItemsAdditionalProperties )=>this_ContainerPortsItemsAdditionalProperties_0= ruleContainerPortsItemsAdditionalProperties )
            {
            // InternalNormalJobContainerOneOf1Parser.g:506:2: ( ( ruleContainerPortsItemsAdditionalProperties )=>this_ContainerPortsItemsAdditionalProperties_0= ruleContainerPortsItemsAdditionalProperties )
            // InternalNormalJobContainerOneOf1Parser.g:507:3: ( ruleContainerPortsItemsAdditionalProperties )=>this_ContainerPortsItemsAdditionalProperties_0= ruleContainerPortsItemsAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getContainerPortsItemsPropertiesAbstractAccess().getContainerPortsItemsAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ContainerPortsItemsAdditionalProperties_0=ruleContainerPortsItemsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ContainerPortsItemsAdditionalProperties_0;
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
    // $ANTLR end "ruleContainerPortsItemsPropertiesAbstract"


    // $ANTLR start "entryRuleContainer"
    // InternalNormalJobContainerOneOf1Parser.g:520:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:520:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalNormalJobContainerOneOf1Parser.g:521:2: iv_ruleContainer= ruleContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalNormalJobContainerOneOf1Parser.g:527:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_container_2_0= ruleContainerPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_container_4_0= ruleContainerPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_container_2_0 = null;

        EObject lv_container_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:533:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_container_2_0= ruleContainerPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_container_4_0= ruleContainerPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobContainerOneOf1Parser.g:534:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_container_2_0= ruleContainerPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_container_4_0= ruleContainerPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobContainerOneOf1Parser.g:534:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_container_2_0= ruleContainerPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_container_4_0= ruleContainerPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobContainerOneOf1Parser.g:535:3: () otherlv_1= LeftCurlyBracket ( ( (lv_container_2_0= ruleContainerPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_container_4_0= ruleContainerPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobContainerOneOf1Parser.g:535:3: ()
            // InternalNormalJobContainerOneOf1Parser.g:536:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContainerAccess().getContainerAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:546:3: ( ( (lv_container_2_0= ruleContainerPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_container_4_0= ruleContainerPropertiesAbstract ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Credentials||(LA7_0>=Options && LA7_0<=Env)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:547:4: ( (lv_container_2_0= ruleContainerPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_container_4_0= ruleContainerPropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:547:4: ( (lv_container_2_0= ruleContainerPropertiesAbstract ) )
                    // InternalNormalJobContainerOneOf1Parser.g:548:5: (lv_container_2_0= ruleContainerPropertiesAbstract )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:548:5: (lv_container_2_0= ruleContainerPropertiesAbstract )
                    // InternalNormalJobContainerOneOf1Parser.g:549:6: lv_container_2_0= ruleContainerPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainerAccess().getContainerContainerPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_container_2_0=ruleContainerPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getContainerRule());
                      						}
                      						add(
                      							current,
                      							"container",
                      							lv_container_2_0,
                      							"githubwf.githubwf.NormalJobContainerOneOf1.ContainerPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobContainerOneOf1Parser.g:566:4: (otherlv_3= Comma ( (lv_container_4_0= ruleContainerPropertiesAbstract ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalNormalJobContainerOneOf1Parser.g:567:5: otherlv_3= Comma ( (lv_container_4_0= ruleContainerPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobContainerOneOf1Parser.g:571:5: ( (lv_container_4_0= ruleContainerPropertiesAbstract ) )
                    	    // InternalNormalJobContainerOneOf1Parser.g:572:6: (lv_container_4_0= ruleContainerPropertiesAbstract )
                    	    {
                    	    // InternalNormalJobContainerOneOf1Parser.g:572:6: (lv_container_4_0= ruleContainerPropertiesAbstract )
                    	    // InternalNormalJobContainerOneOf1Parser.g:573:7: lv_container_4_0= ruleContainerPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainerAccess().getContainerContainerPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_container_4_0=ruleContainerPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getContainerRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"container",
                    	      								lv_container_4_0,
                    	      								"githubwf.githubwf.NormalJobContainerOneOf1.ContainerPropertiesAbstract");
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

              			newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainerImage"
    // InternalNormalJobContainerOneOf1Parser.g:600:1: entryRuleContainerImage returns [EObject current=null] : iv_ruleContainerImage= ruleContainerImage EOF ;
    public final EObject entryRuleContainerImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerImage = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:600:55: (iv_ruleContainerImage= ruleContainerImage EOF )
            // InternalNormalJobContainerOneOf1Parser.g:601:2: iv_ruleContainerImage= ruleContainerImage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerImageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerImage=ruleContainerImage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerImage; 
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
    // $ANTLR end "entryRuleContainerImage"


    // $ANTLR start "ruleContainerImage"
    // InternalNormalJobContainerOneOf1Parser.g:607:1: ruleContainerImage returns [EObject current=null] : (otherlv_0= Image otherlv_1= Colon ( (lv_image_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainerImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_image_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:613:2: ( (otherlv_0= Image otherlv_1= Colon ( (lv_image_2_0= ruleEString ) ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:614:2: (otherlv_0= Image otherlv_1= Colon ( (lv_image_2_0= ruleEString ) ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:614:2: (otherlv_0= Image otherlv_1= Colon ( (lv_image_2_0= ruleEString ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:615:3: otherlv_0= Image otherlv_1= Colon ( (lv_image_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Image,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainerImageAccess().getImageKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerImageAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:623:3: ( (lv_image_2_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:624:4: (lv_image_2_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:624:4: (lv_image_2_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:625:5: lv_image_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerImageAccess().getImageEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_image_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerImageRule());
              					}
              					set(
              						current,
              						"image",
              						lv_image_2_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.EString");
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
    // $ANTLR end "ruleContainerImage"


    // $ANTLR start "entryRuleContainerCredentials"
    // InternalNormalJobContainerOneOf1Parser.g:646:1: entryRuleContainerCredentials returns [EObject current=null] : iv_ruleContainerCredentials= ruleContainerCredentials EOF ;
    public final EObject entryRuleContainerCredentials() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerCredentials = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:646:61: (iv_ruleContainerCredentials= ruleContainerCredentials EOF )
            // InternalNormalJobContainerOneOf1Parser.g:647:2: iv_ruleContainerCredentials= ruleContainerCredentials EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerCredentialsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerCredentials=ruleContainerCredentials();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerCredentials; 
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
    // $ANTLR end "entryRuleContainerCredentials"


    // $ANTLR start "ruleContainerCredentials"
    // InternalNormalJobContainerOneOf1Parser.g:653:1: ruleContainerCredentials returns [EObject current=null] : ( () otherlv_1= Credentials otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleContainerCredentials() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_credentials_4_0 = null;

        EObject lv_credentials_6_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:659:2: ( ( () otherlv_1= Credentials otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalNormalJobContainerOneOf1Parser.g:660:2: ( () otherlv_1= Credentials otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalNormalJobContainerOneOf1Parser.g:660:2: ( () otherlv_1= Credentials otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalNormalJobContainerOneOf1Parser.g:661:3: () otherlv_1= Credentials otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalNormalJobContainerOneOf1Parser.g:661:3: ()
            // InternalNormalJobContainerOneOf1Parser.g:662:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContainerCredentialsAccess().getContainerCredentialsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Credentials,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerCredentialsAccess().getCredentialsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getContainerCredentialsAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getContainerCredentialsAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:680:3: ( ( (lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=Credentials && LA9_0<=Env)||LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:681:4: ( (lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:681:4: ( (lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract ) )
                    // InternalNormalJobContainerOneOf1Parser.g:682:5: (lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:682:5: (lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract )
                    // InternalNormalJobContainerOneOf1Parser.g:683:6: lv_credentials_4_0= ruleContainerCredentialsPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainerCredentialsAccess().getCredentialsContainerCredentialsPropertiesAbstractParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_credentials_4_0=ruleContainerCredentialsPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getContainerCredentialsRule());
                      						}
                      						add(
                      							current,
                      							"credentials",
                      							lv_credentials_4_0,
                      							"githubwf.githubwf.NormalJobContainerOneOf1.ContainerCredentialsPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobContainerOneOf1Parser.g:700:4: (otherlv_5= Comma ( (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalNormalJobContainerOneOf1Parser.g:701:5: otherlv_5= Comma ( (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getContainerCredentialsAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobContainerOneOf1Parser.g:705:5: ( (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract ) )
                    	    // InternalNormalJobContainerOneOf1Parser.g:706:6: (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract )
                    	    {
                    	    // InternalNormalJobContainerOneOf1Parser.g:706:6: (lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract )
                    	    // InternalNormalJobContainerOneOf1Parser.g:707:7: lv_credentials_6_0= ruleContainerCredentialsPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainerCredentialsAccess().getCredentialsContainerCredentialsPropertiesAbstractParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_credentials_6_0=ruleContainerCredentialsPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getContainerCredentialsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"credentials",
                    	      								lv_credentials_6_0,
                    	      								"githubwf.githubwf.NormalJobContainerOneOf1.ContainerCredentialsPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getContainerCredentialsAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleContainerCredentials"


    // $ANTLR start "entryRuleContainerEnv"
    // InternalNormalJobContainerOneOf1Parser.g:734:1: entryRuleContainerEnv returns [EObject current=null] : iv_ruleContainerEnv= ruleContainerEnv EOF ;
    public final EObject entryRuleContainerEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerEnv = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:734:53: (iv_ruleContainerEnv= ruleContainerEnv EOF )
            // InternalNormalJobContainerOneOf1Parser.g:735:2: iv_ruleContainerEnv= ruleContainerEnv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerEnvRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerEnv=ruleContainerEnv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerEnv; 
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
    // $ANTLR end "entryRuleContainerEnv"


    // $ANTLR start "ruleContainerEnv"
    // InternalNormalJobContainerOneOf1Parser.g:741:1: ruleContainerEnv returns [EObject current=null] : (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) ) ;
    public final EObject ruleContainerEnv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_env_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:747:2: ( (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:748:2: (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:748:2: (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:749:3: otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) )
            {
            otherlv_0=(Token)match(input,Env,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainerEnvAccess().getEnvKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerEnvAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:757:3: ( (lv_env_2_0= ruleEnv ) )
            // InternalNormalJobContainerOneOf1Parser.g:758:4: (lv_env_2_0= ruleEnv )
            {
            // InternalNormalJobContainerOneOf1Parser.g:758:4: (lv_env_2_0= ruleEnv )
            // InternalNormalJobContainerOneOf1Parser.g:759:5: lv_env_2_0= ruleEnv
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerEnvAccess().getEnvEnvParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_env_2_0=ruleEnv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerEnvRule());
              					}
              					set(
              						current,
              						"env",
              						lv_env_2_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.Env");
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
    // $ANTLR end "ruleContainerEnv"


    // $ANTLR start "entryRuleContainerPorts"
    // InternalNormalJobContainerOneOf1Parser.g:780:1: entryRuleContainerPorts returns [EObject current=null] : iv_ruleContainerPorts= ruleContainerPorts EOF ;
    public final EObject entryRuleContainerPorts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPorts = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:780:55: (iv_ruleContainerPorts= ruleContainerPorts EOF )
            // InternalNormalJobContainerOneOf1Parser.g:781:2: iv_ruleContainerPorts= ruleContainerPorts EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPorts=ruleContainerPorts();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPorts; 
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
    // $ANTLR end "entryRuleContainerPorts"


    // $ANTLR start "ruleContainerPorts"
    // InternalNormalJobContainerOneOf1Parser.g:787:1: ruleContainerPorts returns [EObject current=null] : (otherlv_0= Ports otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_ports_3_0= ruleContainerPortsItems ) ) (otherlv_4= Comma ( (lv_ports_5_0= ruleContainerPortsItems ) ) )* otherlv_6= RightSquareBracket ) ;
    public final EObject ruleContainerPorts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ports_3_0 = null;

        EObject lv_ports_5_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:793:2: ( (otherlv_0= Ports otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_ports_3_0= ruleContainerPortsItems ) ) (otherlv_4= Comma ( (lv_ports_5_0= ruleContainerPortsItems ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalNormalJobContainerOneOf1Parser.g:794:2: (otherlv_0= Ports otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_ports_3_0= ruleContainerPortsItems ) ) (otherlv_4= Comma ( (lv_ports_5_0= ruleContainerPortsItems ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalNormalJobContainerOneOf1Parser.g:794:2: (otherlv_0= Ports otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_ports_3_0= ruleContainerPortsItems ) ) (otherlv_4= Comma ( (lv_ports_5_0= ruleContainerPortsItems ) ) )* otherlv_6= RightSquareBracket )
            // InternalNormalJobContainerOneOf1Parser.g:795:3: otherlv_0= Ports otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_ports_3_0= ruleContainerPortsItems ) ) (otherlv_4= Comma ( (lv_ports_5_0= ruleContainerPortsItems ) ) )* otherlv_6= RightSquareBracket
            {
            otherlv_0=(Token)match(input,Ports,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainerPortsAccess().getPortsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerPortsAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getContainerPortsAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:807:3: ( (lv_ports_3_0= ruleContainerPortsItems ) )
            // InternalNormalJobContainerOneOf1Parser.g:808:4: (lv_ports_3_0= ruleContainerPortsItems )
            {
            // InternalNormalJobContainerOneOf1Parser.g:808:4: (lv_ports_3_0= ruleContainerPortsItems )
            // InternalNormalJobContainerOneOf1Parser.g:809:5: lv_ports_3_0= ruleContainerPortsItems
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerPortsAccess().getPortsContainerPortsItemsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_ports_3_0=ruleContainerPortsItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerPortsRule());
              					}
              					add(
              						current,
              						"ports",
              						lv_ports_3_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.ContainerPortsItems");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNormalJobContainerOneOf1Parser.g:826:3: (otherlv_4= Comma ( (lv_ports_5_0= ruleContainerPortsItems ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalNormalJobContainerOneOf1Parser.g:827:4: otherlv_4= Comma ( (lv_ports_5_0= ruleContainerPortsItems ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getContainerPortsAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalNormalJobContainerOneOf1Parser.g:831:4: ( (lv_ports_5_0= ruleContainerPortsItems ) )
            	    // InternalNormalJobContainerOneOf1Parser.g:832:5: (lv_ports_5_0= ruleContainerPortsItems )
            	    {
            	    // InternalNormalJobContainerOneOf1Parser.g:832:5: (lv_ports_5_0= ruleContainerPortsItems )
            	    // InternalNormalJobContainerOneOf1Parser.g:833:6: lv_ports_5_0= ruleContainerPortsItems
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainerPortsAccess().getPortsContainerPortsItemsParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_ports_5_0=ruleContainerPortsItems();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContainerPortsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ports",
            	      							lv_ports_5_0,
            	      							"githubwf.githubwf.NormalJobContainerOneOf1.ContainerPortsItems");
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

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getContainerPortsAccess().getRightSquareBracketKeyword_5());
              		
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
    // $ANTLR end "ruleContainerPorts"


    // $ANTLR start "entryRuleContainerVolumes"
    // InternalNormalJobContainerOneOf1Parser.g:859:1: entryRuleContainerVolumes returns [EObject current=null] : iv_ruleContainerVolumes= ruleContainerVolumes EOF ;
    public final EObject entryRuleContainerVolumes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerVolumes = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:859:57: (iv_ruleContainerVolumes= ruleContainerVolumes EOF )
            // InternalNormalJobContainerOneOf1Parser.g:860:2: iv_ruleContainerVolumes= ruleContainerVolumes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerVolumesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerVolumes=ruleContainerVolumes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerVolumes; 
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
    // $ANTLR end "entryRuleContainerVolumes"


    // $ANTLR start "ruleContainerVolumes"
    // InternalNormalJobContainerOneOf1Parser.g:866:1: ruleContainerVolumes returns [EObject current=null] : (otherlv_0= Volumes otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_volumes_3_0= ruleContainerVolumesItems ) ) (otherlv_4= Comma ( (lv_volumes_5_0= ruleContainerVolumesItems ) ) )* otherlv_6= RightSquareBracket ) ;
    public final EObject ruleContainerVolumes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_volumes_3_0 = null;

        EObject lv_volumes_5_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:872:2: ( (otherlv_0= Volumes otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_volumes_3_0= ruleContainerVolumesItems ) ) (otherlv_4= Comma ( (lv_volumes_5_0= ruleContainerVolumesItems ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalNormalJobContainerOneOf1Parser.g:873:2: (otherlv_0= Volumes otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_volumes_3_0= ruleContainerVolumesItems ) ) (otherlv_4= Comma ( (lv_volumes_5_0= ruleContainerVolumesItems ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalNormalJobContainerOneOf1Parser.g:873:2: (otherlv_0= Volumes otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_volumes_3_0= ruleContainerVolumesItems ) ) (otherlv_4= Comma ( (lv_volumes_5_0= ruleContainerVolumesItems ) ) )* otherlv_6= RightSquareBracket )
            // InternalNormalJobContainerOneOf1Parser.g:874:3: otherlv_0= Volumes otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_volumes_3_0= ruleContainerVolumesItems ) ) (otherlv_4= Comma ( (lv_volumes_5_0= ruleContainerVolumesItems ) ) )* otherlv_6= RightSquareBracket
            {
            otherlv_0=(Token)match(input,Volumes,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainerVolumesAccess().getVolumesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerVolumesAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getContainerVolumesAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:886:3: ( (lv_volumes_3_0= ruleContainerVolumesItems ) )
            // InternalNormalJobContainerOneOf1Parser.g:887:4: (lv_volumes_3_0= ruleContainerVolumesItems )
            {
            // InternalNormalJobContainerOneOf1Parser.g:887:4: (lv_volumes_3_0= ruleContainerVolumesItems )
            // InternalNormalJobContainerOneOf1Parser.g:888:5: lv_volumes_3_0= ruleContainerVolumesItems
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerVolumesAccess().getVolumesContainerVolumesItemsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_volumes_3_0=ruleContainerVolumesItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerVolumesRule());
              					}
              					add(
              						current,
              						"volumes",
              						lv_volumes_3_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.ContainerVolumesItems");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNormalJobContainerOneOf1Parser.g:905:3: (otherlv_4= Comma ( (lv_volumes_5_0= ruleContainerVolumesItems ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNormalJobContainerOneOf1Parser.g:906:4: otherlv_4= Comma ( (lv_volumes_5_0= ruleContainerVolumesItems ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getContainerVolumesAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalNormalJobContainerOneOf1Parser.g:910:4: ( (lv_volumes_5_0= ruleContainerVolumesItems ) )
            	    // InternalNormalJobContainerOneOf1Parser.g:911:5: (lv_volumes_5_0= ruleContainerVolumesItems )
            	    {
            	    // InternalNormalJobContainerOneOf1Parser.g:911:5: (lv_volumes_5_0= ruleContainerVolumesItems )
            	    // InternalNormalJobContainerOneOf1Parser.g:912:6: lv_volumes_5_0= ruleContainerVolumesItems
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContainerVolumesAccess().getVolumesContainerVolumesItemsParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_volumes_5_0=ruleContainerVolumesItems();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContainerVolumesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"volumes",
            	      							lv_volumes_5_0,
            	      							"githubwf.githubwf.NormalJobContainerOneOf1.ContainerVolumesItems");
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

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getContainerVolumesAccess().getRightSquareBracketKeyword_5());
              		
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
    // $ANTLR end "ruleContainerVolumes"


    // $ANTLR start "entryRuleContainerOptions"
    // InternalNormalJobContainerOneOf1Parser.g:938:1: entryRuleContainerOptions returns [EObject current=null] : iv_ruleContainerOptions= ruleContainerOptions EOF ;
    public final EObject entryRuleContainerOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerOptions = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:938:57: (iv_ruleContainerOptions= ruleContainerOptions EOF )
            // InternalNormalJobContainerOneOf1Parser.g:939:2: iv_ruleContainerOptions= ruleContainerOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerOptionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerOptions=ruleContainerOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerOptions; 
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
    // $ANTLR end "entryRuleContainerOptions"


    // $ANTLR start "ruleContainerOptions"
    // InternalNormalJobContainerOneOf1Parser.g:945:1: ruleContainerOptions returns [EObject current=null] : (otherlv_0= Options otherlv_1= Colon ( (lv_options_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainerOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_options_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:951:2: ( (otherlv_0= Options otherlv_1= Colon ( (lv_options_2_0= ruleEString ) ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:952:2: (otherlv_0= Options otherlv_1= Colon ( (lv_options_2_0= ruleEString ) ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:952:2: (otherlv_0= Options otherlv_1= Colon ( (lv_options_2_0= ruleEString ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:953:3: otherlv_0= Options otherlv_1= Colon ( (lv_options_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Options,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainerOptionsAccess().getOptionsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerOptionsAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:961:3: ( (lv_options_2_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:962:4: (lv_options_2_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:962:4: (lv_options_2_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:963:5: lv_options_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerOptionsAccess().getOptionsEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_options_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerOptionsRule());
              					}
              					set(
              						current,
              						"options",
              						lv_options_2_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.EString");
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
    // $ANTLR end "ruleContainerOptions"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobContainerOneOf1Parser.g:984:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:984:47: (iv_ruleEString= ruleEString EOF )
            // InternalNormalJobContainerOneOf1Parser.g:985:2: iv_ruleEString= ruleEString EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:991:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:997:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalNormalJobContainerOneOf1Parser.g:998:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleContainerCredentialsUsername"
    // InternalNormalJobContainerOneOf1Parser.g:1011:1: entryRuleContainerCredentialsUsername returns [EObject current=null] : iv_ruleContainerCredentialsUsername= ruleContainerCredentialsUsername EOF ;
    public final EObject entryRuleContainerCredentialsUsername() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerCredentialsUsername = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1011:69: (iv_ruleContainerCredentialsUsername= ruleContainerCredentialsUsername EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1012:2: iv_ruleContainerCredentialsUsername= ruleContainerCredentialsUsername EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerCredentialsUsernameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerCredentialsUsername=ruleContainerCredentialsUsername();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerCredentialsUsername; 
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
    // $ANTLR end "entryRuleContainerCredentialsUsername"


    // $ANTLR start "ruleContainerCredentialsUsername"
    // InternalNormalJobContainerOneOf1Parser.g:1018:1: ruleContainerCredentialsUsername returns [EObject current=null] : (otherlv_0= Username otherlv_1= Colon ( (lv_username_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainerCredentialsUsername() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_username_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1024:2: ( (otherlv_0= Username otherlv_1= Colon ( (lv_username_2_0= ruleEString ) ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1025:2: (otherlv_0= Username otherlv_1= Colon ( (lv_username_2_0= ruleEString ) ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1025:2: (otherlv_0= Username otherlv_1= Colon ( (lv_username_2_0= ruleEString ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1026:3: otherlv_0= Username otherlv_1= Colon ( (lv_username_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Username,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainerCredentialsUsernameAccess().getUsernameKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerCredentialsUsernameAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:1034:3: ( (lv_username_2_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:1035:4: (lv_username_2_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1035:4: (lv_username_2_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:1036:5: lv_username_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerCredentialsUsernameAccess().getUsernameEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_username_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerCredentialsUsernameRule());
              					}
              					set(
              						current,
              						"username",
              						lv_username_2_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.EString");
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
    // $ANTLR end "ruleContainerCredentialsUsername"


    // $ANTLR start "entryRuleContainerCredentialsPassword"
    // InternalNormalJobContainerOneOf1Parser.g:1057:1: entryRuleContainerCredentialsPassword returns [EObject current=null] : iv_ruleContainerCredentialsPassword= ruleContainerCredentialsPassword EOF ;
    public final EObject entryRuleContainerCredentialsPassword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerCredentialsPassword = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1057:69: (iv_ruleContainerCredentialsPassword= ruleContainerCredentialsPassword EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1058:2: iv_ruleContainerCredentialsPassword= ruleContainerCredentialsPassword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerCredentialsPasswordRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerCredentialsPassword=ruleContainerCredentialsPassword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerCredentialsPassword; 
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
    // $ANTLR end "entryRuleContainerCredentialsPassword"


    // $ANTLR start "ruleContainerCredentialsPassword"
    // InternalNormalJobContainerOneOf1Parser.g:1064:1: ruleContainerCredentialsPassword returns [EObject current=null] : (otherlv_0= Password otherlv_1= Colon ( (lv_password_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainerCredentialsPassword() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_password_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1070:2: ( (otherlv_0= Password otherlv_1= Colon ( (lv_password_2_0= ruleEString ) ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1071:2: (otherlv_0= Password otherlv_1= Colon ( (lv_password_2_0= ruleEString ) ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1071:2: (otherlv_0= Password otherlv_1= Colon ( (lv_password_2_0= ruleEString ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1072:3: otherlv_0= Password otherlv_1= Colon ( (lv_password_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Password,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainerCredentialsPasswordAccess().getPasswordKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerCredentialsPasswordAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:1080:3: ( (lv_password_2_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:1081:4: (lv_password_2_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1081:4: (lv_password_2_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:1082:5: lv_password_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerCredentialsPasswordAccess().getPasswordEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_password_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerCredentialsPasswordRule());
              					}
              					set(
              						current,
              						"password",
              						lv_password_2_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.EString");
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
    // $ANTLR end "ruleContainerCredentialsPassword"


    // $ANTLR start "entryRuleContainerCredentialsAdditionalProperties"
    // InternalNormalJobContainerOneOf1Parser.g:1103:1: entryRuleContainerCredentialsAdditionalProperties returns [EObject current=null] : iv_ruleContainerCredentialsAdditionalProperties= ruleContainerCredentialsAdditionalProperties EOF ;
    public final EObject entryRuleContainerCredentialsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerCredentialsAdditionalProperties = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1103:81: (iv_ruleContainerCredentialsAdditionalProperties= ruleContainerCredentialsAdditionalProperties EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1104:2: iv_ruleContainerCredentialsAdditionalProperties= ruleContainerCredentialsAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerCredentialsAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerCredentialsAdditionalProperties=ruleContainerCredentialsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerCredentialsAdditionalProperties; 
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
    // $ANTLR end "entryRuleContainerCredentialsAdditionalProperties"


    // $ANTLR start "ruleContainerCredentialsAdditionalProperties"
    // InternalNormalJobContainerOneOf1Parser.g:1110:1: ruleContainerCredentialsAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleContainerCredentialsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1116:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1117:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1117:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1118:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1118:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:1119:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1119:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:1120:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerCredentialsAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerCredentialsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerCredentialsAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:1141:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalNormalJobContainerOneOf1Parser.g:1142:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1142:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalNormalJobContainerOneOf1Parser.g:1143:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerCredentialsAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerCredentialsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.JsonDocument");
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
    // $ANTLR end "ruleContainerCredentialsAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalNormalJobContainerOneOf1Parser.g:1164:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1164:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1165:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1171:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1177:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1178:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1178:2: ( (lv_value_0_0= ruleValue ) )
            // InternalNormalJobContainerOneOf1Parser.g:1179:3: (lv_value_0_0= ruleValue )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1179:3: (lv_value_0_0= ruleValue )
            // InternalNormalJobContainerOneOf1Parser.g:1180:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.Value");
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
    // InternalNormalJobContainerOneOf1Parser.g:1200:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1200:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1201:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1207:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1213:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1214:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1214:2: ( (lv_value_0_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:1215:3: (lv_value_0_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1215:3: (lv_value_0_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:1216:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.EString");
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
    // InternalNormalJobContainerOneOf1Parser.g:1236:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1236:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1237:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1243:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1249:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobContainerOneOf1Parser.g:1250:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1250:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobContainerOneOf1Parser.g:1251:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobContainerOneOf1Parser.g:1251:3: ()
            // InternalNormalJobContainerOneOf1Parser.g:1252:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:1262:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=Credentials && LA13_0<=True)||LA13_0==LeftSquareBracket||LA13_0==LeftCurlyBracket||(LA13_0>=RULE_STRING && LA13_0<=RULE_E_DOUBLE)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:1263:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:1263:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalNormalJobContainerOneOf1Parser.g:1264:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:1264:5: (lv_value_2_0= ruleValue )
                    // InternalNormalJobContainerOneOf1Parser.g:1265:6: lv_value_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
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
                      							"githubwf.githubwf.NormalJobContainerOneOf1.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobContainerOneOf1Parser.g:1282:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalNormalJobContainerOneOf1Parser.g:1283:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobContainerOneOf1Parser.g:1287:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalNormalJobContainerOneOf1Parser.g:1288:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalNormalJobContainerOneOf1Parser.g:1288:6: (lv_value_4_0= ruleValue )
                    	    // InternalNormalJobContainerOneOf1Parser.g:1289:7: lv_value_4_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
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
                    	      								"githubwf.githubwf.NormalJobContainerOneOf1.Value");
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
    // InternalNormalJobContainerOneOf1Parser.g:1316:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1316:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1317:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1323:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1329:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1330:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1330:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalNormalJobContainerOneOf1Parser.g:1331:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1331:3: (lv_value_0_0= ruleNullEnum )
            // InternalNormalJobContainerOneOf1Parser.g:1332:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.NullEnum");
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
    // InternalNormalJobContainerOneOf1Parser.g:1352:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1352:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1353:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1359:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1365:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1366:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1366:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalNormalJobContainerOneOf1Parser.g:1367:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1367:3: (lv_value_0_0= ruleEDouble )
            // InternalNormalJobContainerOneOf1Parser.g:1368:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.EDouble");
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
    // InternalNormalJobContainerOneOf1Parser.g:1388:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1388:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1389:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1395:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1401:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobContainerOneOf1Parser.g:1402:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1402:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobContainerOneOf1Parser.g:1403:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobContainerOneOf1Parser.g:1403:3: ()
            // InternalNormalJobContainerOneOf1Parser.g:1404:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:1414:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=Credentials && LA15_0<=Env)||LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:1415:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:1415:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalNormalJobContainerOneOf1Parser.g:1416:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:1416:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalNormalJobContainerOneOf1Parser.g:1417:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.NormalJobContainerOneOf1.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobContainerOneOf1Parser.g:1434:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalNormalJobContainerOneOf1Parser.g:1435:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobContainerOneOf1Parser.g:1439:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalNormalJobContainerOneOf1Parser.g:1440:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalNormalJobContainerOneOf1Parser.g:1440:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalNormalJobContainerOneOf1Parser.g:1441:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.NormalJobContainerOneOf1.KeyValuePair");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
    // InternalNormalJobContainerOneOf1Parser.g:1468:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1468:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1469:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1475:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1481:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1482:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1482:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalNormalJobContainerOneOf1Parser.g:1483:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1483:3: (lv_value_0_0= ruleEBoolean )
            // InternalNormalJobContainerOneOf1Parser.g:1484:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.EBoolean");
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
    // InternalNormalJobContainerOneOf1Parser.g:1504:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1504:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1505:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1511:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1517:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobContainerOneOf1Parser.g:1518:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1518:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_E_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_E_DOUBLE) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:1519:3: this_E_INT_0= RULE_E_INT
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
                    // InternalNormalJobContainerOneOf1Parser.g:1527:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalNormalJobContainerOneOf1Parser.g:1538:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1538:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1539:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1545:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1551:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1552:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1552:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1553:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1553:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:1554:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1554:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:1555:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.NormalJobContainerOneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:1576:3: ( (lv_value_2_0= ruleValue ) )
            // InternalNormalJobContainerOneOf1Parser.g:1577:4: (lv_value_2_0= ruleValue )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1577:4: (lv_value_2_0= ruleValue )
            // InternalNormalJobContainerOneOf1Parser.g:1578:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.NormalJobContainerOneOf1.Value");
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
    // InternalNormalJobContainerOneOf1Parser.g:1599:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1599:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1600:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1606:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1612:2: ( (kw= True | kw= False ) )
            // InternalNormalJobContainerOneOf1Parser.g:1613:2: (kw= True | kw= False )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1613:2: (kw= True | kw= False )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==True) ) {
                alt17=1;
            }
            else if ( (LA17_0==False) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:1614:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobContainerOneOf1Parser.g:1620:3: kw= False
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


    // $ANTLR start "entryRuleEnv"
    // InternalNormalJobContainerOneOf1Parser.g:1629:1: entryRuleEnv returns [EObject current=null] : iv_ruleEnv= ruleEnv EOF ;
    public final EObject entryRuleEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnv = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1629:44: (iv_ruleEnv= ruleEnv EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1630:2: iv_ruleEnv= ruleEnv EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1636:1: ruleEnv returns [EObject current=null] : ( (lv_env_0_0= ruleEnvAbstract ) ) ;
    public final EObject ruleEnv() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1642:2: ( ( (lv_env_0_0= ruleEnvAbstract ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1643:2: ( (lv_env_0_0= ruleEnvAbstract ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1643:2: ( (lv_env_0_0= ruleEnvAbstract ) )
            // InternalNormalJobContainerOneOf1Parser.g:1644:3: (lv_env_0_0= ruleEnvAbstract )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1644:3: (lv_env_0_0= ruleEnvAbstract )
            // InternalNormalJobContainerOneOf1Parser.g:1645:4: lv_env_0_0= ruleEnvAbstract
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.EnvAbstract");
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
    // InternalNormalJobContainerOneOf1Parser.g:1665:1: entryRuleEnvTypeString returns [EObject current=null] : iv_ruleEnvTypeString= ruleEnvTypeString EOF ;
    public final EObject entryRuleEnvTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeString = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1665:54: (iv_ruleEnvTypeString= ruleEnvTypeString EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1666:2: iv_ruleEnvTypeString= ruleEnvTypeString EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1672:1: ruleEnvTypeString returns [EObject current=null] : ( (lv_env_0_0= ruleEString ) ) ;
    public final EObject ruleEnvTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1678:2: ( ( (lv_env_0_0= ruleEString ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1679:2: ( (lv_env_0_0= ruleEString ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1679:2: ( (lv_env_0_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:1680:3: (lv_env_0_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1680:3: (lv_env_0_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:1681:4: lv_env_0_0= ruleEString
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.EString");
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
    // InternalNormalJobContainerOneOf1Parser.g:1701:1: entryRuleEnvTypeInteger returns [EObject current=null] : iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF ;
    public final EObject entryRuleEnvTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeInteger = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1701:55: (iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1702:2: iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1708:1: ruleEnvTypeInteger returns [EObject current=null] : ( (lv_env_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1714:2: ( ( (lv_env_0_0= ruleEDoubleObject ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1715:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1715:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            // InternalNormalJobContainerOneOf1Parser.g:1716:3: (lv_env_0_0= ruleEDoubleObject )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1716:3: (lv_env_0_0= ruleEDoubleObject )
            // InternalNormalJobContainerOneOf1Parser.g:1717:4: lv_env_0_0= ruleEDoubleObject
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.EDoubleObject");
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
    // InternalNormalJobContainerOneOf1Parser.g:1737:1: entryRuleEnvTypeNumber returns [EObject current=null] : iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF ;
    public final EObject entryRuleEnvTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeNumber = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1737:54: (iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1738:2: iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1744:1: ruleEnvTypeNumber returns [EObject current=null] : ( (lv_env_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1750:2: ( ( (lv_env_0_0= ruleEDoubleObject ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1751:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1751:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            // InternalNormalJobContainerOneOf1Parser.g:1752:3: (lv_env_0_0= ruleEDoubleObject )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1752:3: (lv_env_0_0= ruleEDoubleObject )
            // InternalNormalJobContainerOneOf1Parser.g:1753:4: lv_env_0_0= ruleEDoubleObject
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.EDoubleObject");
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
    // InternalNormalJobContainerOneOf1Parser.g:1773:1: entryRuleEnvTypeBoolean returns [EObject current=null] : iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF ;
    public final EObject entryRuleEnvTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeBoolean = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1773:55: (iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1774:2: iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1780:1: ruleEnvTypeBoolean returns [EObject current=null] : ( (lv_env_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleEnvTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1786:2: ( ( (lv_env_0_0= ruleEBooleanObject ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1787:2: ( (lv_env_0_0= ruleEBooleanObject ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1787:2: ( (lv_env_0_0= ruleEBooleanObject ) )
            // InternalNormalJobContainerOneOf1Parser.g:1788:3: (lv_env_0_0= ruleEBooleanObject )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1788:3: (lv_env_0_0= ruleEBooleanObject )
            // InternalNormalJobContainerOneOf1Parser.g:1789:4: lv_env_0_0= ruleEBooleanObject
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.EBooleanObject");
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
    // InternalNormalJobContainerOneOf1Parser.g:1809:1: entryRuleEnvTypeObject returns [EObject current=null] : iv_ruleEnvTypeObject= ruleEnvTypeObject EOF ;
    public final EObject entryRuleEnvTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeObject = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1809:54: (iv_ruleEnvTypeObject= ruleEnvTypeObject EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1810:2: iv_ruleEnvTypeObject= ruleEnvTypeObject EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1816:1: ruleEnvTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleEnvTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1822:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobContainerOneOf1Parser.g:1823:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1823:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobContainerOneOf1Parser.g:1824:3: () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobContainerOneOf1Parser.g:1824:3: ()
            // InternalNormalJobContainerOneOf1Parser.g:1825:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvTypeObjectAccess().getEnvTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:1835:3: ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=Credentials && LA19_0<=Env)||LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:1836:4: ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:1836:4: ( (lv_env_2_0= ruleEnvPropertiesAbstract ) )
                    // InternalNormalJobContainerOneOf1Parser.g:1837:5: (lv_env_2_0= ruleEnvPropertiesAbstract )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:1837:5: (lv_env_2_0= ruleEnvPropertiesAbstract )
                    // InternalNormalJobContainerOneOf1Parser.g:1838:6: lv_env_2_0= ruleEnvPropertiesAbstract
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
                      							"githubwf.githubwf.NormalJobContainerOneOf1.EnvPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobContainerOneOf1Parser.g:1855:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalNormalJobContainerOneOf1Parser.g:1856:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobContainerOneOf1Parser.g:1860:5: ( (lv_env_4_0= ruleEnvPropertiesAbstract ) )
                    	    // InternalNormalJobContainerOneOf1Parser.g:1861:6: (lv_env_4_0= ruleEnvPropertiesAbstract )
                    	    {
                    	    // InternalNormalJobContainerOneOf1Parser.g:1861:6: (lv_env_4_0= ruleEnvPropertiesAbstract )
                    	    // InternalNormalJobContainerOneOf1Parser.g:1862:7: lv_env_4_0= ruleEnvPropertiesAbstract
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
                    	      								"githubwf.githubwf.NormalJobContainerOneOf1.EnvPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
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
    // InternalNormalJobContainerOneOf1Parser.g:1889:1: entryRuleEnvTypeArray returns [EObject current=null] : iv_ruleEnvTypeArray= ruleEnvTypeArray EOF ;
    public final EObject entryRuleEnvTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeArray = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1889:53: (iv_ruleEnvTypeArray= ruleEnvTypeArray EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1890:2: iv_ruleEnvTypeArray= ruleEnvTypeArray EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1896:1: ruleEnvTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleEnvTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1902:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobContainerOneOf1Parser.g:1903:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1903:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobContainerOneOf1Parser.g:1904:3: () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobContainerOneOf1Parser.g:1904:3: ()
            // InternalNormalJobContainerOneOf1Parser.g:1905:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvTypeArrayAccess().getEnvTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:1915:3: ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=Credentials && LA21_0<=True)||LA21_0==LeftSquareBracket||LA21_0==LeftCurlyBracket||(LA21_0>=RULE_STRING && LA21_0<=RULE_E_DOUBLE)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:1916:4: ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )*
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:1916:4: ( (lv_env_2_0= ruleEnvItems ) )
                    // InternalNormalJobContainerOneOf1Parser.g:1917:5: (lv_env_2_0= ruleEnvItems )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:1917:5: (lv_env_2_0= ruleEnvItems )
                    // InternalNormalJobContainerOneOf1Parser.g:1918:6: lv_env_2_0= ruleEnvItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvTypeArrayAccess().getEnvEnvItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
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
                      							"githubwf.githubwf.NormalJobContainerOneOf1.EnvItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobContainerOneOf1Parser.g:1935:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Comma) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalNormalJobContainerOneOf1Parser.g:1936:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobContainerOneOf1Parser.g:1940:5: ( (lv_env_4_0= ruleEnvItems ) )
                    	    // InternalNormalJobContainerOneOf1Parser.g:1941:6: (lv_env_4_0= ruleEnvItems )
                    	    {
                    	    // InternalNormalJobContainerOneOf1Parser.g:1941:6: (lv_env_4_0= ruleEnvItems )
                    	    // InternalNormalJobContainerOneOf1Parser.g:1942:7: lv_env_4_0= ruleEnvItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvTypeArrayAccess().getEnvEnvItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
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
                    	      								"githubwf.githubwf.NormalJobContainerOneOf1.EnvItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
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
    // InternalNormalJobContainerOneOf1Parser.g:1969:1: entryRuleEnvTypeNull returns [EObject current=null] : iv_ruleEnvTypeNull= ruleEnvTypeNull EOF ;
    public final EObject entryRuleEnvTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeNull = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:1969:52: (iv_ruleEnvTypeNull= ruleEnvTypeNull EOF )
            // InternalNormalJobContainerOneOf1Parser.g:1970:2: iv_ruleEnvTypeNull= ruleEnvTypeNull EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:1976:1: ruleEnvTypeNull returns [EObject current=null] : ( (lv_env_0_0= ruleNullValue ) ) ;
    public final EObject ruleEnvTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:1982:2: ( ( (lv_env_0_0= ruleNullValue ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:1983:2: ( (lv_env_0_0= ruleNullValue ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1983:2: ( (lv_env_0_0= ruleNullValue ) )
            // InternalNormalJobContainerOneOf1Parser.g:1984:3: (lv_env_0_0= ruleNullValue )
            {
            // InternalNormalJobContainerOneOf1Parser.g:1984:3: (lv_env_0_0= ruleNullValue )
            // InternalNormalJobContainerOneOf1Parser.g:1985:4: lv_env_0_0= ruleNullValue
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.NullValue");
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


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalNormalJobContainerOneOf1Parser.g:2005:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2005:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2006:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:2012:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2018:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobContainerOneOf1Parser.g:2019:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2019:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_E_INT) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_E_DOUBLE) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:2020:3: this_E_INT_0= RULE_E_INT
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
                    // InternalNormalJobContainerOneOf1Parser.g:2028:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalNormalJobContainerOneOf1Parser.g:2039:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2039:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2040:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:2046:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2052:2: ( (kw= True | kw= False ) )
            // InternalNormalJobContainerOneOf1Parser.g:2053:2: (kw= True | kw= False )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2053:2: (kw= True | kw= False )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==True) ) {
                alt23=1;
            }
            else if ( (LA23_0==False) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:2054:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobContainerOneOf1Parser.g:2060:3: kw= False
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
    // InternalNormalJobContainerOneOf1Parser.g:2069:1: entryRuleEnvAdditionalProperties returns [EObject current=null] : iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF ;
    public final EObject entryRuleEnvAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvAdditionalProperties = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2069:64: (iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2070:2: iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:2076:1: ruleEnvAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleEnvAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2082:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2083:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2083:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2084:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2084:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:2085:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2085:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:2086:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.NormalJobContainerOneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:2107:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalNormalJobContainerOneOf1Parser.g:2108:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2108:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalNormalJobContainerOneOf1Parser.g:2109:5: lv_additionalProperties_2_0= ruleJsonDocument
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
              						"githubwf.githubwf.NormalJobContainerOneOf1.JsonDocument");
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
    // InternalNormalJobContainerOneOf1Parser.g:2130:1: entryRuleEnvItems returns [EObject current=null] : iv_ruleEnvItems= ruleEnvItems EOF ;
    public final EObject entryRuleEnvItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvItems = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2130:49: (iv_ruleEnvItems= ruleEnvItems EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2131:2: iv_ruleEnvItems= ruleEnvItems EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:2137:1: ruleEnvItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleEnvItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2143:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2144:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2144:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalNormalJobContainerOneOf1Parser.g:2145:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2145:3: (lv_items_0_0= ruleJsonDocument )
            // InternalNormalJobContainerOneOf1Parser.g:2146:4: lv_items_0_0= ruleJsonDocument
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
              					"githubwf.githubwf.NormalJobContainerOneOf1.JsonDocument");
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


    // $ANTLR start "entryRuleContainerPortsItems"
    // InternalNormalJobContainerOneOf1Parser.g:2166:1: entryRuleContainerPortsItems returns [EObject current=null] : iv_ruleContainerPortsItems= ruleContainerPortsItems EOF ;
    public final EObject entryRuleContainerPortsItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItems = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2166:60: (iv_ruleContainerPortsItems= ruleContainerPortsItems EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2167:2: iv_ruleContainerPortsItems= ruleContainerPortsItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItems=ruleContainerPortsItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItems; 
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
    // $ANTLR end "entryRuleContainerPortsItems"


    // $ANTLR start "ruleContainerPortsItems"
    // InternalNormalJobContainerOneOf1Parser.g:2173:1: ruleContainerPortsItems returns [EObject current=null] : ( (lv_items_0_0= ruleContainerPortsItemsAbstract ) ) ;
    public final EObject ruleContainerPortsItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2179:2: ( ( (lv_items_0_0= ruleContainerPortsItemsAbstract ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2180:2: ( (lv_items_0_0= ruleContainerPortsItemsAbstract ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2180:2: ( (lv_items_0_0= ruleContainerPortsItemsAbstract ) )
            // InternalNormalJobContainerOneOf1Parser.g:2181:3: (lv_items_0_0= ruleContainerPortsItemsAbstract )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2181:3: (lv_items_0_0= ruleContainerPortsItemsAbstract )
            // InternalNormalJobContainerOneOf1Parser.g:2182:4: lv_items_0_0= ruleContainerPortsItemsAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getContainerPortsItemsAccess().getItemsContainerPortsItemsAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleContainerPortsItemsAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getContainerPortsItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobContainerOneOf1.ContainerPortsItemsAbstract");
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
    // $ANTLR end "ruleContainerPortsItems"


    // $ANTLR start "entryRuleContainerPortsItemsTypeString"
    // InternalNormalJobContainerOneOf1Parser.g:2202:1: entryRuleContainerPortsItemsTypeString returns [EObject current=null] : iv_ruleContainerPortsItemsTypeString= ruleContainerPortsItemsTypeString EOF ;
    public final EObject entryRuleContainerPortsItemsTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsTypeString = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2202:70: (iv_ruleContainerPortsItemsTypeString= ruleContainerPortsItemsTypeString EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2203:2: iv_ruleContainerPortsItemsTypeString= ruleContainerPortsItemsTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsTypeString=ruleContainerPortsItemsTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsTypeString; 
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
    // $ANTLR end "entryRuleContainerPortsItemsTypeString"


    // $ANTLR start "ruleContainerPortsItemsTypeString"
    // InternalNormalJobContainerOneOf1Parser.g:2209:1: ruleContainerPortsItemsTypeString returns [EObject current=null] : ( (lv_items_0_0= ruleEString ) ) ;
    public final EObject ruleContainerPortsItemsTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2215:2: ( ( (lv_items_0_0= ruleEString ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2216:2: ( (lv_items_0_0= ruleEString ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2216:2: ( (lv_items_0_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:2217:3: (lv_items_0_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2217:3: (lv_items_0_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:2218:4: lv_items_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getContainerPortsItemsTypeStringAccess().getItemsEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getContainerPortsItemsTypeStringRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobContainerOneOf1.EString");
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
    // $ANTLR end "ruleContainerPortsItemsTypeString"


    // $ANTLR start "entryRuleContainerPortsItemsTypeInteger"
    // InternalNormalJobContainerOneOf1Parser.g:2238:1: entryRuleContainerPortsItemsTypeInteger returns [EObject current=null] : iv_ruleContainerPortsItemsTypeInteger= ruleContainerPortsItemsTypeInteger EOF ;
    public final EObject entryRuleContainerPortsItemsTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsTypeInteger = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2238:71: (iv_ruleContainerPortsItemsTypeInteger= ruleContainerPortsItemsTypeInteger EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2239:2: iv_ruleContainerPortsItemsTypeInteger= ruleContainerPortsItemsTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsTypeInteger=ruleContainerPortsItemsTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsTypeInteger; 
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
    // $ANTLR end "entryRuleContainerPortsItemsTypeInteger"


    // $ANTLR start "ruleContainerPortsItemsTypeInteger"
    // InternalNormalJobContainerOneOf1Parser.g:2245:1: ruleContainerPortsItemsTypeInteger returns [EObject current=null] : ( (lv_items_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleContainerPortsItemsTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2251:2: ( ( (lv_items_0_0= ruleEDoubleObject ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2252:2: ( (lv_items_0_0= ruleEDoubleObject ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2252:2: ( (lv_items_0_0= ruleEDoubleObject ) )
            // InternalNormalJobContainerOneOf1Parser.g:2253:3: (lv_items_0_0= ruleEDoubleObject )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2253:3: (lv_items_0_0= ruleEDoubleObject )
            // InternalNormalJobContainerOneOf1Parser.g:2254:4: lv_items_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getContainerPortsItemsTypeIntegerAccess().getItemsEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getContainerPortsItemsTypeIntegerRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobContainerOneOf1.EDoubleObject");
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
    // $ANTLR end "ruleContainerPortsItemsTypeInteger"


    // $ANTLR start "entryRuleContainerPortsItemsTypeNumber"
    // InternalNormalJobContainerOneOf1Parser.g:2274:1: entryRuleContainerPortsItemsTypeNumber returns [EObject current=null] : iv_ruleContainerPortsItemsTypeNumber= ruleContainerPortsItemsTypeNumber EOF ;
    public final EObject entryRuleContainerPortsItemsTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsTypeNumber = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2274:70: (iv_ruleContainerPortsItemsTypeNumber= ruleContainerPortsItemsTypeNumber EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2275:2: iv_ruleContainerPortsItemsTypeNumber= ruleContainerPortsItemsTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsTypeNumber=ruleContainerPortsItemsTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsTypeNumber; 
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
    // $ANTLR end "entryRuleContainerPortsItemsTypeNumber"


    // $ANTLR start "ruleContainerPortsItemsTypeNumber"
    // InternalNormalJobContainerOneOf1Parser.g:2281:1: ruleContainerPortsItemsTypeNumber returns [EObject current=null] : ( (lv_items_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleContainerPortsItemsTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2287:2: ( ( (lv_items_0_0= ruleEDoubleObject ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2288:2: ( (lv_items_0_0= ruleEDoubleObject ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2288:2: ( (lv_items_0_0= ruleEDoubleObject ) )
            // InternalNormalJobContainerOneOf1Parser.g:2289:3: (lv_items_0_0= ruleEDoubleObject )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2289:3: (lv_items_0_0= ruleEDoubleObject )
            // InternalNormalJobContainerOneOf1Parser.g:2290:4: lv_items_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getContainerPortsItemsTypeNumberAccess().getItemsEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getContainerPortsItemsTypeNumberRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobContainerOneOf1.EDoubleObject");
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
    // $ANTLR end "ruleContainerPortsItemsTypeNumber"


    // $ANTLR start "entryRuleContainerPortsItemsTypeBoolean"
    // InternalNormalJobContainerOneOf1Parser.g:2310:1: entryRuleContainerPortsItemsTypeBoolean returns [EObject current=null] : iv_ruleContainerPortsItemsTypeBoolean= ruleContainerPortsItemsTypeBoolean EOF ;
    public final EObject entryRuleContainerPortsItemsTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsTypeBoolean = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2310:71: (iv_ruleContainerPortsItemsTypeBoolean= ruleContainerPortsItemsTypeBoolean EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2311:2: iv_ruleContainerPortsItemsTypeBoolean= ruleContainerPortsItemsTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsTypeBoolean=ruleContainerPortsItemsTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsTypeBoolean; 
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
    // $ANTLR end "entryRuleContainerPortsItemsTypeBoolean"


    // $ANTLR start "ruleContainerPortsItemsTypeBoolean"
    // InternalNormalJobContainerOneOf1Parser.g:2317:1: ruleContainerPortsItemsTypeBoolean returns [EObject current=null] : ( (lv_items_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleContainerPortsItemsTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2323:2: ( ( (lv_items_0_0= ruleEBooleanObject ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2324:2: ( (lv_items_0_0= ruleEBooleanObject ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2324:2: ( (lv_items_0_0= ruleEBooleanObject ) )
            // InternalNormalJobContainerOneOf1Parser.g:2325:3: (lv_items_0_0= ruleEBooleanObject )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2325:3: (lv_items_0_0= ruleEBooleanObject )
            // InternalNormalJobContainerOneOf1Parser.g:2326:4: lv_items_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getContainerPortsItemsTypeBooleanAccess().getItemsEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getContainerPortsItemsTypeBooleanRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobContainerOneOf1.EBooleanObject");
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
    // $ANTLR end "ruleContainerPortsItemsTypeBoolean"


    // $ANTLR start "entryRuleContainerPortsItemsTypeObject"
    // InternalNormalJobContainerOneOf1Parser.g:2346:1: entryRuleContainerPortsItemsTypeObject returns [EObject current=null] : iv_ruleContainerPortsItemsTypeObject= ruleContainerPortsItemsTypeObject EOF ;
    public final EObject entryRuleContainerPortsItemsTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsTypeObject = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2346:70: (iv_ruleContainerPortsItemsTypeObject= ruleContainerPortsItemsTypeObject EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2347:2: iv_ruleContainerPortsItemsTypeObject= ruleContainerPortsItemsTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsTypeObject=ruleContainerPortsItemsTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsTypeObject; 
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
    // $ANTLR end "entryRuleContainerPortsItemsTypeObject"


    // $ANTLR start "ruleContainerPortsItemsTypeObject"
    // InternalNormalJobContainerOneOf1Parser.g:2353:1: ruleContainerPortsItemsTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleContainerPortsItemsTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2359:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobContainerOneOf1Parser.g:2360:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2360:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobContainerOneOf1Parser.g:2361:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobContainerOneOf1Parser.g:2361:3: ()
            // InternalNormalJobContainerOneOf1Parser.g:2362:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContainerPortsItemsTypeObjectAccess().getContainerPortsItemsTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerPortsItemsTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:2372:3: ( ( (lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=Credentials && LA25_0<=Env)||LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:2373:4: ( (lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:2373:4: ( (lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract ) )
                    // InternalNormalJobContainerOneOf1Parser.g:2374:5: (lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:2374:5: (lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract )
                    // InternalNormalJobContainerOneOf1Parser.g:2375:6: lv_items_2_0= ruleContainerPortsItemsPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainerPortsItemsTypeObjectAccess().getItemsContainerPortsItemsPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_items_2_0=ruleContainerPortsItemsPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getContainerPortsItemsTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"items",
                      							lv_items_2_0,
                      							"githubwf.githubwf.NormalJobContainerOneOf1.ContainerPortsItemsPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobContainerOneOf1Parser.g:2392:4: (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalNormalJobContainerOneOf1Parser.g:2393:5: otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getContainerPortsItemsTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobContainerOneOf1Parser.g:2397:5: ( (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract ) )
                    	    // InternalNormalJobContainerOneOf1Parser.g:2398:6: (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract )
                    	    {
                    	    // InternalNormalJobContainerOneOf1Parser.g:2398:6: (lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract )
                    	    // InternalNormalJobContainerOneOf1Parser.g:2399:7: lv_items_4_0= ruleContainerPortsItemsPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainerPortsItemsTypeObjectAccess().getItemsContainerPortsItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_items_4_0=ruleContainerPortsItemsPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getContainerPortsItemsTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"items",
                    	      								lv_items_4_0,
                    	      								"githubwf.githubwf.NormalJobContainerOneOf1.ContainerPortsItemsPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getContainerPortsItemsTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleContainerPortsItemsTypeObject"


    // $ANTLR start "entryRuleContainerPortsItemsTypeArray"
    // InternalNormalJobContainerOneOf1Parser.g:2426:1: entryRuleContainerPortsItemsTypeArray returns [EObject current=null] : iv_ruleContainerPortsItemsTypeArray= ruleContainerPortsItemsTypeArray EOF ;
    public final EObject entryRuleContainerPortsItemsTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsTypeArray = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2426:69: (iv_ruleContainerPortsItemsTypeArray= ruleContainerPortsItemsTypeArray EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2427:2: iv_ruleContainerPortsItemsTypeArray= ruleContainerPortsItemsTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsTypeArray=ruleContainerPortsItemsTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsTypeArray; 
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
    // $ANTLR end "entryRuleContainerPortsItemsTypeArray"


    // $ANTLR start "ruleContainerPortsItemsTypeArray"
    // InternalNormalJobContainerOneOf1Parser.g:2433:1: ruleContainerPortsItemsTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_items_2_0= ruleContainerPortsItemsItems ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleContainerPortsItemsTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2439:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_items_2_0= ruleContainerPortsItemsItems ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobContainerOneOf1Parser.g:2440:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_items_2_0= ruleContainerPortsItemsItems ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2440:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_items_2_0= ruleContainerPortsItemsItems ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobContainerOneOf1Parser.g:2441:3: () otherlv_1= LeftSquareBracket ( ( (lv_items_2_0= ruleContainerPortsItemsItems ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobContainerOneOf1Parser.g:2441:3: ()
            // InternalNormalJobContainerOneOf1Parser.g:2442:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContainerPortsItemsTypeArrayAccess().getContainerPortsItemsTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerPortsItemsTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:2452:3: ( ( (lv_items_2_0= ruleContainerPortsItemsItems ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsItems ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=Credentials && LA27_0<=True)||LA27_0==LeftSquareBracket||LA27_0==LeftCurlyBracket||(LA27_0>=RULE_STRING && LA27_0<=RULE_E_DOUBLE)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:2453:4: ( (lv_items_2_0= ruleContainerPortsItemsItems ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsItems ) ) )*
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:2453:4: ( (lv_items_2_0= ruleContainerPortsItemsItems ) )
                    // InternalNormalJobContainerOneOf1Parser.g:2454:5: (lv_items_2_0= ruleContainerPortsItemsItems )
                    {
                    // InternalNormalJobContainerOneOf1Parser.g:2454:5: (lv_items_2_0= ruleContainerPortsItemsItems )
                    // InternalNormalJobContainerOneOf1Parser.g:2455:6: lv_items_2_0= ruleContainerPortsItemsItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getContainerPortsItemsTypeArrayAccess().getItemsContainerPortsItemsItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_items_2_0=ruleContainerPortsItemsItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getContainerPortsItemsTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"items",
                      							lv_items_2_0,
                      							"githubwf.githubwf.NormalJobContainerOneOf1.ContainerPortsItemsItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobContainerOneOf1Parser.g:2472:4: (otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsItems ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==Comma) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalNormalJobContainerOneOf1Parser.g:2473:5: otherlv_3= Comma ( (lv_items_4_0= ruleContainerPortsItemsItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getContainerPortsItemsTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobContainerOneOf1Parser.g:2477:5: ( (lv_items_4_0= ruleContainerPortsItemsItems ) )
                    	    // InternalNormalJobContainerOneOf1Parser.g:2478:6: (lv_items_4_0= ruleContainerPortsItemsItems )
                    	    {
                    	    // InternalNormalJobContainerOneOf1Parser.g:2478:6: (lv_items_4_0= ruleContainerPortsItemsItems )
                    	    // InternalNormalJobContainerOneOf1Parser.g:2479:7: lv_items_4_0= ruleContainerPortsItemsItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getContainerPortsItemsTypeArrayAccess().getItemsContainerPortsItemsItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_items_4_0=ruleContainerPortsItemsItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getContainerPortsItemsTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"items",
                    	      								lv_items_4_0,
                    	      								"githubwf.githubwf.NormalJobContainerOneOf1.ContainerPortsItemsItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getContainerPortsItemsTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleContainerPortsItemsTypeArray"


    // $ANTLR start "entryRuleContainerPortsItemsTypeNull"
    // InternalNormalJobContainerOneOf1Parser.g:2506:1: entryRuleContainerPortsItemsTypeNull returns [EObject current=null] : iv_ruleContainerPortsItemsTypeNull= ruleContainerPortsItemsTypeNull EOF ;
    public final EObject entryRuleContainerPortsItemsTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsTypeNull = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2506:68: (iv_ruleContainerPortsItemsTypeNull= ruleContainerPortsItemsTypeNull EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2507:2: iv_ruleContainerPortsItemsTypeNull= ruleContainerPortsItemsTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsTypeNull=ruleContainerPortsItemsTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsTypeNull; 
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
    // $ANTLR end "entryRuleContainerPortsItemsTypeNull"


    // $ANTLR start "ruleContainerPortsItemsTypeNull"
    // InternalNormalJobContainerOneOf1Parser.g:2513:1: ruleContainerPortsItemsTypeNull returns [EObject current=null] : ( (lv_items_0_0= ruleNullValue ) ) ;
    public final EObject ruleContainerPortsItemsTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2519:2: ( ( (lv_items_0_0= ruleNullValue ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2520:2: ( (lv_items_0_0= ruleNullValue ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2520:2: ( (lv_items_0_0= ruleNullValue ) )
            // InternalNormalJobContainerOneOf1Parser.g:2521:3: (lv_items_0_0= ruleNullValue )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2521:3: (lv_items_0_0= ruleNullValue )
            // InternalNormalJobContainerOneOf1Parser.g:2522:4: lv_items_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getContainerPortsItemsTypeNullAccess().getItemsNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getContainerPortsItemsTypeNullRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobContainerOneOf1.NullValue");
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
    // $ANTLR end "ruleContainerPortsItemsTypeNull"


    // $ANTLR start "entryRuleContainerPortsItemsAdditionalProperties"
    // InternalNormalJobContainerOneOf1Parser.g:2542:1: entryRuleContainerPortsItemsAdditionalProperties returns [EObject current=null] : iv_ruleContainerPortsItemsAdditionalProperties= ruleContainerPortsItemsAdditionalProperties EOF ;
    public final EObject entryRuleContainerPortsItemsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsAdditionalProperties = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2542:80: (iv_ruleContainerPortsItemsAdditionalProperties= ruleContainerPortsItemsAdditionalProperties EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2543:2: iv_ruleContainerPortsItemsAdditionalProperties= ruleContainerPortsItemsAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsAdditionalProperties=ruleContainerPortsItemsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsAdditionalProperties; 
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
    // $ANTLR end "entryRuleContainerPortsItemsAdditionalProperties"


    // $ANTLR start "ruleContainerPortsItemsAdditionalProperties"
    // InternalNormalJobContainerOneOf1Parser.g:2549:1: ruleContainerPortsItemsAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleContainerPortsItemsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2555:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2556:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2556:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2557:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2557:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:2558:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2558:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:2559:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerPortsItemsAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerPortsItemsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainerPortsItemsAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobContainerOneOf1Parser.g:2580:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalNormalJobContainerOneOf1Parser.g:2581:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2581:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalNormalJobContainerOneOf1Parser.g:2582:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainerPortsItemsAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainerPortsItemsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.NormalJobContainerOneOf1.JsonDocument");
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
    // $ANTLR end "ruleContainerPortsItemsAdditionalProperties"


    // $ANTLR start "entryRuleContainerPortsItemsItems"
    // InternalNormalJobContainerOneOf1Parser.g:2603:1: entryRuleContainerPortsItemsItems returns [EObject current=null] : iv_ruleContainerPortsItemsItems= ruleContainerPortsItemsItems EOF ;
    public final EObject entryRuleContainerPortsItemsItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerPortsItemsItems = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2603:65: (iv_ruleContainerPortsItemsItems= ruleContainerPortsItemsItems EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2604:2: iv_ruleContainerPortsItemsItems= ruleContainerPortsItemsItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerPortsItemsItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerPortsItemsItems=ruleContainerPortsItemsItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerPortsItemsItems; 
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
    // $ANTLR end "entryRuleContainerPortsItemsItems"


    // $ANTLR start "ruleContainerPortsItemsItems"
    // InternalNormalJobContainerOneOf1Parser.g:2610:1: ruleContainerPortsItemsItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleContainerPortsItemsItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2616:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2617:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2617:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalNormalJobContainerOneOf1Parser.g:2618:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2618:3: (lv_items_0_0= ruleJsonDocument )
            // InternalNormalJobContainerOneOf1Parser.g:2619:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getContainerPortsItemsItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getContainerPortsItemsItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobContainerOneOf1.JsonDocument");
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
    // $ANTLR end "ruleContainerPortsItemsItems"


    // $ANTLR start "entryRuleContainerVolumesItems"
    // InternalNormalJobContainerOneOf1Parser.g:2639:1: entryRuleContainerVolumesItems returns [EObject current=null] : iv_ruleContainerVolumesItems= ruleContainerVolumesItems EOF ;
    public final EObject entryRuleContainerVolumesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerVolumesItems = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2639:62: (iv_ruleContainerVolumesItems= ruleContainerVolumesItems EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2640:2: iv_ruleContainerVolumesItems= ruleContainerVolumesItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerVolumesItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerVolumesItems=ruleContainerVolumesItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerVolumesItems; 
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
    // $ANTLR end "entryRuleContainerVolumesItems"


    // $ANTLR start "ruleContainerVolumesItems"
    // InternalNormalJobContainerOneOf1Parser.g:2646:1: ruleContainerVolumesItems returns [EObject current=null] : ( (lv_items_0_0= ruleEString ) ) ;
    public final EObject ruleContainerVolumesItems() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2652:2: ( ( (lv_items_0_0= ruleEString ) ) )
            // InternalNormalJobContainerOneOf1Parser.g:2653:2: ( (lv_items_0_0= ruleEString ) )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2653:2: ( (lv_items_0_0= ruleEString ) )
            // InternalNormalJobContainerOneOf1Parser.g:2654:3: (lv_items_0_0= ruleEString )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2654:3: (lv_items_0_0= ruleEString )
            // InternalNormalJobContainerOneOf1Parser.g:2655:4: lv_items_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getContainerVolumesItemsAccess().getItemsEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getContainerVolumesItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobContainerOneOf1.EString");
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
    // $ANTLR end "ruleContainerVolumesItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalNormalJobContainerOneOf1Parser.g:2675:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2675:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2676:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:2682:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2688:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalNormalJobContainerOneOf1Parser.g:2689:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2689:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=Credentials && LA28_0<=Env)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:2690:3: this_STRING_0= RULE_STRING
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
                    // InternalNormalJobContainerOneOf1Parser.g:2698:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalNormalJobContainerOneOf1Parser.g:2712:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalNormalJobContainerOneOf1Parser.g:2712:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalNormalJobContainerOneOf1Parser.g:2713:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalNormalJobContainerOneOf1Parser.g:2719:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Container | kw= Image | kw= Password | kw= Credentials | kw= Volumes | kw= Options | kw= Env | kw= Ports | kw= Username ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2725:2: ( (kw= Container | kw= Image | kw= Password | kw= Credentials | kw= Volumes | kw= Options | kw= Env | kw= Ports | kw= Username ) )
            // InternalNormalJobContainerOneOf1Parser.g:2726:2: (kw= Container | kw= Image | kw= Password | kw= Credentials | kw= Volumes | kw= Options | kw= Env | kw= Ports | kw= Username )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2726:2: (kw= Container | kw= Image | kw= Password | kw= Credentials | kw= Volumes | kw= Options | kw= Env | kw= Ports | kw= Username )
            int alt29=9;
            switch ( input.LA(1) ) {
            case Container:
                {
                alt29=1;
                }
                break;
            case Image:
                {
                alt29=2;
                }
                break;
            case Password:
                {
                alt29=3;
                }
                break;
            case Credentials:
                {
                alt29=4;
                }
                break;
            case Volumes:
                {
                alt29=5;
                }
                break;
            case Options:
                {
                alt29=6;
                }
                break;
            case Env:
                {
                alt29=7;
                }
                break;
            case Ports:
                {
                alt29=8;
                }
                break;
            case Username:
                {
                alt29=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalNormalJobContainerOneOf1Parser.g:2727:3: kw= Container
                    {
                    kw=(Token)match(input,Container,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getContainerKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobContainerOneOf1Parser.g:2733:3: kw= Image
                    {
                    kw=(Token)match(input,Image,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getImageKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobContainerOneOf1Parser.g:2739:3: kw= Password
                    {
                    kw=(Token)match(input,Password,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPasswordKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobContainerOneOf1Parser.g:2745:3: kw= Credentials
                    {
                    kw=(Token)match(input,Credentials,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getCredentialsKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobContainerOneOf1Parser.g:2751:3: kw= Volumes
                    {
                    kw=(Token)match(input,Volumes,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getVolumesKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobContainerOneOf1Parser.g:2757:3: kw= Options
                    {
                    kw=(Token)match(input,Options,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOptionsKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNormalJobContainerOneOf1Parser.g:2763:3: kw= Env
                    {
                    kw=(Token)match(input,Env,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnvKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNormalJobContainerOneOf1Parser.g:2769:3: kw= Ports
                    {
                    kw=(Token)match(input,Ports,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPortsKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalNormalJobContainerOneOf1Parser.g:2775:3: kw= Username
                    {
                    kw=(Token)match(input,Username,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getUsernameKeyword_8());
                      		
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
    // InternalNormalJobContainerOneOf1Parser.g:2784:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalNormalJobContainerOneOf1Parser.g:2790:2: ( (enumLiteral_0= Null ) )
            // InternalNormalJobContainerOneOf1Parser.g:2791:2: (enumLiteral_0= Null )
            {
            // InternalNormalJobContainerOneOf1Parser.g:2791:2: (enumLiteral_0= Null )
            // InternalNormalJobContainerOneOf1Parser.g:2792:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalNormalJobContainerOneOf1Parser
    public final void synpred1_InternalNormalJobContainerOneOf1Parser_fragment() throws RecognitionException {   
        // InternalNormalJobContainerOneOf1Parser.g:210:4: ( ruleContainerCredentialsAdditionalProperties )
        // InternalNormalJobContainerOneOf1Parser.g:210:5: ruleContainerCredentialsAdditionalProperties
        {
        pushFollow(FOLLOW_2);
        ruleContainerCredentialsAdditionalProperties();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalNormalJobContainerOneOf1Parser

    // $ANTLR start synpred2_InternalNormalJobContainerOneOf1Parser
    public final void synpred2_InternalNormalJobContainerOneOf1Parser_fragment() throws RecognitionException {   
        // InternalNormalJobContainerOneOf1Parser.g:312:4: ( ruleEnvTypeNumber )
        // InternalNormalJobContainerOneOf1Parser.g:312:5: ruleEnvTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleEnvTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalNormalJobContainerOneOf1Parser

    // $ANTLR start synpred4_InternalNormalJobContainerOneOf1Parser
    public final void synpred4_InternalNormalJobContainerOneOf1Parser_fragment() throws RecognitionException {   
        // InternalNormalJobContainerOneOf1Parser.g:424:4: ( ruleContainerPortsItemsTypeNumber )
        // InternalNormalJobContainerOneOf1Parser.g:424:5: ruleContainerPortsItemsTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleContainerPortsItemsTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalNormalJobContainerOneOf1Parser

    // Delegated rules

    public final boolean synpred4_InternalNormalJobContainerOneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalNormalJobContainerOneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalNormalJobContainerOneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalNormalJobContainerOneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalNormalJobContainerOneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalNormalJobContainerOneOf1Parser_fragment(); // can never throw exception
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
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\52\uffff";
    static final String dfa_2s = "\1\4\2\21\10\uffff\2\4\12\0\7\uffff\12\0\2\uffff";
    static final String dfa_3s = "\1\27\2\21\10\uffff\2\31\12\0\7\uffff\12\0\2\uffff";
    static final String dfa_4s = "\3\uffff\10\3\14\uffff\7\3\12\uffff\1\1\1\2";
    static final String dfa_5s = "\1\22\12\uffff\1\10\1\7\1\23\1\4\1\13\1\20\1\0\1\5\1\14\1\21\1\1\1\6\7\uffff\1\15\1\24\1\2\1\11\1\16\1\25\1\3\1\12\1\17\1\26\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\4\1\2\1\1\1\10\1\7\1\5\1\12\1\11\12\uffff\1\3",
            "\1\13",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\1\16\1\20\1\26\1\23\1\22\1\17\1\25\1\24\1\35\1\30\1\34\2\uffff\1\27\1\uffff\1\33\2\uffff\1\15\1\31\1\32",
            "\1\42\1\37\1\41\1\47\1\44\1\43\1\40\1\46\1\45\1\35\1\30\1\34\2\uffff\1\27\1\uffff\1\33\2\uffff\1\36\1\31\1\32",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "190:2: (this_ContainerCredentialsUsername_0= ruleContainerCredentialsUsername | this_ContainerCredentialsPassword_1= ruleContainerCredentialsPassword | ( ( ruleContainerCredentialsAdditionalProperties )=>this_ContainerCredentialsAdditionalProperties_2= ruleContainerCredentialsAdditionalProperties ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_17 = input.LA(1);

                         
                        int index2_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 40;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_21 = input.LA(1);

                         
                        int index2_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 40;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_32 = input.LA(1);

                         
                        int index2_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 41;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_32);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_36 = input.LA(1);

                         
                        int index2_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 41;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_36);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_14 = input.LA(1);

                         
                        int index2_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 40;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_18 = input.LA(1);

                         
                        int index2_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 40;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_18);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_22 = input.LA(1);

                         
                        int index2_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 40;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_22);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_12==RULE_STRING) ) {s = 30;}

                        else if ( (LA2_12==Container) ) {s = 31;}

                        else if ( (LA2_12==Image) ) {s = 32;}

                        else if ( (LA2_12==Password) ) {s = 33;}

                        else if ( (LA2_12==Credentials) ) {s = 34;}

                        else if ( (LA2_12==Volumes) ) {s = 35;}

                        else if ( (LA2_12==Options) ) {s = 36;}

                        else if ( (LA2_12==Env) ) {s = 37;}

                        else if ( (LA2_12==Ports) ) {s = 38;}

                        else if ( (LA2_12==Username) ) {s = 39;}

                        else if ( (LA2_12==LeftSquareBracket) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 23;}

                        else if ( (LA2_12==Null) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 24;}

                        else if ( (LA2_12==RULE_E_INT) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 25;}

                        else if ( (LA2_12==RULE_E_DOUBLE) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 26;}

                        else if ( (LA2_12==LeftCurlyBracket) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 27;}

                        else if ( (LA2_12==True) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 28;}

                        else if ( (LA2_12==False) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 29;}

                         
                        input.seek(index2_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_11==RULE_STRING) ) {s = 13;}

                        else if ( (LA2_11==Container) ) {s = 14;}

                        else if ( (LA2_11==Image) ) {s = 15;}

                        else if ( (LA2_11==Password) ) {s = 16;}

                        else if ( (LA2_11==Credentials) ) {s = 17;}

                        else if ( (LA2_11==Volumes) ) {s = 18;}

                        else if ( (LA2_11==Options) ) {s = 19;}

                        else if ( (LA2_11==Env) ) {s = 20;}

                        else if ( (LA2_11==Ports) ) {s = 21;}

                        else if ( (LA2_11==Username) ) {s = 22;}

                        else if ( (LA2_11==LeftSquareBracket) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 23;}

                        else if ( (LA2_11==Null) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 24;}

                        else if ( (LA2_11==RULE_E_INT) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 25;}

                        else if ( (LA2_11==RULE_E_DOUBLE) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 26;}

                        else if ( (LA2_11==LeftCurlyBracket) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 27;}

                        else if ( (LA2_11==True) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 28;}

                        else if ( (LA2_11==False) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 29;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_33 = input.LA(1);

                         
                        int index2_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 41;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_33);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_37 = input.LA(1);

                         
                        int index2_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 41;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_37);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 40;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_15);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA2_19 = input.LA(1);

                         
                        int index2_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 40;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_19);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA2_30 = input.LA(1);

                         
                        int index2_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 41;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_30);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA2_34 = input.LA(1);

                         
                        int index2_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 41;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_34);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA2_38 = input.LA(1);

                         
                        int index2_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 41;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_38);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA2_16 = input.LA(1);

                         
                        int index2_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 40;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_16);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA2_20 = input.LA(1);

                         
                        int index2_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 40;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_20);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==Username) ) {s = 1;}

                        else if ( (LA2_0==Password) ) {s = 2;}

                        else if ( (LA2_0==RULE_STRING) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 3;}

                        else if ( (LA2_0==Container) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 4;}

                        else if ( (LA2_0==Image) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 5;}

                        else if ( (LA2_0==Credentials) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 6;}

                        else if ( (LA2_0==Volumes) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 7;}

                        else if ( (LA2_0==Options) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 8;}

                        else if ( (LA2_0==Env) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 9;}

                        else if ( (LA2_0==Ports) && (synpred1_InternalNormalJobContainerOneOf1Parser())) {s = 10;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 40;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_13);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA2_31 = input.LA(1);

                         
                        int index2_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 41;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_31);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA2_35 = input.LA(1);

                         
                        int index2_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 41;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_35);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA2_39 = input.LA(1);

                         
                        int index2_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 41;}

                        else if ( (synpred1_InternalNormalJobContainerOneOf1Parser()) ) {s = 29;}

                         
                        input.seek(index2_39);
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
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\4\2\0\7\uffff";
    static final String dfa_9s = "\1\31\2\0\7\uffff";
    static final String dfa_10s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_11s = "\1\uffff\1\0\1\1\7\uffff}>";
    static final String[] dfa_12s = {
            "\11\3\1\4\1\7\1\4\2\uffff\1\6\1\uffff\1\5\2\uffff\1\3\1\1\1\2",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "310:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalNormalJobContainerOneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalNormalJobContainerOneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "422:2: ( ( ( ruleContainerPortsItemsTypeNumber )=>this_ContainerPortsItemsTypeNumber_0= ruleContainerPortsItemsTypeNumber ) | this_ContainerPortsItemsTypeString_1= ruleContainerPortsItemsTypeString | this_ContainerPortsItemsTypeInteger_2= ruleContainerPortsItemsTypeInteger | this_ContainerPortsItemsTypeBoolean_3= ruleContainerPortsItemsTypeBoolean | this_ContainerPortsItemsTypeObject_4= ruleContainerPortsItemsTypeObject | this_ContainerPortsItemsTypeArray_5= ruleContainerPortsItemsTypeArray | this_ContainerPortsItemsTypeNull_6= ruleContainerPortsItemsTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalNormalJobContainerOneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalNormalJobContainerOneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_2);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000201F10L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001F10L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000801FF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000A01FF0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000394FFF0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000039CFFF0L});

}
