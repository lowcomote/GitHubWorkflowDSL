/*
 * generated by Xtext 2.23.0
 */
parser grammar InternalRefOneOf0AllOf2Parser;

options {
	tokenVocab=InternalRefOneOf0AllOf2Lexer;
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
import githubwf.githubwf.services.RefOneOf0AllOf2GrammarAccess;

}

@members {

 	private RefOneOf0AllOf2GrammarAccess grammarAccess;

    public InternalRefOneOf0AllOf2Parser(TokenStream input, RefOneOf0AllOf2GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "RefOneOf0AllOf2";
   	}

   	@Override
   	protected RefOneOf0AllOf2GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRefOneOf0AllOf2
entryRuleRefOneOf0AllOf2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2Rule()); }
	iv_ruleRefOneOf0AllOf2=ruleRefOneOf0AllOf2
	{ $current=$iv_ruleRefOneOf0AllOf2.current; }
	EOF;

// Rule RefOneOf0AllOf2
ruleRefOneOf0AllOf2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2Access().getRefRefOneOf0AllOf2AbstractParserRuleCall_0());
			}
			lv_ref_0_0=ruleRefOneOf0AllOf2Abstract
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2Rule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2.RefOneOf0AllOf2Abstract");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRefOneOf0AllOf2Abstract
entryRuleRefOneOf0AllOf2Abstract returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2AbstractRule()); }
	iv_ruleRefOneOf0AllOf2Abstract=ruleRefOneOf0AllOf2Abstract
	{ $current=$iv_ruleRefOneOf0AllOf2Abstract.current; }
	EOF;

// Rule RefOneOf0AllOf2Abstract
ruleRefOneOf0AllOf2Abstract returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(ruleRefOneOf0AllOf2TypeNumber)=>
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2AbstractAccess().getRefOneOf0AllOf2TypeNumberParserRuleCall_0());
			}
			this_RefOneOf0AllOf2TypeNumber_0=ruleRefOneOf0AllOf2TypeNumber
			{
				$current = $this_RefOneOf0AllOf2TypeNumber_0.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2AbstractAccess().getRefOneOf0AllOf2TypeStringParserRuleCall_1());
		}
		this_RefOneOf0AllOf2TypeString_1=ruleRefOneOf0AllOf2TypeString
		{
			$current = $this_RefOneOf0AllOf2TypeString_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2AbstractAccess().getRefOneOf0AllOf2TypeIntegerParserRuleCall_2());
		}
		this_RefOneOf0AllOf2TypeInteger_2=ruleRefOneOf0AllOf2TypeInteger
		{
			$current = $this_RefOneOf0AllOf2TypeInteger_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2AbstractAccess().getRefOneOf0AllOf2TypeBooleanParserRuleCall_3());
		}
		this_RefOneOf0AllOf2TypeBoolean_3=ruleRefOneOf0AllOf2TypeBoolean
		{
			$current = $this_RefOneOf0AllOf2TypeBoolean_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2AbstractAccess().getRefOneOf0AllOf2TypeObjectParserRuleCall_4());
		}
		this_RefOneOf0AllOf2TypeObject_4=ruleRefOneOf0AllOf2TypeObject
		{
			$current = $this_RefOneOf0AllOf2TypeObject_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2AbstractAccess().getRefOneOf0AllOf2TypeArrayParserRuleCall_5());
		}
		this_RefOneOf0AllOf2TypeArray_5=ruleRefOneOf0AllOf2TypeArray
		{
			$current = $this_RefOneOf0AllOf2TypeArray_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2AbstractAccess().getRefOneOf0AllOf2TypeNullParserRuleCall_6());
		}
		this_RefOneOf0AllOf2TypeNull_6=ruleRefOneOf0AllOf2TypeNull
		{
			$current = $this_RefOneOf0AllOf2TypeNull_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRefOneOf0AllOf2PropertiesAbstract
entryRuleRefOneOf0AllOf2PropertiesAbstract returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2PropertiesAbstractRule()); }
	iv_ruleRefOneOf0AllOf2PropertiesAbstract=ruleRefOneOf0AllOf2PropertiesAbstract
	{ $current=$iv_ruleRefOneOf0AllOf2PropertiesAbstract.current; }
	EOF;

