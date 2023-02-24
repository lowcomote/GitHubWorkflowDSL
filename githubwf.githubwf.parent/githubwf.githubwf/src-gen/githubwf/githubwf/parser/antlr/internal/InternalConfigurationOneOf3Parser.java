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
import githubwf.githubwf.services.ConfigurationOneOf3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalConfigurationOneOf3Parser extends AbstractInternalAntlrParser {
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


        public InternalConfigurationOneOf3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigurationOneOf3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigurationOneOf3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfigurationOneOf3Parser.g"; }



     	private ConfigurationOneOf3GrammarAccess grammarAccess;

        public InternalConfigurationOneOf3Parser(TokenStream input, ConfigurationOneOf3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ConfigurationOneOf3";
       	}

       	@Override
       	protected ConfigurationOneOf3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfigurationOneOf3"
    // InternalConfigurationOneOf3Parser.g:58:1: entryRuleConfigurationOneOf3 returns [EObject current=null] : iv_ruleConfigurationOneOf3= ruleConfigurationOneOf3 EOF ;
    public final EObject entryRuleConfigurationOneOf3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationOneOf3 = null;


        try {
            // InternalConfigurationOneOf3Parser.g:58:60: (iv_ruleConfigurationOneOf3= ruleConfigurationOneOf3 EOF )
            // InternalConfigurationOneOf3Parser.g:59:2: iv_ruleConfigurationOneOf3= ruleConfigurationOneOf3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationOneOf3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationOneOf3=ruleConfigurationOneOf3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationOneOf3; 
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
    // $ANTLR end "entryRuleConfigurationOneOf3"


    // $ANTLR start "ruleConfigurationOneOf3"
    // InternalConfigurationOneOf3Parser.g:65:1: ruleConfigurationOneOf3 returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleConfigurationOneOf3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_configuration_2_0 = null;

        EObject lv_configuration_4_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:71:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalConfigurationOneOf3Parser.g:72:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalConfigurationOneOf3Parser.g:72:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalConfigurationOneOf3Parser.g:73:3: () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalConfigurationOneOf3Parser.g:73:3: ()
            // InternalConfigurationOneOf3Parser.g:74:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConfigurationOneOf3Access().getConfigurationOneOf3Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationOneOf3Access().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalConfigurationOneOf3Parser.g:84:3: ( ( (lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:85:4: ( (lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract ) ) )*
                    {
                    // InternalConfigurationOneOf3Parser.g:85:4: ( (lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract ) )
                    // InternalConfigurationOneOf3Parser.g:86:5: (lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract )
                    {
                    // InternalConfigurationOneOf3Parser.g:86:5: (lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract )
                    // InternalConfigurationOneOf3Parser.g:87:6: lv_configuration_2_0= ruleConfigurationOneOf3PropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationOneOf3Access().getConfigurationConfigurationOneOf3PropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_configuration_2_0=ruleConfigurationOneOf3PropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConfigurationOneOf3Rule());
                      						}
                      						add(
                      							current,
                      							"configuration",
                      							lv_configuration_2_0,
                      							"githubwf.githubwf.ConfigurationOneOf3.ConfigurationOneOf3PropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalConfigurationOneOf3Parser.g:104:4: (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalConfigurationOneOf3Parser.g:105:5: otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getConfigurationOneOf3Access().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalConfigurationOneOf3Parser.g:109:5: ( (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract ) )
                    	    // InternalConfigurationOneOf3Parser.g:110:6: (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract )
                    	    {
                    	    // InternalConfigurationOneOf3Parser.g:110:6: (lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract )
                    	    // InternalConfigurationOneOf3Parser.g:111:7: lv_configuration_4_0= ruleConfigurationOneOf3PropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationOneOf3Access().getConfigurationConfigurationOneOf3PropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_configuration_4_0=ruleConfigurationOneOf3PropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConfigurationOneOf3Rule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"configuration",
                    	      								lv_configuration_4_0,
                    	      								"githubwf.githubwf.ConfigurationOneOf3.ConfigurationOneOf3PropertiesAbstract");
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

              			newLeafNode(otherlv_5, grammarAccess.getConfigurationOneOf3Access().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleConfigurationOneOf3"


    // $ANTLR start "entryRuleConfigurationOneOf3PropertiesAbstract"
    // InternalConfigurationOneOf3Parser.g:138:1: entryRuleConfigurationOneOf3PropertiesAbstract returns [EObject current=null] : iv_ruleConfigurationOneOf3PropertiesAbstract= ruleConfigurationOneOf3PropertiesAbstract EOF ;
    public final EObject entryRuleConfigurationOneOf3PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationOneOf3PropertiesAbstract = null;


        try {
            // InternalConfigurationOneOf3Parser.g:138:78: (iv_ruleConfigurationOneOf3PropertiesAbstract= ruleConfigurationOneOf3PropertiesAbstract EOF )
            // InternalConfigurationOneOf3Parser.g:139:2: iv_ruleConfigurationOneOf3PropertiesAbstract= ruleConfigurationOneOf3PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationOneOf3PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationOneOf3PropertiesAbstract=ruleConfigurationOneOf3PropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationOneOf3PropertiesAbstract; 
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
    // $ANTLR end "entryRuleConfigurationOneOf3PropertiesAbstract"


    // $ANTLR start "ruleConfigurationOneOf3PropertiesAbstract"
    // InternalConfigurationOneOf3Parser.g:145:1: ruleConfigurationOneOf3PropertiesAbstract returns [EObject current=null] : ( ( ruleConfigurationOneOf3AdditionalProperties )=>this_ConfigurationOneOf3AdditionalProperties_0= ruleConfigurationOneOf3AdditionalProperties ) ;
    public final EObject ruleConfigurationOneOf3PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationOneOf3AdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:151:2: ( ( ( ruleConfigurationOneOf3AdditionalProperties )=>this_ConfigurationOneOf3AdditionalProperties_0= ruleConfigurationOneOf3AdditionalProperties ) )
            // InternalConfigurationOneOf3Parser.g:152:2: ( ( ruleConfigurationOneOf3AdditionalProperties )=>this_ConfigurationOneOf3AdditionalProperties_0= ruleConfigurationOneOf3AdditionalProperties )
            {
            // InternalConfigurationOneOf3Parser.g:152:2: ( ( ruleConfigurationOneOf3AdditionalProperties )=>this_ConfigurationOneOf3AdditionalProperties_0= ruleConfigurationOneOf3AdditionalProperties )
            // InternalConfigurationOneOf3Parser.g:153:3: ( ruleConfigurationOneOf3AdditionalProperties )=>this_ConfigurationOneOf3AdditionalProperties_0= ruleConfigurationOneOf3AdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConfigurationOneOf3PropertiesAbstractAccess().getConfigurationOneOf3AdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ConfigurationOneOf3AdditionalProperties_0=ruleConfigurationOneOf3AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationOneOf3AdditionalProperties_0;
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
    // $ANTLR end "ruleConfigurationOneOf3PropertiesAbstract"


    // $ANTLR start "entryRuleConfigurationAbstract"
    // InternalConfigurationOneOf3Parser.g:166:1: entryRuleConfigurationAbstract returns [EObject current=null] : iv_ruleConfigurationAbstract= ruleConfigurationAbstract EOF ;
    public final EObject entryRuleConfigurationAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAbstract = null;


        try {
            // InternalConfigurationOneOf3Parser.g:166:62: (iv_ruleConfigurationAbstract= ruleConfigurationAbstract EOF )
            // InternalConfigurationOneOf3Parser.g:167:2: iv_ruleConfigurationAbstract= ruleConfigurationAbstract EOF
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
    // InternalConfigurationOneOf3Parser.g:173:1: ruleConfigurationAbstract returns [EObject current=null] : ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull ) ;
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
            // InternalConfigurationOneOf3Parser.g:179:2: ( ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull ) )
            // InternalConfigurationOneOf3Parser.g:180:2: ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull )
            {
            // InternalConfigurationOneOf3Parser.g:180:2: ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:181:3: ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber )
                    {
                    // InternalConfigurationOneOf3Parser.g:181:3: ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber )
                    // InternalConfigurationOneOf3Parser.g:182:4: ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber
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
                    // InternalConfigurationOneOf3Parser.g:193:3: this_ConfigurationTypeString_1= ruleConfigurationTypeString
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
                    // InternalConfigurationOneOf3Parser.g:202:3: this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger
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
                    // InternalConfigurationOneOf3Parser.g:211:3: this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean
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
                    // InternalConfigurationOneOf3Parser.g:220:3: this_ConfigurationTypeObject_4= ruleConfigurationTypeObject
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
                    // InternalConfigurationOneOf3Parser.g:229:3: this_ConfigurationTypeArray_5= ruleConfigurationTypeArray
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
                    // InternalConfigurationOneOf3Parser.g:238:3: this_ConfigurationTypeNull_6= ruleConfigurationTypeNull
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
    // InternalConfigurationOneOf3Parser.g:250:1: entryRuleConfigurationPropertiesAbstract returns [EObject current=null] : iv_ruleConfigurationPropertiesAbstract= ruleConfigurationPropertiesAbstract EOF ;
    public final EObject entryRuleConfigurationPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationPropertiesAbstract = null;


        try {
            // InternalConfigurationOneOf3Parser.g:250:72: (iv_ruleConfigurationPropertiesAbstract= ruleConfigurationPropertiesAbstract EOF )
            // InternalConfigurationOneOf3Parser.g:251:2: iv_ruleConfigurationPropertiesAbstract= ruleConfigurationPropertiesAbstract EOF
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
    // InternalConfigurationOneOf3Parser.g:257:1: ruleConfigurationPropertiesAbstract returns [EObject current=null] : ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties ) ;
    public final EObject ruleConfigurationPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:263:2: ( ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties ) )
            // InternalConfigurationOneOf3Parser.g:264:2: ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties )
            {
            // InternalConfigurationOneOf3Parser.g:264:2: ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties )
            // InternalConfigurationOneOf3Parser.g:265:3: ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties
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
    // InternalConfigurationOneOf3Parser.g:278:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalConfigurationOneOf3Parser.g:278:46: (iv_ruleValue= ruleValue EOF )
            // InternalConfigurationOneOf3Parser.g:279:2: iv_ruleValue= ruleValue EOF
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
    // InternalConfigurationOneOf3Parser.g:285:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalConfigurationOneOf3Parser.g:291:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalConfigurationOneOf3Parser.g:292:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalConfigurationOneOf3Parser.g:292:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt4=6;
            switch ( input.LA(1) ) {
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
                    // InternalConfigurationOneOf3Parser.g:293:3: this_StringValue_0= ruleStringValue
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
                    // InternalConfigurationOneOf3Parser.g:302:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalConfigurationOneOf3Parser.g:311:3: this_NullValue_2= ruleNullValue
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
                    // InternalConfigurationOneOf3Parser.g:320:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalConfigurationOneOf3Parser.g:329:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalConfigurationOneOf3Parser.g:338:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleConfigurationOneOf3AdditionalProperties"
    // InternalConfigurationOneOf3Parser.g:350:1: entryRuleConfigurationOneOf3AdditionalProperties returns [EObject current=null] : iv_ruleConfigurationOneOf3AdditionalProperties= ruleConfigurationOneOf3AdditionalProperties EOF ;
    public final EObject entryRuleConfigurationOneOf3AdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationOneOf3AdditionalProperties = null;


        try {
            // InternalConfigurationOneOf3Parser.g:350:80: (iv_ruleConfigurationOneOf3AdditionalProperties= ruleConfigurationOneOf3AdditionalProperties EOF )
            // InternalConfigurationOneOf3Parser.g:351:2: iv_ruleConfigurationOneOf3AdditionalProperties= ruleConfigurationOneOf3AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationOneOf3AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationOneOf3AdditionalProperties=ruleConfigurationOneOf3AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationOneOf3AdditionalProperties; 
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
    // $ANTLR end "entryRuleConfigurationOneOf3AdditionalProperties"


    // $ANTLR start "ruleConfigurationOneOf3AdditionalProperties"
    // InternalConfigurationOneOf3Parser.g:357:1: ruleConfigurationOneOf3AdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleConfiguration ) ) ) ;
    public final EObject ruleConfigurationOneOf3AdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:363:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleConfiguration ) ) ) )
            // InternalConfigurationOneOf3Parser.g:364:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleConfiguration ) ) )
            {
            // InternalConfigurationOneOf3Parser.g:364:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleConfiguration ) ) )
            // InternalConfigurationOneOf3Parser.g:365:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleConfiguration ) )
            {
            // InternalConfigurationOneOf3Parser.g:365:3: ( (lv_key_0_0= ruleEString ) )
            // InternalConfigurationOneOf3Parser.g:366:4: (lv_key_0_0= ruleEString )
            {
            // InternalConfigurationOneOf3Parser.g:366:4: (lv_key_0_0= ruleEString )
            // InternalConfigurationOneOf3Parser.g:367:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigurationOneOf3AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.ConfigurationOneOf3.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalConfigurationOneOf3Parser.g:388:3: ( (lv_additionalProperties_2_0= ruleConfiguration ) )
            // InternalConfigurationOneOf3Parser.g:389:4: (lv_additionalProperties_2_0= ruleConfiguration )
            {
            // InternalConfigurationOneOf3Parser.g:389:4: (lv_additionalProperties_2_0= ruleConfiguration )
            // InternalConfigurationOneOf3Parser.g:390:5: lv_additionalProperties_2_0= ruleConfiguration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getAdditionalPropertiesConfigurationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigurationOneOf3AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.ConfigurationOneOf3.Configuration");
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
    // $ANTLR end "ruleConfigurationOneOf3AdditionalProperties"


    // $ANTLR start "entryRuleEString"
    // InternalConfigurationOneOf3Parser.g:411:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalConfigurationOneOf3Parser.g:411:47: (iv_ruleEString= ruleEString EOF )
            // InternalConfigurationOneOf3Parser.g:412:2: iv_ruleEString= ruleEString EOF
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
    // InternalConfigurationOneOf3Parser.g:418:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:424:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalConfigurationOneOf3Parser.g:425:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleConfiguration"
    // InternalConfigurationOneOf3Parser.g:438:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalConfigurationOneOf3Parser.g:438:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalConfigurationOneOf3Parser.g:439:2: iv_ruleConfiguration= ruleConfiguration EOF
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
    // InternalConfigurationOneOf3Parser.g:445:1: ruleConfiguration returns [EObject current=null] : ( (lv_configuration_0_0= ruleConfigurationAbstract ) ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:451:2: ( ( (lv_configuration_0_0= ruleConfigurationAbstract ) ) )
            // InternalConfigurationOneOf3Parser.g:452:2: ( (lv_configuration_0_0= ruleConfigurationAbstract ) )
            {
            // InternalConfigurationOneOf3Parser.g:452:2: ( (lv_configuration_0_0= ruleConfigurationAbstract ) )
            // InternalConfigurationOneOf3Parser.g:453:3: (lv_configuration_0_0= ruleConfigurationAbstract )
            {
            // InternalConfigurationOneOf3Parser.g:453:3: (lv_configuration_0_0= ruleConfigurationAbstract )
            // InternalConfigurationOneOf3Parser.g:454:4: lv_configuration_0_0= ruleConfigurationAbstract
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
              					"githubwf.githubwf.ConfigurationOneOf3.ConfigurationAbstract");
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
    // InternalConfigurationOneOf3Parser.g:474:1: entryRuleConfigurationTypeString returns [EObject current=null] : iv_ruleConfigurationTypeString= ruleConfigurationTypeString EOF ;
    public final EObject entryRuleConfigurationTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeString = null;


        try {
            // InternalConfigurationOneOf3Parser.g:474:64: (iv_ruleConfigurationTypeString= ruleConfigurationTypeString EOF )
            // InternalConfigurationOneOf3Parser.g:475:2: iv_ruleConfigurationTypeString= ruleConfigurationTypeString EOF
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
    // InternalConfigurationOneOf3Parser.g:481:1: ruleConfigurationTypeString returns [EObject current=null] : ( (lv_configuration_0_0= ruleEString ) ) ;
    public final EObject ruleConfigurationTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:487:2: ( ( (lv_configuration_0_0= ruleEString ) ) )
            // InternalConfigurationOneOf3Parser.g:488:2: ( (lv_configuration_0_0= ruleEString ) )
            {
            // InternalConfigurationOneOf3Parser.g:488:2: ( (lv_configuration_0_0= ruleEString ) )
            // InternalConfigurationOneOf3Parser.g:489:3: (lv_configuration_0_0= ruleEString )
            {
            // InternalConfigurationOneOf3Parser.g:489:3: (lv_configuration_0_0= ruleEString )
            // InternalConfigurationOneOf3Parser.g:490:4: lv_configuration_0_0= ruleEString
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
              					"githubwf.githubwf.ConfigurationOneOf3.EString");
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
    // InternalConfigurationOneOf3Parser.g:510:1: entryRuleConfigurationTypeInteger returns [EObject current=null] : iv_ruleConfigurationTypeInteger= ruleConfigurationTypeInteger EOF ;
    public final EObject entryRuleConfigurationTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeInteger = null;


        try {
            // InternalConfigurationOneOf3Parser.g:510:65: (iv_ruleConfigurationTypeInteger= ruleConfigurationTypeInteger EOF )
            // InternalConfigurationOneOf3Parser.g:511:2: iv_ruleConfigurationTypeInteger= ruleConfigurationTypeInteger EOF
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
    // InternalConfigurationOneOf3Parser.g:517:1: ruleConfigurationTypeInteger returns [EObject current=null] : ( (lv_configuration_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleConfigurationTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:523:2: ( ( (lv_configuration_0_0= ruleEDoubleObject ) ) )
            // InternalConfigurationOneOf3Parser.g:524:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            {
            // InternalConfigurationOneOf3Parser.g:524:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            // InternalConfigurationOneOf3Parser.g:525:3: (lv_configuration_0_0= ruleEDoubleObject )
            {
            // InternalConfigurationOneOf3Parser.g:525:3: (lv_configuration_0_0= ruleEDoubleObject )
            // InternalConfigurationOneOf3Parser.g:526:4: lv_configuration_0_0= ruleEDoubleObject
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
              					"githubwf.githubwf.ConfigurationOneOf3.EDoubleObject");
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
    // InternalConfigurationOneOf3Parser.g:546:1: entryRuleConfigurationTypeNumber returns [EObject current=null] : iv_ruleConfigurationTypeNumber= ruleConfigurationTypeNumber EOF ;
    public final EObject entryRuleConfigurationTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeNumber = null;


        try {
            // InternalConfigurationOneOf3Parser.g:546:64: (iv_ruleConfigurationTypeNumber= ruleConfigurationTypeNumber EOF )
            // InternalConfigurationOneOf3Parser.g:547:2: iv_ruleConfigurationTypeNumber= ruleConfigurationTypeNumber EOF
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
    // InternalConfigurationOneOf3Parser.g:553:1: ruleConfigurationTypeNumber returns [EObject current=null] : ( (lv_configuration_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleConfigurationTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:559:2: ( ( (lv_configuration_0_0= ruleEDoubleObject ) ) )
            // InternalConfigurationOneOf3Parser.g:560:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            {
            // InternalConfigurationOneOf3Parser.g:560:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            // InternalConfigurationOneOf3Parser.g:561:3: (lv_configuration_0_0= ruleEDoubleObject )
            {
            // InternalConfigurationOneOf3Parser.g:561:3: (lv_configuration_0_0= ruleEDoubleObject )
            // InternalConfigurationOneOf3Parser.g:562:4: lv_configuration_0_0= ruleEDoubleObject
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
              					"githubwf.githubwf.ConfigurationOneOf3.EDoubleObject");
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
    // InternalConfigurationOneOf3Parser.g:582:1: entryRuleConfigurationTypeBoolean returns [EObject current=null] : iv_ruleConfigurationTypeBoolean= ruleConfigurationTypeBoolean EOF ;
    public final EObject entryRuleConfigurationTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeBoolean = null;


        try {
            // InternalConfigurationOneOf3Parser.g:582:65: (iv_ruleConfigurationTypeBoolean= ruleConfigurationTypeBoolean EOF )
            // InternalConfigurationOneOf3Parser.g:583:2: iv_ruleConfigurationTypeBoolean= ruleConfigurationTypeBoolean EOF
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
    // InternalConfigurationOneOf3Parser.g:589:1: ruleConfigurationTypeBoolean returns [EObject current=null] : ( (lv_configuration_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleConfigurationTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:595:2: ( ( (lv_configuration_0_0= ruleEBooleanObject ) ) )
            // InternalConfigurationOneOf3Parser.g:596:2: ( (lv_configuration_0_0= ruleEBooleanObject ) )
            {
            // InternalConfigurationOneOf3Parser.g:596:2: ( (lv_configuration_0_0= ruleEBooleanObject ) )
            // InternalConfigurationOneOf3Parser.g:597:3: (lv_configuration_0_0= ruleEBooleanObject )
            {
            // InternalConfigurationOneOf3Parser.g:597:3: (lv_configuration_0_0= ruleEBooleanObject )
            // InternalConfigurationOneOf3Parser.g:598:4: lv_configuration_0_0= ruleEBooleanObject
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
              					"githubwf.githubwf.ConfigurationOneOf3.EBooleanObject");
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
    // InternalConfigurationOneOf3Parser.g:618:1: entryRuleConfigurationTypeObject returns [EObject current=null] : iv_ruleConfigurationTypeObject= ruleConfigurationTypeObject EOF ;
    public final EObject entryRuleConfigurationTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeObject = null;


        try {
            // InternalConfigurationOneOf3Parser.g:618:64: (iv_ruleConfigurationTypeObject= ruleConfigurationTypeObject EOF )
            // InternalConfigurationOneOf3Parser.g:619:2: iv_ruleConfigurationTypeObject= ruleConfigurationTypeObject EOF
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
    // InternalConfigurationOneOf3Parser.g:625:1: ruleConfigurationTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleConfigurationTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_configuration_2_0 = null;

        EObject lv_configuration_4_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:631:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalConfigurationOneOf3Parser.g:632:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalConfigurationOneOf3Parser.g:632:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalConfigurationOneOf3Parser.g:633:3: () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalConfigurationOneOf3Parser.g:633:3: ()
            // InternalConfigurationOneOf3Parser.g:634:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConfigurationTypeObjectAccess().getConfigurationTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalConfigurationOneOf3Parser.g:644:3: ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:645:4: ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )*
                    {
                    // InternalConfigurationOneOf3Parser.g:645:4: ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) )
                    // InternalConfigurationOneOf3Parser.g:646:5: (lv_configuration_2_0= ruleConfigurationPropertiesAbstract )
                    {
                    // InternalConfigurationOneOf3Parser.g:646:5: (lv_configuration_2_0= ruleConfigurationPropertiesAbstract )
                    // InternalConfigurationOneOf3Parser.g:647:6: lv_configuration_2_0= ruleConfigurationPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationConfigurationPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
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
                      							"githubwf.githubwf.ConfigurationOneOf3.ConfigurationPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalConfigurationOneOf3Parser.g:664:4: (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalConfigurationOneOf3Parser.g:665:5: otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getConfigurationTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalConfigurationOneOf3Parser.g:669:5: ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) )
                    	    // InternalConfigurationOneOf3Parser.g:670:6: (lv_configuration_4_0= ruleConfigurationPropertiesAbstract )
                    	    {
                    	    // InternalConfigurationOneOf3Parser.g:670:6: (lv_configuration_4_0= ruleConfigurationPropertiesAbstract )
                    	    // InternalConfigurationOneOf3Parser.g:671:7: lv_configuration_4_0= ruleConfigurationPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationConfigurationPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
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
                    	      								"githubwf.githubwf.ConfigurationOneOf3.ConfigurationPropertiesAbstract");
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
    // InternalConfigurationOneOf3Parser.g:698:1: entryRuleConfigurationTypeArray returns [EObject current=null] : iv_ruleConfigurationTypeArray= ruleConfigurationTypeArray EOF ;
    public final EObject entryRuleConfigurationTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeArray = null;


        try {
            // InternalConfigurationOneOf3Parser.g:698:63: (iv_ruleConfigurationTypeArray= ruleConfigurationTypeArray EOF )
            // InternalConfigurationOneOf3Parser.g:699:2: iv_ruleConfigurationTypeArray= ruleConfigurationTypeArray EOF
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
    // InternalConfigurationOneOf3Parser.g:705:1: ruleConfigurationTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleConfigurationTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_configuration_2_0 = null;

        EObject lv_configuration_4_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:711:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalConfigurationOneOf3Parser.g:712:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalConfigurationOneOf3Parser.g:712:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalConfigurationOneOf3Parser.g:713:3: () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalConfigurationOneOf3Parser.g:713:3: ()
            // InternalConfigurationOneOf3Parser.g:714:4: 
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
            // InternalConfigurationOneOf3Parser.g:724:3: ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=False && LA8_0<=True)||LA8_0==LeftSquareBracket||LA8_0==LeftCurlyBracket||(LA8_0>=RULE_STRING && LA8_0<=RULE_E_DOUBLE)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:725:4: ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )*
                    {
                    // InternalConfigurationOneOf3Parser.g:725:4: ( (lv_configuration_2_0= ruleConfigurationItems ) )
                    // InternalConfigurationOneOf3Parser.g:726:5: (lv_configuration_2_0= ruleConfigurationItems )
                    {
                    // InternalConfigurationOneOf3Parser.g:726:5: (lv_configuration_2_0= ruleConfigurationItems )
                    // InternalConfigurationOneOf3Parser.g:727:6: lv_configuration_2_0= ruleConfigurationItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationConfigurationItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
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
                      							"githubwf.githubwf.ConfigurationOneOf3.ConfigurationItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalConfigurationOneOf3Parser.g:744:4: (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Comma) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalConfigurationOneOf3Parser.g:745:5: otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getConfigurationTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalConfigurationOneOf3Parser.g:749:5: ( (lv_configuration_4_0= ruleConfigurationItems ) )
                    	    // InternalConfigurationOneOf3Parser.g:750:6: (lv_configuration_4_0= ruleConfigurationItems )
                    	    {
                    	    // InternalConfigurationOneOf3Parser.g:750:6: (lv_configuration_4_0= ruleConfigurationItems )
                    	    // InternalConfigurationOneOf3Parser.g:751:7: lv_configuration_4_0= ruleConfigurationItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationConfigurationItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
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
                    	      								"githubwf.githubwf.ConfigurationOneOf3.ConfigurationItems");
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
    // InternalConfigurationOneOf3Parser.g:778:1: entryRuleConfigurationTypeNull returns [EObject current=null] : iv_ruleConfigurationTypeNull= ruleConfigurationTypeNull EOF ;
    public final EObject entryRuleConfigurationTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeNull = null;


        try {
            // InternalConfigurationOneOf3Parser.g:778:62: (iv_ruleConfigurationTypeNull= ruleConfigurationTypeNull EOF )
            // InternalConfigurationOneOf3Parser.g:779:2: iv_ruleConfigurationTypeNull= ruleConfigurationTypeNull EOF
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
    // InternalConfigurationOneOf3Parser.g:785:1: ruleConfigurationTypeNull returns [EObject current=null] : ( (lv_configuration_0_0= ruleNullValue ) ) ;
    public final EObject ruleConfigurationTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:791:2: ( ( (lv_configuration_0_0= ruleNullValue ) ) )
            // InternalConfigurationOneOf3Parser.g:792:2: ( (lv_configuration_0_0= ruleNullValue ) )
            {
            // InternalConfigurationOneOf3Parser.g:792:2: ( (lv_configuration_0_0= ruleNullValue ) )
            // InternalConfigurationOneOf3Parser.g:793:3: (lv_configuration_0_0= ruleNullValue )
            {
            // InternalConfigurationOneOf3Parser.g:793:3: (lv_configuration_0_0= ruleNullValue )
            // InternalConfigurationOneOf3Parser.g:794:4: lv_configuration_0_0= ruleNullValue
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
              					"githubwf.githubwf.ConfigurationOneOf3.NullValue");
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


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalConfigurationOneOf3Parser.g:814:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalConfigurationOneOf3Parser.g:814:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalConfigurationOneOf3Parser.g:815:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalConfigurationOneOf3Parser.g:821:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:827:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalConfigurationOneOf3Parser.g:828:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalConfigurationOneOf3Parser.g:828:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
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
                    // InternalConfigurationOneOf3Parser.g:829:3: this_E_INT_0= RULE_E_INT
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
                    // InternalConfigurationOneOf3Parser.g:837:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalConfigurationOneOf3Parser.g:848:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalConfigurationOneOf3Parser.g:848:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalConfigurationOneOf3Parser.g:849:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalConfigurationOneOf3Parser.g:855:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:861:2: ( (kw= True | kw= False ) )
            // InternalConfigurationOneOf3Parser.g:862:2: (kw= True | kw= False )
            {
            // InternalConfigurationOneOf3Parser.g:862:2: (kw= True | kw= False )
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
                    // InternalConfigurationOneOf3Parser.g:863:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalConfigurationOneOf3Parser.g:869:3: kw= False
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
    // InternalConfigurationOneOf3Parser.g:878:1: entryRuleConfigurationAdditionalProperties returns [EObject current=null] : iv_ruleConfigurationAdditionalProperties= ruleConfigurationAdditionalProperties EOF ;
    public final EObject entryRuleConfigurationAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAdditionalProperties = null;


        try {
            // InternalConfigurationOneOf3Parser.g:878:74: (iv_ruleConfigurationAdditionalProperties= ruleConfigurationAdditionalProperties EOF )
            // InternalConfigurationOneOf3Parser.g:879:2: iv_ruleConfigurationAdditionalProperties= ruleConfigurationAdditionalProperties EOF
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
    // InternalConfigurationOneOf3Parser.g:885:1: ruleConfigurationAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleConfigurationAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:891:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalConfigurationOneOf3Parser.g:892:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalConfigurationOneOf3Parser.g:892:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalConfigurationOneOf3Parser.g:893:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalConfigurationOneOf3Parser.g:893:3: ( (lv_key_0_0= ruleEString ) )
            // InternalConfigurationOneOf3Parser.g:894:4: (lv_key_0_0= ruleEString )
            {
            // InternalConfigurationOneOf3Parser.g:894:4: (lv_key_0_0= ruleEString )
            // InternalConfigurationOneOf3Parser.g:895:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
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
              						"githubwf.githubwf.ConfigurationOneOf3.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalConfigurationOneOf3Parser.g:916:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalConfigurationOneOf3Parser.g:917:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalConfigurationOneOf3Parser.g:917:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalConfigurationOneOf3Parser.g:918:5: lv_additionalProperties_2_0= ruleJsonDocument
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
              						"githubwf.githubwf.ConfigurationOneOf3.JsonDocument");
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
    // InternalConfigurationOneOf3Parser.g:939:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalConfigurationOneOf3Parser.g:939:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalConfigurationOneOf3Parser.g:940:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalConfigurationOneOf3Parser.g:946:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:952:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalConfigurationOneOf3Parser.g:953:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalConfigurationOneOf3Parser.g:953:2: ( (lv_value_0_0= ruleValue ) )
            // InternalConfigurationOneOf3Parser.g:954:3: (lv_value_0_0= ruleValue )
            {
            // InternalConfigurationOneOf3Parser.g:954:3: (lv_value_0_0= ruleValue )
            // InternalConfigurationOneOf3Parser.g:955:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.ConfigurationOneOf3.Value");
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
    // InternalConfigurationOneOf3Parser.g:975:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalConfigurationOneOf3Parser.g:975:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalConfigurationOneOf3Parser.g:976:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalConfigurationOneOf3Parser.g:982:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:988:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalConfigurationOneOf3Parser.g:989:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalConfigurationOneOf3Parser.g:989:2: ( (lv_value_0_0= ruleEString ) )
            // InternalConfigurationOneOf3Parser.g:990:3: (lv_value_0_0= ruleEString )
            {
            // InternalConfigurationOneOf3Parser.g:990:3: (lv_value_0_0= ruleEString )
            // InternalConfigurationOneOf3Parser.g:991:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.ConfigurationOneOf3.EString");
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
    // InternalConfigurationOneOf3Parser.g:1011:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalConfigurationOneOf3Parser.g:1011:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalConfigurationOneOf3Parser.g:1012:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalConfigurationOneOf3Parser.g:1018:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1024:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalConfigurationOneOf3Parser.g:1025:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalConfigurationOneOf3Parser.g:1025:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalConfigurationOneOf3Parser.g:1026:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalConfigurationOneOf3Parser.g:1026:3: ()
            // InternalConfigurationOneOf3Parser.g:1027:4: 
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
            // InternalConfigurationOneOf3Parser.g:1037:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=False && LA12_0<=True)||LA12_0==LeftSquareBracket||LA12_0==LeftCurlyBracket||(LA12_0>=RULE_STRING && LA12_0<=RULE_E_DOUBLE)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:1038:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalConfigurationOneOf3Parser.g:1038:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalConfigurationOneOf3Parser.g:1039:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalConfigurationOneOf3Parser.g:1039:5: (lv_value_2_0= ruleValue )
                    // InternalConfigurationOneOf3Parser.g:1040:6: lv_value_2_0= ruleValue
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
                      							"githubwf.githubwf.ConfigurationOneOf3.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalConfigurationOneOf3Parser.g:1057:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Comma) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalConfigurationOneOf3Parser.g:1058:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalConfigurationOneOf3Parser.g:1062:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalConfigurationOneOf3Parser.g:1063:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalConfigurationOneOf3Parser.g:1063:6: (lv_value_4_0= ruleValue )
                    	    // InternalConfigurationOneOf3Parser.g:1064:7: lv_value_4_0= ruleValue
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
                    	      								"githubwf.githubwf.ConfigurationOneOf3.Value");
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
    // InternalConfigurationOneOf3Parser.g:1091:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalConfigurationOneOf3Parser.g:1091:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalConfigurationOneOf3Parser.g:1092:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalConfigurationOneOf3Parser.g:1098:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1104:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalConfigurationOneOf3Parser.g:1105:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalConfigurationOneOf3Parser.g:1105:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalConfigurationOneOf3Parser.g:1106:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalConfigurationOneOf3Parser.g:1106:3: (lv_value_0_0= ruleNullEnum )
            // InternalConfigurationOneOf3Parser.g:1107:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.ConfigurationOneOf3.NullEnum");
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
    // InternalConfigurationOneOf3Parser.g:1127:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalConfigurationOneOf3Parser.g:1127:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalConfigurationOneOf3Parser.g:1128:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalConfigurationOneOf3Parser.g:1134:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1140:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalConfigurationOneOf3Parser.g:1141:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalConfigurationOneOf3Parser.g:1141:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalConfigurationOneOf3Parser.g:1142:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalConfigurationOneOf3Parser.g:1142:3: (lv_value_0_0= ruleEDouble )
            // InternalConfigurationOneOf3Parser.g:1143:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.ConfigurationOneOf3.EDouble");
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
    // InternalConfigurationOneOf3Parser.g:1163:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalConfigurationOneOf3Parser.g:1163:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalConfigurationOneOf3Parser.g:1164:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalConfigurationOneOf3Parser.g:1170:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1176:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalConfigurationOneOf3Parser.g:1177:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalConfigurationOneOf3Parser.g:1177:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalConfigurationOneOf3Parser.g:1178:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalConfigurationOneOf3Parser.g:1178:3: ()
            // InternalConfigurationOneOf3Parser.g:1179:4: 
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
            // InternalConfigurationOneOf3Parser.g:1189:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:1190:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalConfigurationOneOf3Parser.g:1190:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalConfigurationOneOf3Parser.g:1191:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalConfigurationOneOf3Parser.g:1191:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalConfigurationOneOf3Parser.g:1192:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.ConfigurationOneOf3.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalConfigurationOneOf3Parser.g:1209:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Comma) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalConfigurationOneOf3Parser.g:1210:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalConfigurationOneOf3Parser.g:1214:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalConfigurationOneOf3Parser.g:1215:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalConfigurationOneOf3Parser.g:1215:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalConfigurationOneOf3Parser.g:1216:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.ConfigurationOneOf3.KeyValuePair");
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
    // InternalConfigurationOneOf3Parser.g:1243:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalConfigurationOneOf3Parser.g:1243:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalConfigurationOneOf3Parser.g:1244:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalConfigurationOneOf3Parser.g:1250:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1256:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalConfigurationOneOf3Parser.g:1257:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalConfigurationOneOf3Parser.g:1257:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalConfigurationOneOf3Parser.g:1258:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalConfigurationOneOf3Parser.g:1258:3: (lv_value_0_0= ruleEBoolean )
            // InternalConfigurationOneOf3Parser.g:1259:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.ConfigurationOneOf3.EBoolean");
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
    // InternalConfigurationOneOf3Parser.g:1279:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalConfigurationOneOf3Parser.g:1279:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalConfigurationOneOf3Parser.g:1280:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalConfigurationOneOf3Parser.g:1286:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1292:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalConfigurationOneOf3Parser.g:1293:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalConfigurationOneOf3Parser.g:1293:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_E_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_E_DOUBLE) ) {
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
                    // InternalConfigurationOneOf3Parser.g:1294:3: this_E_INT_0= RULE_E_INT
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
                    // InternalConfigurationOneOf3Parser.g:1302:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalConfigurationOneOf3Parser.g:1313:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalConfigurationOneOf3Parser.g:1313:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalConfigurationOneOf3Parser.g:1314:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalConfigurationOneOf3Parser.g:1320:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1326:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalConfigurationOneOf3Parser.g:1327:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalConfigurationOneOf3Parser.g:1327:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalConfigurationOneOf3Parser.g:1328:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalConfigurationOneOf3Parser.g:1328:3: ( (lv_key_0_0= ruleEString ) )
            // InternalConfigurationOneOf3Parser.g:1329:4: (lv_key_0_0= ruleEString )
            {
            // InternalConfigurationOneOf3Parser.g:1329:4: (lv_key_0_0= ruleEString )
            // InternalConfigurationOneOf3Parser.g:1330:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.ConfigurationOneOf3.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalConfigurationOneOf3Parser.g:1351:3: ( (lv_value_2_0= ruleValue ) )
            // InternalConfigurationOneOf3Parser.g:1352:4: (lv_value_2_0= ruleValue )
            {
            // InternalConfigurationOneOf3Parser.g:1352:4: (lv_value_2_0= ruleValue )
            // InternalConfigurationOneOf3Parser.g:1353:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.ConfigurationOneOf3.Value");
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
    // InternalConfigurationOneOf3Parser.g:1374:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalConfigurationOneOf3Parser.g:1374:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalConfigurationOneOf3Parser.g:1375:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalConfigurationOneOf3Parser.g:1381:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1387:2: ( (kw= True | kw= False ) )
            // InternalConfigurationOneOf3Parser.g:1388:2: (kw= True | kw= False )
            {
            // InternalConfigurationOneOf3Parser.g:1388:2: (kw= True | kw= False )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==True) ) {
                alt16=1;
            }
            else if ( (LA16_0==False) ) {
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
                    // InternalConfigurationOneOf3Parser.g:1389:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalConfigurationOneOf3Parser.g:1395:3: kw= False
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
    // InternalConfigurationOneOf3Parser.g:1404:1: entryRuleConfigurationItems returns [EObject current=null] : iv_ruleConfigurationItems= ruleConfigurationItems EOF ;
    public final EObject entryRuleConfigurationItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationItems = null;


        try {
            // InternalConfigurationOneOf3Parser.g:1404:59: (iv_ruleConfigurationItems= ruleConfigurationItems EOF )
            // InternalConfigurationOneOf3Parser.g:1405:2: iv_ruleConfigurationItems= ruleConfigurationItems EOF
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
    // InternalConfigurationOneOf3Parser.g:1411:1: ruleConfigurationItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleConfigurationItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1417:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalConfigurationOneOf3Parser.g:1418:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalConfigurationOneOf3Parser.g:1418:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalConfigurationOneOf3Parser.g:1419:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalConfigurationOneOf3Parser.g:1419:3: (lv_items_0_0= ruleJsonDocument )
            // InternalConfigurationOneOf3Parser.g:1420:4: lv_items_0_0= ruleJsonDocument
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
              					"githubwf.githubwf.ConfigurationOneOf3.JsonDocument");
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
    // InternalConfigurationOneOf3Parser.g:1440:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalConfigurationOneOf3Parser.g:1440:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalConfigurationOneOf3Parser.g:1441:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalConfigurationOneOf3Parser.g:1447:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1453:2: (this_STRING_0= RULE_STRING )
            // InternalConfigurationOneOf3Parser.g:1454:2: this_STRING_0= RULE_STRING
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
    // InternalConfigurationOneOf3Parser.g:1464:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalConfigurationOneOf3Parser.g:1470:2: ( (enumLiteral_0= Null ) )
            // InternalConfigurationOneOf3Parser.g:1471:2: (enumLiteral_0= Null )
            {
            // InternalConfigurationOneOf3Parser.g:1471:2: (enumLiteral_0= Null )
            // InternalConfigurationOneOf3Parser.g:1472:3: enumLiteral_0= Null
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

    // $ANTLR start synpred2_InternalConfigurationOneOf3Parser
    public final void synpred2_InternalConfigurationOneOf3Parser_fragment() throws RecognitionException {   
        // InternalConfigurationOneOf3Parser.g:182:4: ( ruleConfigurationTypeNumber )
        // InternalConfigurationOneOf3Parser.g:182:5: ruleConfigurationTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleConfigurationTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalConfigurationOneOf3Parser

    // Delegated rules

    public final boolean synpred2_InternalConfigurationOneOf3Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalConfigurationOneOf3Parser_fragment(); // can never throw exception
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
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\0\7\uffff";
    static final String dfa_3s = "\1\20\2\0\7\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_5s = "\1\uffff\1\0\1\1\7\uffff}>";
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
            return "180:2: ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalConfigurationOneOf3Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalConfigurationOneOf3Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_2);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001CA70L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001CE70L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000480L});

}
