/*
 * generated by Xtext 2.23.0
 */
parser grammar InternalPermissionsOneOf0Parser;

options {
	tokenVocab=InternalPermissionsOneOf0Lexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
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
import githubwf.githubwf.services.PermissionsOneOf0GrammarAccess;

}

@members {

 	private PermissionsOneOf0GrammarAccess grammarAccess;

    public InternalPermissionsOneOf0Parser(TokenStream input, PermissionsOneOf0GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "PermissionsOneOf0";
   	}

   	@Override
   	protected PermissionsOneOf0GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePermissionsOneOf0
entryRulePermissionsOneOf0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPermissionsOneOf0Rule()); }
	iv_rulePermissionsOneOf0=rulePermissionsOneOf0
	{ $current=$iv_rulePermissionsOneOf0.current; }
	EOF;

// Rule PermissionsOneOf0
rulePermissionsOneOf0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getPermissionsOneOf0Access().getPermissionsJsonDocumentParserRuleCall_0());
			}
			lv_permissions_0_0=ruleJsonDocument
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getPermissionsOneOf0Rule());
				}
				set(
					$current,
					"permissions",
					lv_permissions_0_0,
					"githubwf.githubwf.PermissionsOneOf0.JsonDocument");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0());
		}
		this_StringValue_0=ruleStringValue
		{
			$current = $this_StringValue_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getArrayValueParserRuleCall_1());
		}
		this_ArrayValue_1=ruleArrayValue
		{
			$current = $this_ArrayValue_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getNullValueParserRuleCall_2());
		}
		this_NullValue_2=ruleNullValue
		{
			$current = $this_NullValue_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3());
		}
		this_NumberValue_3=ruleNumberValue
		{
			$current = $this_NumberValue_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4());
		}
		this_ObjectValue_4=ruleObjectValue
		{
			$current = $this_ObjectValue_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_5());
		}
		this_BooleanValue_5=ruleBooleanValue
		{
			$current = $this_BooleanValue_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleJsonDocument
entryRuleJsonDocument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonDocumentRule()); }
	iv_ruleJsonDocument=ruleJsonDocument
	{ $current=$iv_ruleJsonDocument.current; }
	EOF;

// Rule JsonDocument
ruleJsonDocument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0());
			}
			lv_value_0_0=ruleValue
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getJsonDocumentRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"githubwf.githubwf.PermissionsOneOf0.Value");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleStringValue
entryRuleStringValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringValueRule()); }
	iv_ruleStringValue=ruleStringValue
	{ $current=$iv_ruleStringValue.current; }
	EOF;

// Rule StringValue
ruleStringValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0());
			}
			lv_value_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getStringValueRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"githubwf.githubwf.PermissionsOneOf0.EString");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleArrayValue
entryRuleArrayValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayValueRule()); }
	iv_ruleArrayValue=ruleArrayValue
	{ $current=$iv_ruleArrayValue.current; }
	EOF;

// Rule ArrayValue
ruleArrayValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
					$current);
			}
		)
		otherlv_1=LeftSquareBracket
		{
			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
					}
					lv_value_2_0=ruleValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayValueRule());
						}
						add(
							$current,
							"value",
							lv_value_2_0,
							"githubwf.githubwf.PermissionsOneOf0.Value");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=Comma
				{
					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
						}
						lv_value_4_0=ruleValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getArrayValueRule());
							}
							add(
								$current,
								"value",
								lv_value_4_0,
								"githubwf.githubwf.PermissionsOneOf0.Value");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=RightSquareBracket
		{
			newLeafNode(otherlv_5, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleNullValue
entryRuleNullValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNullValueRule()); }
	iv_ruleNullValue=ruleNullValue
	{ $current=$iv_ruleNullValue.current; }
	EOF;

// Rule NullValue
ruleNullValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0());
			}
			lv_value_0_0=ruleNullEnum
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getNullValueRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"githubwf.githubwf.PermissionsOneOf0.NullEnum");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleNumberValue
entryRuleNumberValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberValueRule()); }
	iv_ruleNumberValue=ruleNumberValue
	{ $current=$iv_ruleNumberValue.current; }
	EOF;

// Rule NumberValue
ruleNumberValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0());
			}
			lv_value_0_0=ruleEDouble
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getNumberValueRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"githubwf.githubwf.PermissionsOneOf0.EDouble");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleObjectValue
entryRuleObjectValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectValueRule()); }
	iv_ruleObjectValue=ruleObjectValue
	{ $current=$iv_ruleObjectValue.current; }
	EOF;

// Rule ObjectValue
ruleObjectValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
					$current);
			}
		)
		otherlv_1=LeftCurlyBracket
		{
			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
					}
					lv_keyvaluepair_2_0=ruleKeyValuePair
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getObjectValueRule());
						}
						add(
							$current,
							"keyvaluepair",
							lv_keyvaluepair_2_0,
							"githubwf.githubwf.PermissionsOneOf0.KeyValuePair");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=Comma
				{
					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
						}
						lv_keyvaluepair_4_0=ruleKeyValuePair
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getObjectValueRule());
							}
							add(
								$current,
								"keyvaluepair",
								lv_keyvaluepair_4_0,
								"githubwf.githubwf.PermissionsOneOf0.KeyValuePair");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=RightCurlyBracket
		{
			newLeafNode(otherlv_5, grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleBooleanValue
entryRuleBooleanValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanValueRule()); }
	iv_ruleBooleanValue=ruleBooleanValue
	{ $current=$iv_ruleBooleanValue.current; }
	EOF;

// Rule BooleanValue
ruleBooleanValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0());
			}
			lv_value_0_0=ruleEBoolean
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getBooleanValueRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"githubwf.githubwf.PermissionsOneOf0.EBoolean");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall());
	}
	this_VALID_STRING_0=ruleVALID_STRING
	{
		$current.merge(this_VALID_STRING_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_E_INT_0=RULE_E_INT
		{
			$current.merge(this_E_INT_0);
		}
		{
			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0());
		}
		    |
		this_E_DOUBLE_1=RULE_E_DOUBLE
		{
			$current.merge(this_E_DOUBLE_1);
		}
		{
			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleKeyValuePair
entryRuleKeyValuePair returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeyValuePairRule()); }
	iv_ruleKeyValuePair=ruleKeyValuePair
	{ $current=$iv_ruleKeyValuePair.current; }
	EOF;

// Rule KeyValuePair
ruleKeyValuePair returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
				}
				lv_key_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
					}
					set(
						$current,
						"key",
						lv_key_0_0,
						"githubwf.githubwf.PermissionsOneOf0.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0());
				}
				lv_value_2_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"githubwf.githubwf.PermissionsOneOf0.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); }
	iv_ruleEBoolean=ruleEBoolean
	{ $current=$iv_ruleEBoolean.current.getText(); }
	EOF;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=True
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
		}
		    |
		kw=False
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
		}
	)
;

// Entry rule entryRuleVALID_STRING
entryRuleVALID_STRING returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVALID_STRINGRule()); }
	iv_ruleVALID_STRING=ruleVALID_STRING
	{ $current=$iv_ruleVALID_STRING.current.getText(); }
	EOF;

// Rule VALID_STRING
ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall());
	}
;

// Rule NullEnum
ruleNullEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0=Null
		{
			$current = grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration());
		}
	)
;