// Rule RefOneOf0AllOf2PropertiesAbstract
ruleRefOneOf0AllOf2PropertiesAbstract returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(ruleRefOneOf0AllOf2AdditionalProperties)=>
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2PropertiesAbstractAccess().getRefOneOf0AllOf2AdditionalPropertiesParserRuleCall());
		}
		this_RefOneOf0AllOf2AdditionalProperties_0=ruleRefOneOf0AllOf2AdditionalProperties
		{
			$current = $this_RefOneOf0AllOf2AdditionalProperties_0.current;
			afterParserOrEnumRuleCall();
		}
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

// Entry rule entryRuleRefOneOf0AllOf2TypeString
entryRuleRefOneOf0AllOf2TypeString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeStringRule()); }
	iv_ruleRefOneOf0AllOf2TypeString=ruleRefOneOf0AllOf2TypeString
	{ $current=$iv_ruleRefOneOf0AllOf2TypeString.current; }
	EOF;

// Rule RefOneOf0AllOf2TypeString
ruleRefOneOf0AllOf2TypeString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeStringAccess().getRefEStringParserRuleCall_0());
			}
			lv_ref_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2TypeStringRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2.EString");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRefOneOf0AllOf2TypeInteger
entryRuleRefOneOf0AllOf2TypeInteger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeIntegerRule()); }
	iv_ruleRefOneOf0AllOf2TypeInteger=ruleRefOneOf0AllOf2TypeInteger
	{ $current=$iv_ruleRefOneOf0AllOf2TypeInteger.current; }
	EOF;

// Rule RefOneOf0AllOf2TypeInteger
ruleRefOneOf0AllOf2TypeInteger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeIntegerAccess().getRefEDoubleObjectParserRuleCall_0());
			}
			lv_ref_0_0=ruleEDoubleObject
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2TypeIntegerRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2.EDoubleObject");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRefOneOf0AllOf2TypeNumber
entryRuleRefOneOf0AllOf2TypeNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeNumberRule()); }
	iv_ruleRefOneOf0AllOf2TypeNumber=ruleRefOneOf0AllOf2TypeNumber
	{ $current=$iv_ruleRefOneOf0AllOf2TypeNumber.current; }
	EOF;

// Rule RefOneOf0AllOf2TypeNumber
ruleRefOneOf0AllOf2TypeNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeNumberAccess().getRefEDoubleObjectParserRuleCall_0());
			}
			lv_ref_0_0=ruleEDoubleObject
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2TypeNumberRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2.EDoubleObject");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRefOneOf0AllOf2TypeBoolean
entryRuleRefOneOf0AllOf2TypeBoolean returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeBooleanRule()); }
	iv_ruleRefOneOf0AllOf2TypeBoolean=ruleRefOneOf0AllOf2TypeBoolean
	{ $current=$iv_ruleRefOneOf0AllOf2TypeBoolean.current; }
	EOF;

// Rule RefOneOf0AllOf2TypeBoolean
ruleRefOneOf0AllOf2TypeBoolean returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeBooleanAccess().getRefEBooleanObjectParserRuleCall_0());
			}
			lv_ref_0_0=ruleEBooleanObject
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2TypeBooleanRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2.EBooleanObject");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRefOneOf0AllOf2TypeObject
entryRuleRefOneOf0AllOf2TypeObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeObjectRule()); }
	iv_ruleRefOneOf0AllOf2TypeObject=ruleRefOneOf0AllOf2TypeObject
	{ $current=$iv_ruleRefOneOf0AllOf2TypeObject.current; }
	EOF;

