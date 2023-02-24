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
import githubwf.githubwf.services.EnvOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEnvOneOf0Parser extends AbstractInternalAntlrParser {
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


        public InternalEnvOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnvOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnvOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnvOneOf0Parser.g"; }



     	private EnvOneOf0GrammarAccess grammarAccess;

        public InternalEnvOneOf0Parser(TokenStream input, EnvOneOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EnvOneOf0";
       	}

       	@Override
       	protected EnvOneOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEnvOneOf0"
    // InternalEnvOneOf0Parser.g:58:1: entryRuleEnvOneOf0 returns [EObject current=null] : iv_ruleEnvOneOf0= ruleEnvOneOf0 EOF ;
    public final EObject entryRuleEnvOneOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0 = null;


        try {
            // InternalEnvOneOf0Parser.g:58:50: (iv_ruleEnvOneOf0= ruleEnvOneOf0 EOF )
            // InternalEnvOneOf0Parser.g:59:2: iv_ruleEnvOneOf0= ruleEnvOneOf0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0=ruleEnvOneOf0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0; 
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
    // $ANTLR end "entryRuleEnvOneOf0"


    // $ANTLR start "ruleEnvOneOf0"
    // InternalEnvOneOf0Parser.g:65:1: ruleEnvOneOf0 returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvOneOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleEnvOneOf0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:71:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvOneOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalEnvOneOf0Parser.g:72:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvOneOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalEnvOneOf0Parser.g:72:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvOneOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalEnvOneOf0Parser.g:73:3: () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvOneOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalEnvOneOf0Parser.g:73:3: ()
            // InternalEnvOneOf0Parser.g:74:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvOneOf0Access().getEnvOneOf0Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvOneOf0Access().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalEnvOneOf0Parser.g:84:3: ( ( (lv_env_2_0= ruleEnvOneOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:85:4: ( (lv_env_2_0= ruleEnvOneOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract ) ) )*
                    {
                    // InternalEnvOneOf0Parser.g:85:4: ( (lv_env_2_0= ruleEnvOneOf0PropertiesAbstract ) )
                    // InternalEnvOneOf0Parser.g:86:5: (lv_env_2_0= ruleEnvOneOf0PropertiesAbstract )
                    {
                    // InternalEnvOneOf0Parser.g:86:5: (lv_env_2_0= ruleEnvOneOf0PropertiesAbstract )
                    // InternalEnvOneOf0Parser.g:87:6: lv_env_2_0= ruleEnvOneOf0PropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvOneOf0Access().getEnvEnvOneOf0PropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_env_2_0=ruleEnvOneOf0PropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnvOneOf0Rule());
                      						}
                      						add(
                      							current,
                      							"env",
                      							lv_env_2_0,
                      							"githubwf.githubwf.EnvOneOf0.EnvOneOf0PropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEnvOneOf0Parser.g:104:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEnvOneOf0Parser.g:105:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvOneOf0Access().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEnvOneOf0Parser.g:109:5: ( (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract ) )
                    	    // InternalEnvOneOf0Parser.g:110:6: (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract )
                    	    {
                    	    // InternalEnvOneOf0Parser.g:110:6: (lv_env_4_0= ruleEnvOneOf0PropertiesAbstract )
                    	    // InternalEnvOneOf0Parser.g:111:7: lv_env_4_0= ruleEnvOneOf0PropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvOneOf0Access().getEnvEnvOneOf0PropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_env_4_0=ruleEnvOneOf0PropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnvOneOf0Rule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"env",
                    	      								lv_env_4_0,
                    	      								"githubwf.githubwf.EnvOneOf0.EnvOneOf0PropertiesAbstract");
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

              			newLeafNode(otherlv_5, grammarAccess.getEnvOneOf0Access().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleEnvOneOf0"


    // $ANTLR start "entryRuleEnvOneOf0PropertiesAbstract"
    // InternalEnvOneOf0Parser.g:138:1: entryRuleEnvOneOf0PropertiesAbstract returns [EObject current=null] : iv_ruleEnvOneOf0PropertiesAbstract= ruleEnvOneOf0PropertiesAbstract EOF ;
    public final EObject entryRuleEnvOneOf0PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0PropertiesAbstract = null;


        try {
            // InternalEnvOneOf0Parser.g:138:68: (iv_ruleEnvOneOf0PropertiesAbstract= ruleEnvOneOf0PropertiesAbstract EOF )
            // InternalEnvOneOf0Parser.g:139:2: iv_ruleEnvOneOf0PropertiesAbstract= ruleEnvOneOf0PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0PropertiesAbstract=ruleEnvOneOf0PropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0PropertiesAbstract; 
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
    // $ANTLR end "entryRuleEnvOneOf0PropertiesAbstract"


    // $ANTLR start "ruleEnvOneOf0PropertiesAbstract"
    // InternalEnvOneOf0Parser.g:145:1: ruleEnvOneOf0PropertiesAbstract returns [EObject current=null] : ( ( ruleEnvOneOf0AdditionalProperties )=>this_EnvOneOf0AdditionalProperties_0= ruleEnvOneOf0AdditionalProperties ) ;
    public final EObject ruleEnvOneOf0PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvOneOf0AdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:151:2: ( ( ( ruleEnvOneOf0AdditionalProperties )=>this_EnvOneOf0AdditionalProperties_0= ruleEnvOneOf0AdditionalProperties ) )
            // InternalEnvOneOf0Parser.g:152:2: ( ( ruleEnvOneOf0AdditionalProperties )=>this_EnvOneOf0AdditionalProperties_0= ruleEnvOneOf0AdditionalProperties )
            {
            // InternalEnvOneOf0Parser.g:152:2: ( ( ruleEnvOneOf0AdditionalProperties )=>this_EnvOneOf0AdditionalProperties_0= ruleEnvOneOf0AdditionalProperties )
            // InternalEnvOneOf0Parser.g:153:3: ( ruleEnvOneOf0AdditionalProperties )=>this_EnvOneOf0AdditionalProperties_0= ruleEnvOneOf0AdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEnvOneOf0PropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_EnvOneOf0AdditionalProperties_0=ruleEnvOneOf0AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EnvOneOf0AdditionalProperties_0;
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
    // $ANTLR end "ruleEnvOneOf0PropertiesAbstract"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesAbstract"
    // InternalEnvOneOf0Parser.g:166:1: entryRuleEnvOneOf0AdditionalPropertiesAbstract returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesAbstract= ruleEnvOneOf0AdditionalPropertiesAbstract EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesAbstract = null;


        try {
            // InternalEnvOneOf0Parser.g:166:78: (iv_ruleEnvOneOf0AdditionalPropertiesAbstract= ruleEnvOneOf0AdditionalPropertiesAbstract EOF )
            // InternalEnvOneOf0Parser.g:167:2: iv_ruleEnvOneOf0AdditionalPropertiesAbstract= ruleEnvOneOf0AdditionalPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesAbstract=ruleEnvOneOf0AdditionalPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesAbstract; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesAbstract"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesAbstract"
    // InternalEnvOneOf0Parser.g:173:1: ruleEnvOneOf0AdditionalPropertiesAbstract returns [EObject current=null] : ( ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )=>this_EnvOneOf0AdditionalPropertiesTypeNumber_0= ruleEnvOneOf0AdditionalPropertiesTypeNumber ) | this_EnvOneOf0AdditionalPropertiesTypeString_1= ruleEnvOneOf0AdditionalPropertiesTypeString | this_EnvOneOf0AdditionalPropertiesTypeInteger_2= ruleEnvOneOf0AdditionalPropertiesTypeInteger | this_EnvOneOf0AdditionalPropertiesTypeBoolean_3= ruleEnvOneOf0AdditionalPropertiesTypeBoolean | this_EnvOneOf0AdditionalPropertiesTypeObject_4= ruleEnvOneOf0AdditionalPropertiesTypeObject | this_EnvOneOf0AdditionalPropertiesTypeArray_5= ruleEnvOneOf0AdditionalPropertiesTypeArray | this_EnvOneOf0AdditionalPropertiesTypeNull_6= ruleEnvOneOf0AdditionalPropertiesTypeNull ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvOneOf0AdditionalPropertiesTypeNumber_0 = null;

        EObject this_EnvOneOf0AdditionalPropertiesTypeString_1 = null;

        EObject this_EnvOneOf0AdditionalPropertiesTypeInteger_2 = null;

        EObject this_EnvOneOf0AdditionalPropertiesTypeBoolean_3 = null;

        EObject this_EnvOneOf0AdditionalPropertiesTypeObject_4 = null;

        EObject this_EnvOneOf0AdditionalPropertiesTypeArray_5 = null;

        EObject this_EnvOneOf0AdditionalPropertiesTypeNull_6 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:179:2: ( ( ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )=>this_EnvOneOf0AdditionalPropertiesTypeNumber_0= ruleEnvOneOf0AdditionalPropertiesTypeNumber ) | this_EnvOneOf0AdditionalPropertiesTypeString_1= ruleEnvOneOf0AdditionalPropertiesTypeString | this_EnvOneOf0AdditionalPropertiesTypeInteger_2= ruleEnvOneOf0AdditionalPropertiesTypeInteger | this_EnvOneOf0AdditionalPropertiesTypeBoolean_3= ruleEnvOneOf0AdditionalPropertiesTypeBoolean | this_EnvOneOf0AdditionalPropertiesTypeObject_4= ruleEnvOneOf0AdditionalPropertiesTypeObject | this_EnvOneOf0AdditionalPropertiesTypeArray_5= ruleEnvOneOf0AdditionalPropertiesTypeArray | this_EnvOneOf0AdditionalPropertiesTypeNull_6= ruleEnvOneOf0AdditionalPropertiesTypeNull ) )
            // InternalEnvOneOf0Parser.g:180:2: ( ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )=>this_EnvOneOf0AdditionalPropertiesTypeNumber_0= ruleEnvOneOf0AdditionalPropertiesTypeNumber ) | this_EnvOneOf0AdditionalPropertiesTypeString_1= ruleEnvOneOf0AdditionalPropertiesTypeString | this_EnvOneOf0AdditionalPropertiesTypeInteger_2= ruleEnvOneOf0AdditionalPropertiesTypeInteger | this_EnvOneOf0AdditionalPropertiesTypeBoolean_3= ruleEnvOneOf0AdditionalPropertiesTypeBoolean | this_EnvOneOf0AdditionalPropertiesTypeObject_4= ruleEnvOneOf0AdditionalPropertiesTypeObject | this_EnvOneOf0AdditionalPropertiesTypeArray_5= ruleEnvOneOf0AdditionalPropertiesTypeArray | this_EnvOneOf0AdditionalPropertiesTypeNull_6= ruleEnvOneOf0AdditionalPropertiesTypeNull )
            {
            // InternalEnvOneOf0Parser.g:180:2: ( ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )=>this_EnvOneOf0AdditionalPropertiesTypeNumber_0= ruleEnvOneOf0AdditionalPropertiesTypeNumber ) | this_EnvOneOf0AdditionalPropertiesTypeString_1= ruleEnvOneOf0AdditionalPropertiesTypeString | this_EnvOneOf0AdditionalPropertiesTypeInteger_2= ruleEnvOneOf0AdditionalPropertiesTypeInteger | this_EnvOneOf0AdditionalPropertiesTypeBoolean_3= ruleEnvOneOf0AdditionalPropertiesTypeBoolean | this_EnvOneOf0AdditionalPropertiesTypeObject_4= ruleEnvOneOf0AdditionalPropertiesTypeObject | this_EnvOneOf0AdditionalPropertiesTypeArray_5= ruleEnvOneOf0AdditionalPropertiesTypeArray | this_EnvOneOf0AdditionalPropertiesTypeNull_6= ruleEnvOneOf0AdditionalPropertiesTypeNull )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:181:3: ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )=>this_EnvOneOf0AdditionalPropertiesTypeNumber_0= ruleEnvOneOf0AdditionalPropertiesTypeNumber )
                    {
                    // InternalEnvOneOf0Parser.g:181:3: ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )=>this_EnvOneOf0AdditionalPropertiesTypeNumber_0= ruleEnvOneOf0AdditionalPropertiesTypeNumber )
                    // InternalEnvOneOf0Parser.g:182:4: ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )=>this_EnvOneOf0AdditionalPropertiesTypeNumber_0= ruleEnvOneOf0AdditionalPropertiesTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvOneOf0AdditionalPropertiesTypeNumber_0=ruleEnvOneOf0AdditionalPropertiesTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_EnvOneOf0AdditionalPropertiesTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEnvOneOf0Parser.g:193:3: this_EnvOneOf0AdditionalPropertiesTypeString_1= ruleEnvOneOf0AdditionalPropertiesTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvOneOf0AdditionalPropertiesTypeString_1=ruleEnvOneOf0AdditionalPropertiesTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvOneOf0AdditionalPropertiesTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEnvOneOf0Parser.g:202:3: this_EnvOneOf0AdditionalPropertiesTypeInteger_2= ruleEnvOneOf0AdditionalPropertiesTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvOneOf0AdditionalPropertiesTypeInteger_2=ruleEnvOneOf0AdditionalPropertiesTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvOneOf0AdditionalPropertiesTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEnvOneOf0Parser.g:211:3: this_EnvOneOf0AdditionalPropertiesTypeBoolean_3= ruleEnvOneOf0AdditionalPropertiesTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvOneOf0AdditionalPropertiesTypeBoolean_3=ruleEnvOneOf0AdditionalPropertiesTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvOneOf0AdditionalPropertiesTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEnvOneOf0Parser.g:220:3: this_EnvOneOf0AdditionalPropertiesTypeObject_4= ruleEnvOneOf0AdditionalPropertiesTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvOneOf0AdditionalPropertiesTypeObject_4=ruleEnvOneOf0AdditionalPropertiesTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvOneOf0AdditionalPropertiesTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEnvOneOf0Parser.g:229:3: this_EnvOneOf0AdditionalPropertiesTypeArray_5= ruleEnvOneOf0AdditionalPropertiesTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvOneOf0AdditionalPropertiesTypeArray_5=ruleEnvOneOf0AdditionalPropertiesTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvOneOf0AdditionalPropertiesTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEnvOneOf0Parser.g:238:3: this_EnvOneOf0AdditionalPropertiesTypeNull_6= ruleEnvOneOf0AdditionalPropertiesTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvOneOf0AdditionalPropertiesTypeNull_6=ruleEnvOneOf0AdditionalPropertiesTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvOneOf0AdditionalPropertiesTypeNull_6;
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesAbstract"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesPropertiesAbstract"
    // InternalEnvOneOf0Parser.g:250:1: entryRuleEnvOneOf0AdditionalPropertiesPropertiesAbstract returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract = null;


        try {
            // InternalEnvOneOf0Parser.g:250:88: (iv_ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract EOF )
            // InternalEnvOneOf0Parser.g:251:2: iv_ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract=ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesPropertiesAbstract"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract"
    // InternalEnvOneOf0Parser.g:257:1: ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract returns [EObject current=null] : ( ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties )=>this_EnvOneOf0AdditionalPropertiesAdditionalProperties_0= ruleEnvOneOf0AdditionalPropertiesAdditionalProperties ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvOneOf0AdditionalPropertiesAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:263:2: ( ( ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties )=>this_EnvOneOf0AdditionalPropertiesAdditionalProperties_0= ruleEnvOneOf0AdditionalPropertiesAdditionalProperties ) )
            // InternalEnvOneOf0Parser.g:264:2: ( ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties )=>this_EnvOneOf0AdditionalPropertiesAdditionalProperties_0= ruleEnvOneOf0AdditionalPropertiesAdditionalProperties )
            {
            // InternalEnvOneOf0Parser.g:264:2: ( ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties )=>this_EnvOneOf0AdditionalPropertiesAdditionalProperties_0= ruleEnvOneOf0AdditionalPropertiesAdditionalProperties )
            // InternalEnvOneOf0Parser.g:265:3: ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties )=>this_EnvOneOf0AdditionalPropertiesAdditionalProperties_0= ruleEnvOneOf0AdditionalPropertiesAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_EnvOneOf0AdditionalPropertiesAdditionalProperties_0=ruleEnvOneOf0AdditionalPropertiesAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EnvOneOf0AdditionalPropertiesAdditionalProperties_0;
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalEnvOneOf0Parser.g:278:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalEnvOneOf0Parser.g:278:46: (iv_ruleValue= ruleValue EOF )
            // InternalEnvOneOf0Parser.g:279:2: iv_ruleValue= ruleValue EOF
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
    // InternalEnvOneOf0Parser.g:285:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalEnvOneOf0Parser.g:291:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalEnvOneOf0Parser.g:292:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalEnvOneOf0Parser.g:292:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
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
                    // InternalEnvOneOf0Parser.g:293:3: this_StringValue_0= ruleStringValue
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
                    // InternalEnvOneOf0Parser.g:302:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalEnvOneOf0Parser.g:311:3: this_NullValue_2= ruleNullValue
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
                    // InternalEnvOneOf0Parser.g:320:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalEnvOneOf0Parser.g:329:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalEnvOneOf0Parser.g:338:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleEnvOneOf0AdditionalProperties"
    // InternalEnvOneOf0Parser.g:350:1: entryRuleEnvOneOf0AdditionalProperties returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalProperties= ruleEnvOneOf0AdditionalProperties EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalProperties = null;


        try {
            // InternalEnvOneOf0Parser.g:350:70: (iv_ruleEnvOneOf0AdditionalProperties= ruleEnvOneOf0AdditionalProperties EOF )
            // InternalEnvOneOf0Parser.g:351:2: iv_ruleEnvOneOf0AdditionalProperties= ruleEnvOneOf0AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalProperties=ruleEnvOneOf0AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalProperties; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalProperties"


    // $ANTLR start "ruleEnvOneOf0AdditionalProperties"
    // InternalEnvOneOf0Parser.g:357:1: ruleEnvOneOf0AdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesAbstract ) ) ) ;
    public final EObject ruleEnvOneOf0AdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:363:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesAbstract ) ) ) )
            // InternalEnvOneOf0Parser.g:364:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesAbstract ) ) )
            {
            // InternalEnvOneOf0Parser.g:364:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesAbstract ) ) )
            // InternalEnvOneOf0Parser.g:365:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesAbstract ) )
            {
            // InternalEnvOneOf0Parser.g:365:3: ( (lv_key_0_0= ruleEString ) )
            // InternalEnvOneOf0Parser.g:366:4: (lv_key_0_0= ruleEString )
            {
            // InternalEnvOneOf0Parser.g:366:4: (lv_key_0_0= ruleEString )
            // InternalEnvOneOf0Parser.g:367:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.EnvOneOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalEnvOneOf0Parser.g:388:3: ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesAbstract ) )
            // InternalEnvOneOf0Parser.g:389:4: (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesAbstract )
            {
            // InternalEnvOneOf0Parser.g:389:4: (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesAbstract )
            // InternalEnvOneOf0Parser.g:390:5: lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesAbstract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesAbstractParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleEnvOneOf0AdditionalPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.EnvOneOf0.EnvOneOf0AdditionalPropertiesAbstract");
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
    // $ANTLR end "ruleEnvOneOf0AdditionalProperties"


    // $ANTLR start "entryRuleEString"
    // InternalEnvOneOf0Parser.g:411:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEnvOneOf0Parser.g:411:47: (iv_ruleEString= ruleEString EOF )
            // InternalEnvOneOf0Parser.g:412:2: iv_ruleEString= ruleEString EOF
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
    // InternalEnvOneOf0Parser.g:418:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:424:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalEnvOneOf0Parser.g:425:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeString"
    // InternalEnvOneOf0Parser.g:438:1: entryRuleEnvOneOf0AdditionalPropertiesTypeString returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesTypeString= ruleEnvOneOf0AdditionalPropertiesTypeString EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesTypeString = null;


        try {
            // InternalEnvOneOf0Parser.g:438:80: (iv_ruleEnvOneOf0AdditionalPropertiesTypeString= ruleEnvOneOf0AdditionalPropertiesTypeString EOF )
            // InternalEnvOneOf0Parser.g:439:2: iv_ruleEnvOneOf0AdditionalPropertiesTypeString= ruleEnvOneOf0AdditionalPropertiesTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesTypeString=ruleEnvOneOf0AdditionalPropertiesTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesTypeString; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeString"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeString"
    // InternalEnvOneOf0Parser.g:445:1: ruleEnvOneOf0AdditionalPropertiesTypeString returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleEString ) ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:451:2: ( ( (lv_additionalProperties_0_0= ruleEString ) ) )
            // InternalEnvOneOf0Parser.g:452:2: ( (lv_additionalProperties_0_0= ruleEString ) )
            {
            // InternalEnvOneOf0Parser.g:452:2: ( (lv_additionalProperties_0_0= ruleEString ) )
            // InternalEnvOneOf0Parser.g:453:3: (lv_additionalProperties_0_0= ruleEString )
            {
            // InternalEnvOneOf0Parser.g:453:3: (lv_additionalProperties_0_0= ruleEString )
            // InternalEnvOneOf0Parser.g:454:4: lv_additionalProperties_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringAccess().getAdditionalPropertiesEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringRule());
              				}
              				set(
              					current,
              					"additionalProperties",
              					lv_additionalProperties_0_0,
              					"githubwf.githubwf.EnvOneOf0.EString");
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeString"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeInteger"
    // InternalEnvOneOf0Parser.g:474:1: entryRuleEnvOneOf0AdditionalPropertiesTypeInteger returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesTypeInteger= ruleEnvOneOf0AdditionalPropertiesTypeInteger EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesTypeInteger = null;


        try {
            // InternalEnvOneOf0Parser.g:474:81: (iv_ruleEnvOneOf0AdditionalPropertiesTypeInteger= ruleEnvOneOf0AdditionalPropertiesTypeInteger EOF )
            // InternalEnvOneOf0Parser.g:475:2: iv_ruleEnvOneOf0AdditionalPropertiesTypeInteger= ruleEnvOneOf0AdditionalPropertiesTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesTypeInteger=ruleEnvOneOf0AdditionalPropertiesTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesTypeInteger; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeInteger"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeInteger"
    // InternalEnvOneOf0Parser.g:481:1: ruleEnvOneOf0AdditionalPropertiesTypeInteger returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:487:2: ( ( (lv_additionalProperties_0_0= ruleEDoubleObject ) ) )
            // InternalEnvOneOf0Parser.g:488:2: ( (lv_additionalProperties_0_0= ruleEDoubleObject ) )
            {
            // InternalEnvOneOf0Parser.g:488:2: ( (lv_additionalProperties_0_0= ruleEDoubleObject ) )
            // InternalEnvOneOf0Parser.g:489:3: (lv_additionalProperties_0_0= ruleEDoubleObject )
            {
            // InternalEnvOneOf0Parser.g:489:3: (lv_additionalProperties_0_0= ruleEDoubleObject )
            // InternalEnvOneOf0Parser.g:490:4: lv_additionalProperties_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerAccess().getAdditionalPropertiesEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerRule());
              				}
              				set(
              					current,
              					"additionalProperties",
              					lv_additionalProperties_0_0,
              					"githubwf.githubwf.EnvOneOf0.EDoubleObject");
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeInteger"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeNumber"
    // InternalEnvOneOf0Parser.g:510:1: entryRuleEnvOneOf0AdditionalPropertiesTypeNumber returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesTypeNumber= ruleEnvOneOf0AdditionalPropertiesTypeNumber EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesTypeNumber = null;


        try {
            // InternalEnvOneOf0Parser.g:510:80: (iv_ruleEnvOneOf0AdditionalPropertiesTypeNumber= ruleEnvOneOf0AdditionalPropertiesTypeNumber EOF )
            // InternalEnvOneOf0Parser.g:511:2: iv_ruleEnvOneOf0AdditionalPropertiesTypeNumber= ruleEnvOneOf0AdditionalPropertiesTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesTypeNumber=ruleEnvOneOf0AdditionalPropertiesTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesTypeNumber; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeNumber"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeNumber"
    // InternalEnvOneOf0Parser.g:517:1: ruleEnvOneOf0AdditionalPropertiesTypeNumber returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:523:2: ( ( (lv_additionalProperties_0_0= ruleEDoubleObject ) ) )
            // InternalEnvOneOf0Parser.g:524:2: ( (lv_additionalProperties_0_0= ruleEDoubleObject ) )
            {
            // InternalEnvOneOf0Parser.g:524:2: ( (lv_additionalProperties_0_0= ruleEDoubleObject ) )
            // InternalEnvOneOf0Parser.g:525:3: (lv_additionalProperties_0_0= ruleEDoubleObject )
            {
            // InternalEnvOneOf0Parser.g:525:3: (lv_additionalProperties_0_0= ruleEDoubleObject )
            // InternalEnvOneOf0Parser.g:526:4: lv_additionalProperties_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberAccess().getAdditionalPropertiesEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberRule());
              				}
              				set(
              					current,
              					"additionalProperties",
              					lv_additionalProperties_0_0,
              					"githubwf.githubwf.EnvOneOf0.EDoubleObject");
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeNumber"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeBoolean"
    // InternalEnvOneOf0Parser.g:546:1: entryRuleEnvOneOf0AdditionalPropertiesTypeBoolean returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesTypeBoolean= ruleEnvOneOf0AdditionalPropertiesTypeBoolean EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesTypeBoolean = null;


        try {
            // InternalEnvOneOf0Parser.g:546:81: (iv_ruleEnvOneOf0AdditionalPropertiesTypeBoolean= ruleEnvOneOf0AdditionalPropertiesTypeBoolean EOF )
            // InternalEnvOneOf0Parser.g:547:2: iv_ruleEnvOneOf0AdditionalPropertiesTypeBoolean= ruleEnvOneOf0AdditionalPropertiesTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesTypeBoolean=ruleEnvOneOf0AdditionalPropertiesTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesTypeBoolean; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeBoolean"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeBoolean"
    // InternalEnvOneOf0Parser.g:553:1: ruleEnvOneOf0AdditionalPropertiesTypeBoolean returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:559:2: ( ( (lv_additionalProperties_0_0= ruleEBooleanObject ) ) )
            // InternalEnvOneOf0Parser.g:560:2: ( (lv_additionalProperties_0_0= ruleEBooleanObject ) )
            {
            // InternalEnvOneOf0Parser.g:560:2: ( (lv_additionalProperties_0_0= ruleEBooleanObject ) )
            // InternalEnvOneOf0Parser.g:561:3: (lv_additionalProperties_0_0= ruleEBooleanObject )
            {
            // InternalEnvOneOf0Parser.g:561:3: (lv_additionalProperties_0_0= ruleEBooleanObject )
            // InternalEnvOneOf0Parser.g:562:4: lv_additionalProperties_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanAccess().getAdditionalPropertiesEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanRule());
              				}
              				set(
              					current,
              					"additionalProperties",
              					lv_additionalProperties_0_0,
              					"githubwf.githubwf.EnvOneOf0.EBooleanObject");
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeBoolean"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeObject"
    // InternalEnvOneOf0Parser.g:582:1: entryRuleEnvOneOf0AdditionalPropertiesTypeObject returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesTypeObject= ruleEnvOneOf0AdditionalPropertiesTypeObject EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesTypeObject = null;


        try {
            // InternalEnvOneOf0Parser.g:582:80: (iv_ruleEnvOneOf0AdditionalPropertiesTypeObject= ruleEnvOneOf0AdditionalPropertiesTypeObject EOF )
            // InternalEnvOneOf0Parser.g:583:2: iv_ruleEnvOneOf0AdditionalPropertiesTypeObject= ruleEnvOneOf0AdditionalPropertiesTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesTypeObject=ruleEnvOneOf0AdditionalPropertiesTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesTypeObject; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeObject"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeObject"
    // InternalEnvOneOf0Parser.g:589:1: ruleEnvOneOf0AdditionalPropertiesTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_additionalProperties_2_0 = null;

        EObject lv_additionalProperties_4_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:595:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalEnvOneOf0Parser.g:596:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalEnvOneOf0Parser.g:596:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalEnvOneOf0Parser.g:597:3: () otherlv_1= LeftCurlyBracket ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalEnvOneOf0Parser.g:597:3: ()
            // InternalEnvOneOf0Parser.g:598:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getEnvOneOf0AdditionalPropertiesTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalEnvOneOf0Parser.g:608:3: ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:609:4: ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) )*
                    {
                    // InternalEnvOneOf0Parser.g:609:4: ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) )
                    // InternalEnvOneOf0Parser.g:610:5: (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract )
                    {
                    // InternalEnvOneOf0Parser.g:610:5: (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract )
                    // InternalEnvOneOf0Parser.g:611:6: lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_additionalProperties_2_0=ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"additionalProperties",
                      							lv_additionalProperties_2_0,
                      							"githubwf.githubwf.EnvOneOf0.EnvOneOf0AdditionalPropertiesPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEnvOneOf0Parser.g:628:4: (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEnvOneOf0Parser.g:629:5: otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEnvOneOf0Parser.g:633:5: ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) )
                    	    // InternalEnvOneOf0Parser.g:634:6: (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract )
                    	    {
                    	    // InternalEnvOneOf0Parser.g:634:6: (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract )
                    	    // InternalEnvOneOf0Parser.g:635:7: lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_additionalProperties_4_0=ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"additionalProperties",
                    	      								lv_additionalProperties_4_0,
                    	      								"githubwf.githubwf.EnvOneOf0.EnvOneOf0AdditionalPropertiesPropertiesAbstract");
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

              			newLeafNode(otherlv_5, grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeObject"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeArray"
    // InternalEnvOneOf0Parser.g:662:1: entryRuleEnvOneOf0AdditionalPropertiesTypeArray returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesTypeArray= ruleEnvOneOf0AdditionalPropertiesTypeArray EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesTypeArray = null;


        try {
            // InternalEnvOneOf0Parser.g:662:79: (iv_ruleEnvOneOf0AdditionalPropertiesTypeArray= ruleEnvOneOf0AdditionalPropertiesTypeArray EOF )
            // InternalEnvOneOf0Parser.g:663:2: iv_ruleEnvOneOf0AdditionalPropertiesTypeArray= ruleEnvOneOf0AdditionalPropertiesTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesTypeArray=ruleEnvOneOf0AdditionalPropertiesTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesTypeArray; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeArray"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeArray"
    // InternalEnvOneOf0Parser.g:669:1: ruleEnvOneOf0AdditionalPropertiesTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_additionalProperties_2_0 = null;

        EObject lv_additionalProperties_4_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:675:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalEnvOneOf0Parser.g:676:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalEnvOneOf0Parser.g:676:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalEnvOneOf0Parser.g:677:3: () otherlv_1= LeftSquareBracket ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalEnvOneOf0Parser.g:677:3: ()
            // InternalEnvOneOf0Parser.g:678:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getEnvOneOf0AdditionalPropertiesTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalEnvOneOf0Parser.g:688:3: ( ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=False && LA8_0<=True)||LA8_0==LeftSquareBracket||LA8_0==LeftCurlyBracket||(LA8_0>=RULE_STRING && LA8_0<=RULE_E_DOUBLE)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:689:4: ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) )*
                    {
                    // InternalEnvOneOf0Parser.g:689:4: ( (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems ) )
                    // InternalEnvOneOf0Parser.g:690:5: (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems )
                    {
                    // InternalEnvOneOf0Parser.g:690:5: (lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems )
                    // InternalEnvOneOf0Parser.g:691:6: lv_additionalProperties_2_0= ruleEnvOneOf0AdditionalPropertiesItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_additionalProperties_2_0=ruleEnvOneOf0AdditionalPropertiesItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"additionalProperties",
                      							lv_additionalProperties_2_0,
                      							"githubwf.githubwf.EnvOneOf0.EnvOneOf0AdditionalPropertiesItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEnvOneOf0Parser.g:708:4: (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Comma) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEnvOneOf0Parser.g:709:5: otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEnvOneOf0Parser.g:713:5: ( (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems ) )
                    	    // InternalEnvOneOf0Parser.g:714:6: (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems )
                    	    {
                    	    // InternalEnvOneOf0Parser.g:714:6: (lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems )
                    	    // InternalEnvOneOf0Parser.g:715:7: lv_additionalProperties_4_0= ruleEnvOneOf0AdditionalPropertiesItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_additionalProperties_4_0=ruleEnvOneOf0AdditionalPropertiesItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"additionalProperties",
                    	      								lv_additionalProperties_4_0,
                    	      								"githubwf.githubwf.EnvOneOf0.EnvOneOf0AdditionalPropertiesItems");
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

              			newLeafNode(otherlv_5, grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeArray"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeNull"
    // InternalEnvOneOf0Parser.g:742:1: entryRuleEnvOneOf0AdditionalPropertiesTypeNull returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesTypeNull= ruleEnvOneOf0AdditionalPropertiesTypeNull EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesTypeNull = null;


        try {
            // InternalEnvOneOf0Parser.g:742:78: (iv_ruleEnvOneOf0AdditionalPropertiesTypeNull= ruleEnvOneOf0AdditionalPropertiesTypeNull EOF )
            // InternalEnvOneOf0Parser.g:743:2: iv_ruleEnvOneOf0AdditionalPropertiesTypeNull= ruleEnvOneOf0AdditionalPropertiesTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesTypeNull=ruleEnvOneOf0AdditionalPropertiesTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesTypeNull; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeNull"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeNull"
    // InternalEnvOneOf0Parser.g:749:1: ruleEnvOneOf0AdditionalPropertiesTypeNull returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleNullValue ) ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:755:2: ( ( (lv_additionalProperties_0_0= ruleNullValue ) ) )
            // InternalEnvOneOf0Parser.g:756:2: ( (lv_additionalProperties_0_0= ruleNullValue ) )
            {
            // InternalEnvOneOf0Parser.g:756:2: ( (lv_additionalProperties_0_0= ruleNullValue ) )
            // InternalEnvOneOf0Parser.g:757:3: (lv_additionalProperties_0_0= ruleNullValue )
            {
            // InternalEnvOneOf0Parser.g:757:3: (lv_additionalProperties_0_0= ruleNullValue )
            // InternalEnvOneOf0Parser.g:758:4: lv_additionalProperties_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullAccess().getAdditionalPropertiesNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullRule());
              				}
              				set(
              					current,
              					"additionalProperties",
              					lv_additionalProperties_0_0,
              					"githubwf.githubwf.EnvOneOf0.NullValue");
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeNull"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalEnvOneOf0Parser.g:778:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalEnvOneOf0Parser.g:778:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalEnvOneOf0Parser.g:779:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalEnvOneOf0Parser.g:785:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:791:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalEnvOneOf0Parser.g:792:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalEnvOneOf0Parser.g:792:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
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
                    // InternalEnvOneOf0Parser.g:793:3: this_E_INT_0= RULE_E_INT
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
                    // InternalEnvOneOf0Parser.g:801:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalEnvOneOf0Parser.g:812:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalEnvOneOf0Parser.g:812:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalEnvOneOf0Parser.g:813:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalEnvOneOf0Parser.g:819:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:825:2: ( (kw= True | kw= False ) )
            // InternalEnvOneOf0Parser.g:826:2: (kw= True | kw= False )
            {
            // InternalEnvOneOf0Parser.g:826:2: (kw= True | kw= False )
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
                    // InternalEnvOneOf0Parser.g:827:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEnvOneOf0Parser.g:833:3: kw= False
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


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesAdditionalProperties"
    // InternalEnvOneOf0Parser.g:842:1: entryRuleEnvOneOf0AdditionalPropertiesAdditionalProperties returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesAdditionalProperties= ruleEnvOneOf0AdditionalPropertiesAdditionalProperties EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesAdditionalProperties = null;


        try {
            // InternalEnvOneOf0Parser.g:842:90: (iv_ruleEnvOneOf0AdditionalPropertiesAdditionalProperties= ruleEnvOneOf0AdditionalPropertiesAdditionalProperties EOF )
            // InternalEnvOneOf0Parser.g:843:2: iv_ruleEnvOneOf0AdditionalPropertiesAdditionalProperties= ruleEnvOneOf0AdditionalPropertiesAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesAdditionalProperties=ruleEnvOneOf0AdditionalPropertiesAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesAdditionalProperties; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesAdditionalProperties"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesAdditionalProperties"
    // InternalEnvOneOf0Parser.g:849:1: ruleEnvOneOf0AdditionalPropertiesAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:855:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalEnvOneOf0Parser.g:856:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalEnvOneOf0Parser.g:856:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalEnvOneOf0Parser.g:857:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalEnvOneOf0Parser.g:857:3: ( (lv_key_0_0= ruleEString ) )
            // InternalEnvOneOf0Parser.g:858:4: (lv_key_0_0= ruleEString )
            {
            // InternalEnvOneOf0Parser.g:858:4: (lv_key_0_0= ruleEString )
            // InternalEnvOneOf0Parser.g:859:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.EnvOneOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalEnvOneOf0Parser.g:880:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalEnvOneOf0Parser.g:881:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalEnvOneOf0Parser.g:881:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalEnvOneOf0Parser.g:882:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.EnvOneOf0.JsonDocument");
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalEnvOneOf0Parser.g:903:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalEnvOneOf0Parser.g:903:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalEnvOneOf0Parser.g:904:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalEnvOneOf0Parser.g:910:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:916:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalEnvOneOf0Parser.g:917:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalEnvOneOf0Parser.g:917:2: ( (lv_value_0_0= ruleValue ) )
            // InternalEnvOneOf0Parser.g:918:3: (lv_value_0_0= ruleValue )
            {
            // InternalEnvOneOf0Parser.g:918:3: (lv_value_0_0= ruleValue )
            // InternalEnvOneOf0Parser.g:919:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.EnvOneOf0.Value");
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
    // InternalEnvOneOf0Parser.g:939:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalEnvOneOf0Parser.g:939:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalEnvOneOf0Parser.g:940:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalEnvOneOf0Parser.g:946:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:952:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalEnvOneOf0Parser.g:953:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalEnvOneOf0Parser.g:953:2: ( (lv_value_0_0= ruleEString ) )
            // InternalEnvOneOf0Parser.g:954:3: (lv_value_0_0= ruleEString )
            {
            // InternalEnvOneOf0Parser.g:954:3: (lv_value_0_0= ruleEString )
            // InternalEnvOneOf0Parser.g:955:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.EnvOneOf0.EString");
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
    // InternalEnvOneOf0Parser.g:975:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalEnvOneOf0Parser.g:975:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalEnvOneOf0Parser.g:976:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalEnvOneOf0Parser.g:982:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:988:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalEnvOneOf0Parser.g:989:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalEnvOneOf0Parser.g:989:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalEnvOneOf0Parser.g:990:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalEnvOneOf0Parser.g:990:3: ()
            // InternalEnvOneOf0Parser.g:991:4: 
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
            // InternalEnvOneOf0Parser.g:1001:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=False && LA12_0<=True)||LA12_0==LeftSquareBracket||LA12_0==LeftCurlyBracket||(LA12_0>=RULE_STRING && LA12_0<=RULE_E_DOUBLE)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:1002:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalEnvOneOf0Parser.g:1002:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalEnvOneOf0Parser.g:1003:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalEnvOneOf0Parser.g:1003:5: (lv_value_2_0= ruleValue )
                    // InternalEnvOneOf0Parser.g:1004:6: lv_value_2_0= ruleValue
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
                      							"githubwf.githubwf.EnvOneOf0.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEnvOneOf0Parser.g:1021:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Comma) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalEnvOneOf0Parser.g:1022:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEnvOneOf0Parser.g:1026:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalEnvOneOf0Parser.g:1027:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalEnvOneOf0Parser.g:1027:6: (lv_value_4_0= ruleValue )
                    	    // InternalEnvOneOf0Parser.g:1028:7: lv_value_4_0= ruleValue
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
                    	      								"githubwf.githubwf.EnvOneOf0.Value");
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
    // InternalEnvOneOf0Parser.g:1055:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalEnvOneOf0Parser.g:1055:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalEnvOneOf0Parser.g:1056:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalEnvOneOf0Parser.g:1062:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:1068:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalEnvOneOf0Parser.g:1069:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalEnvOneOf0Parser.g:1069:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalEnvOneOf0Parser.g:1070:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalEnvOneOf0Parser.g:1070:3: (lv_value_0_0= ruleNullEnum )
            // InternalEnvOneOf0Parser.g:1071:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.EnvOneOf0.NullEnum");
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
    // InternalEnvOneOf0Parser.g:1091:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalEnvOneOf0Parser.g:1091:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalEnvOneOf0Parser.g:1092:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalEnvOneOf0Parser.g:1098:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:1104:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalEnvOneOf0Parser.g:1105:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalEnvOneOf0Parser.g:1105:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalEnvOneOf0Parser.g:1106:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalEnvOneOf0Parser.g:1106:3: (lv_value_0_0= ruleEDouble )
            // InternalEnvOneOf0Parser.g:1107:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.EnvOneOf0.EDouble");
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
    // InternalEnvOneOf0Parser.g:1127:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalEnvOneOf0Parser.g:1127:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalEnvOneOf0Parser.g:1128:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalEnvOneOf0Parser.g:1134:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:1140:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalEnvOneOf0Parser.g:1141:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalEnvOneOf0Parser.g:1141:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalEnvOneOf0Parser.g:1142:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalEnvOneOf0Parser.g:1142:3: ()
            // InternalEnvOneOf0Parser.g:1143:4: 
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
            // InternalEnvOneOf0Parser.g:1153:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:1154:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalEnvOneOf0Parser.g:1154:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalEnvOneOf0Parser.g:1155:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalEnvOneOf0Parser.g:1155:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalEnvOneOf0Parser.g:1156:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.EnvOneOf0.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEnvOneOf0Parser.g:1173:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Comma) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalEnvOneOf0Parser.g:1174:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalEnvOneOf0Parser.g:1178:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalEnvOneOf0Parser.g:1179:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalEnvOneOf0Parser.g:1179:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalEnvOneOf0Parser.g:1180:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.EnvOneOf0.KeyValuePair");
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
    // InternalEnvOneOf0Parser.g:1207:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalEnvOneOf0Parser.g:1207:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalEnvOneOf0Parser.g:1208:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalEnvOneOf0Parser.g:1214:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:1220:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalEnvOneOf0Parser.g:1221:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalEnvOneOf0Parser.g:1221:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalEnvOneOf0Parser.g:1222:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalEnvOneOf0Parser.g:1222:3: (lv_value_0_0= ruleEBoolean )
            // InternalEnvOneOf0Parser.g:1223:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.EnvOneOf0.EBoolean");
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
    // InternalEnvOneOf0Parser.g:1243:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalEnvOneOf0Parser.g:1243:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalEnvOneOf0Parser.g:1244:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalEnvOneOf0Parser.g:1250:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:1256:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalEnvOneOf0Parser.g:1257:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalEnvOneOf0Parser.g:1257:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
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
                    // InternalEnvOneOf0Parser.g:1258:3: this_E_INT_0= RULE_E_INT
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
                    // InternalEnvOneOf0Parser.g:1266:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalEnvOneOf0Parser.g:1277:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalEnvOneOf0Parser.g:1277:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalEnvOneOf0Parser.g:1278:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalEnvOneOf0Parser.g:1284:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:1290:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalEnvOneOf0Parser.g:1291:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalEnvOneOf0Parser.g:1291:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalEnvOneOf0Parser.g:1292:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalEnvOneOf0Parser.g:1292:3: ( (lv_key_0_0= ruleEString ) )
            // InternalEnvOneOf0Parser.g:1293:4: (lv_key_0_0= ruleEString )
            {
            // InternalEnvOneOf0Parser.g:1293:4: (lv_key_0_0= ruleEString )
            // InternalEnvOneOf0Parser.g:1294:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.EnvOneOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalEnvOneOf0Parser.g:1315:3: ( (lv_value_2_0= ruleValue ) )
            // InternalEnvOneOf0Parser.g:1316:4: (lv_value_2_0= ruleValue )
            {
            // InternalEnvOneOf0Parser.g:1316:4: (lv_value_2_0= ruleValue )
            // InternalEnvOneOf0Parser.g:1317:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.EnvOneOf0.Value");
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
    // InternalEnvOneOf0Parser.g:1338:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalEnvOneOf0Parser.g:1338:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalEnvOneOf0Parser.g:1339:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalEnvOneOf0Parser.g:1345:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:1351:2: ( (kw= True | kw= False ) )
            // InternalEnvOneOf0Parser.g:1352:2: (kw= True | kw= False )
            {
            // InternalEnvOneOf0Parser.g:1352:2: (kw= True | kw= False )
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
                    // InternalEnvOneOf0Parser.g:1353:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEnvOneOf0Parser.g:1359:3: kw= False
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


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesItems"
    // InternalEnvOneOf0Parser.g:1368:1: entryRuleEnvOneOf0AdditionalPropertiesItems returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesItems= ruleEnvOneOf0AdditionalPropertiesItems EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesItems = null;


        try {
            // InternalEnvOneOf0Parser.g:1368:75: (iv_ruleEnvOneOf0AdditionalPropertiesItems= ruleEnvOneOf0AdditionalPropertiesItems EOF )
            // InternalEnvOneOf0Parser.g:1369:2: iv_ruleEnvOneOf0AdditionalPropertiesItems= ruleEnvOneOf0AdditionalPropertiesItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesItems=ruleEnvOneOf0AdditionalPropertiesItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvOneOf0AdditionalPropertiesItems; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesItems"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesItems"
    // InternalEnvOneOf0Parser.g:1375:1: ruleEnvOneOf0AdditionalPropertiesItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:1381:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalEnvOneOf0Parser.g:1382:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalEnvOneOf0Parser.g:1382:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalEnvOneOf0Parser.g:1383:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalEnvOneOf0Parser.g:1383:3: (lv_items_0_0= ruleJsonDocument )
            // InternalEnvOneOf0Parser.g:1384:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.EnvOneOf0.JsonDocument");
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalEnvOneOf0Parser.g:1404:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalEnvOneOf0Parser.g:1404:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalEnvOneOf0Parser.g:1405:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalEnvOneOf0Parser.g:1411:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:1417:2: (this_STRING_0= RULE_STRING )
            // InternalEnvOneOf0Parser.g:1418:2: this_STRING_0= RULE_STRING
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
    // InternalEnvOneOf0Parser.g:1428:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalEnvOneOf0Parser.g:1434:2: ( (enumLiteral_0= Null ) )
            // InternalEnvOneOf0Parser.g:1435:2: (enumLiteral_0= Null )
            {
            // InternalEnvOneOf0Parser.g:1435:2: (enumLiteral_0= Null )
            // InternalEnvOneOf0Parser.g:1436:3: enumLiteral_0= Null
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

    // $ANTLR start synpred2_InternalEnvOneOf0Parser
    public final void synpred2_InternalEnvOneOf0Parser_fragment() throws RecognitionException {   
        // InternalEnvOneOf0Parser.g:182:4: ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )
        // InternalEnvOneOf0Parser.g:182:5: ruleEnvOneOf0AdditionalPropertiesTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleEnvOneOf0AdditionalPropertiesTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalEnvOneOf0Parser

    // Delegated rules

    public final boolean synpred2_InternalEnvOneOf0Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEnvOneOf0Parser_fragment(); // can never throw exception
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
            return "180:2: ( ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )=>this_EnvOneOf0AdditionalPropertiesTypeNumber_0= ruleEnvOneOf0AdditionalPropertiesTypeNumber ) | this_EnvOneOf0AdditionalPropertiesTypeString_1= ruleEnvOneOf0AdditionalPropertiesTypeString | this_EnvOneOf0AdditionalPropertiesTypeInteger_2= ruleEnvOneOf0AdditionalPropertiesTypeInteger | this_EnvOneOf0AdditionalPropertiesTypeBoolean_3= ruleEnvOneOf0AdditionalPropertiesTypeBoolean | this_EnvOneOf0AdditionalPropertiesTypeObject_4= ruleEnvOneOf0AdditionalPropertiesTypeObject | this_EnvOneOf0AdditionalPropertiesTypeArray_5= ruleEnvOneOf0AdditionalPropertiesTypeArray | this_EnvOneOf0AdditionalPropertiesTypeNull_6= ruleEnvOneOf0AdditionalPropertiesTypeNull )";
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
                        if ( (synpred2_InternalEnvOneOf0Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalEnvOneOf0Parser()) ) {s = 8;}

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