// Rule RefOneOf0AllOf2TypeObject
ruleRefOneOf0AllOf2TypeObject returns [EObject current=null]
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
					grammarAccess.getRefOneOf0AllOf2TypeObjectAccess().getRefOneOf0AllOf2TypeObjectAction_0(),
					$current);
			}
		)
		otherlv_1=LeftCurlyBracket
		{
			newLeafNode(otherlv_1, grammarAccess.getRefOneOf0AllOf2TypeObjectAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeObjectAccess().getRefRefOneOf0AllOf2PropertiesAbstractParserRuleCall_2_0_0());
					}
					lv_ref_2_0=ruleRefOneOf0AllOf2PropertiesAbstract
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2TypeObjectRule());
						}
						add(
							$current,
							"ref",
							lv_ref_2_0,
							"githubwf.githubwf.RefOneOf0AllOf2.RefOneOf0AllOf2PropertiesAbstract");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=Comma
				{
					newLeafNode(otherlv_3, grammarAccess.getRefOneOf0AllOf2TypeObjectAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeObjectAccess().getRefRefOneOf0AllOf2PropertiesAbstractParserRuleCall_2_1_1_0());
						}
						lv_ref_4_0=ruleRefOneOf0AllOf2PropertiesAbstract
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2TypeObjectRule());
							}
							add(
								$current,
								"ref",
								lv_ref_4_0,
								"githubwf.githubwf.RefOneOf0AllOf2.RefOneOf0AllOf2PropertiesAbstract");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=RightCurlyBracket
		{
			newLeafNode(otherlv_5, grammarAccess.getRefOneOf0AllOf2TypeObjectAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleRefOneOf0AllOf2TypeArray
entryRuleRefOneOf0AllOf2TypeArray returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeArrayRule()); }
	iv_ruleRefOneOf0AllOf2TypeArray=ruleRefOneOf0AllOf2TypeArray
	{ $current=$iv_ruleRefOneOf0AllOf2TypeArray.current; }
	EOF;

// Rule RefOneOf0AllOf2TypeArray
ruleRefOneOf0AllOf2TypeArray returns [EObject current=null]
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
					grammarAccess.getRefOneOf0AllOf2TypeArrayAccess().getRefOneOf0AllOf2TypeArrayAction_0(),
					$current);
			}
		)
		otherlv_1=LeftSquareBracket
		{
			newLeafNode(otherlv_1, grammarAccess.getRefOneOf0AllOf2TypeArrayAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeArrayAccess().getRefRefOneOf0AllOf2ItemsParserRuleCall_2_0_0());
					}
					lv_ref_2_0=ruleRefOneOf0AllOf2Items
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2TypeArrayRule());
						}
						add(
							$current,
							"ref",
							lv_ref_2_0,
							"githubwf.githubwf.RefOneOf0AllOf2.RefOneOf0AllOf2Items");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=Comma
				{
					newLeafNode(otherlv_3, grammarAccess.getRefOneOf0AllOf2TypeArrayAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeArrayAccess().getRefRefOneOf0AllOf2ItemsParserRuleCall_2_1_1_0());
						}
						lv_ref_4_0=ruleRefOneOf0AllOf2Items
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2TypeArrayRule());
							}
							add(
								$current,
								"ref",
								lv_ref_4_0,
								"githubwf.githubwf.RefOneOf0AllOf2.RefOneOf0AllOf2Items");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=RightSquareBracket
		{
			newLeafNode(otherlv_5, grammarAccess.getRefOneOf0AllOf2TypeArrayAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleRefOneOf0AllOf2TypeNull
entryRuleRefOneOf0AllOf2TypeNull returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeNullRule()); }
	iv_ruleRefOneOf0AllOf2TypeNull=ruleRefOneOf0AllOf2TypeNull
	{ $current=$iv_ruleRefOneOf0AllOf2TypeNull.current; }
	EOF;

// Rule RefOneOf0AllOf2TypeNull
ruleRefOneOf0AllOf2TypeNull returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2TypeNullAccess().getRefNullValueParserRuleCall_0());
			}
			lv_ref_0_0=ruleNullValue
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2TypeNullRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2.NullValue");
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

// Entry rule entryRuleEDoubleObject
entryRuleEDoubleObject returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleObjectRule()); }
	iv_ruleEDoubleObject=ruleEDoubleObject
	{ $current=$iv_ruleEDoubleObject.current.getText(); }
	EOF;

// Rule EDoubleObject
ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0());
		}
		    |
		this_E_DOUBLE_1=RULE_E_DOUBLE
		{
			$current.merge(this_E_DOUBLE_1);
		}
		{
			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEBooleanObject
entryRuleEBooleanObject returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEBooleanObjectRule()); }
	iv_ruleEBooleanObject=ruleEBooleanObject
	{ $current=$iv_ruleEBooleanObject.current.getText(); }
	EOF;

// Rule EBooleanObject
ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
		}
		    |
		kw=False
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1());
		}
	)
;

// Entry rule entryRuleRefOneOf0AllOf2AdditionalProperties
entryRuleRefOneOf0AllOf2AdditionalProperties returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2AdditionalPropertiesRule()); }
	iv_ruleRefOneOf0AllOf2AdditionalProperties=ruleRefOneOf0AllOf2AdditionalProperties
	{ $current=$iv_ruleRefOneOf0AllOf2AdditionalProperties.current; }
	EOF;

// Rule RefOneOf0AllOf2AdditionalProperties
ruleRefOneOf0AllOf2AdditionalProperties returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getRefOneOf0AllOf2AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
				}
				lv_key_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2AdditionalPropertiesRule());
					}
					set(
						$current,
						"key",
						lv_key_0_0,
						"githubwf.githubwf.RefOneOf0AllOf2.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getRefOneOf0AllOf2AdditionalPropertiesAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRefOneOf0AllOf2AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
				}
				lv_additionalProperties_2_0=ruleJsonDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2AdditionalPropertiesRule());
					}
					set(
						$current,
						"additionalProperties",
						lv_additionalProperties_2_0,
						"githubwf.githubwf.RefOneOf0AllOf2.JsonDocument");
					afterParserOrEnumRuleCall();
				}
			)
		)
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
					"githubwf.githubwf.RefOneOf0AllOf2.Value");
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
					"githubwf.githubwf.RefOneOf0AllOf2.EString");
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
							"githubwf.githubwf.RefOneOf0AllOf2.Value");
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
								"githubwf.githubwf.RefOneOf0AllOf2.Value");
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
					"githubwf.githubwf.RefOneOf0AllOf2.NullEnum");
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
					"githubwf.githubwf.RefOneOf0AllOf2.EDouble");
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
							"githubwf.githubwf.RefOneOf0AllOf2.KeyValuePair");
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
								"githubwf.githubwf.RefOneOf0AllOf2.KeyValuePair");
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
					"githubwf.githubwf.RefOneOf0AllOf2.EBoolean");
				afterParserOrEnumRuleCall();
			}
		)
	)
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
						"githubwf.githubwf.RefOneOf0AllOf2.EString");
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
						"githubwf.githubwf.RefOneOf0AllOf2.Value");
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

// Entry rule entryRuleRefOneOf0AllOf2Items
entryRuleRefOneOf0AllOf2Items returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2ItemsRule()); }
	iv_ruleRefOneOf0AllOf2Items=ruleRefOneOf0AllOf2Items
	{ $current=$iv_ruleRefOneOf0AllOf2Items.current; }
	EOF;

// Rule RefOneOf0AllOf2Items
ruleRefOneOf0AllOf2Items returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2ItemsAccess().getItemsJsonDocumentParserRuleCall_0());
			}
			lv_items_0_0=ruleJsonDocument
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2ItemsRule());
				}
				set(
					$current,
					"items",
					lv_items_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2.JsonDocument");
				afterParserOrEnumRuleCall();
			}
		)
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
