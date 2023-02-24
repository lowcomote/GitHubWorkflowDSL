/*
 * generated by Xtext 2.23.0
 */
parser grammar InternalRefOneOf0AllOf2NotParser;

options {
	tokenVocab=InternalRefOneOf0AllOf2NotLexer;
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
import githubwf.githubwf.services.RefOneOf0AllOf2NotGrammarAccess;

}

@members {

 	private RefOneOf0AllOf2NotGrammarAccess grammarAccess;

    public InternalRefOneOf0AllOf2NotParser(TokenStream input, RefOneOf0AllOf2NotGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "RefOneOf0AllOf2Not";
   	}

   	@Override
   	protected RefOneOf0AllOf2NotGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRefOneOf0AllOf2Not
entryRuleRefOneOf0AllOf2Not returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotRule()); }
	iv_ruleRefOneOf0AllOf2Not=ruleRefOneOf0AllOf2Not
	{ $current=$iv_ruleRefOneOf0AllOf2Not.current; }
	EOF;

// Rule RefOneOf0AllOf2Not
ruleRefOneOf0AllOf2Not returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAccess().getRefRefOneOf0AllOf2NotAbstractParserRuleCall_0());
			}
			lv_ref_0_0=ruleRefOneOf0AllOf2NotAbstract
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2Not.RefOneOf0AllOf2NotAbstract");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRefOneOf0AllOf2NotAbstract
entryRuleRefOneOf0AllOf2NotAbstract returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAbstractRule()); }
	iv_ruleRefOneOf0AllOf2NotAbstract=ruleRefOneOf0AllOf2NotAbstract
	{ $current=$iv_ruleRefOneOf0AllOf2NotAbstract.current; }
	EOF;

// Rule RefOneOf0AllOf2NotAbstract
ruleRefOneOf0AllOf2NotAbstract returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(ruleRefOneOf0AllOf2NotTypeNumber)=>
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAbstractAccess().getRefOneOf0AllOf2NotTypeNumberParserRuleCall_0());
			}
			this_RefOneOf0AllOf2NotTypeNumber_0=ruleRefOneOf0AllOf2NotTypeNumber
			{
				$current = $this_RefOneOf0AllOf2NotTypeNumber_0.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAbstractAccess().getRefOneOf0AllOf2NotTypeStringParserRuleCall_1());
		}
		this_RefOneOf0AllOf2NotTypeString_1=ruleRefOneOf0AllOf2NotTypeString
		{
			$current = $this_RefOneOf0AllOf2NotTypeString_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAbstractAccess().getRefOneOf0AllOf2NotTypeIntegerParserRuleCall_2());
		}
		this_RefOneOf0AllOf2NotTypeInteger_2=ruleRefOneOf0AllOf2NotTypeInteger
		{
			$current = $this_RefOneOf0AllOf2NotTypeInteger_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAbstractAccess().getRefOneOf0AllOf2NotTypeBooleanParserRuleCall_3());
		}
		this_RefOneOf0AllOf2NotTypeBoolean_3=ruleRefOneOf0AllOf2NotTypeBoolean
		{
			$current = $this_RefOneOf0AllOf2NotTypeBoolean_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAbstractAccess().getRefOneOf0AllOf2NotTypeObjectParserRuleCall_4());
		}
		this_RefOneOf0AllOf2NotTypeObject_4=ruleRefOneOf0AllOf2NotTypeObject
		{
			$current = $this_RefOneOf0AllOf2NotTypeObject_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAbstractAccess().getRefOneOf0AllOf2NotTypeArrayParserRuleCall_5());
		}
		this_RefOneOf0AllOf2NotTypeArray_5=ruleRefOneOf0AllOf2NotTypeArray
		{
			$current = $this_RefOneOf0AllOf2NotTypeArray_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAbstractAccess().getRefOneOf0AllOf2NotTypeNullParserRuleCall_6());
		}
		this_RefOneOf0AllOf2NotTypeNull_6=ruleRefOneOf0AllOf2NotTypeNull
		{
			$current = $this_RefOneOf0AllOf2NotTypeNull_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRefOneOf0AllOf2NotPropertiesAbstract
entryRuleRefOneOf0AllOf2NotPropertiesAbstract returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotPropertiesAbstractRule()); }
	iv_ruleRefOneOf0AllOf2NotPropertiesAbstract=ruleRefOneOf0AllOf2NotPropertiesAbstract
	{ $current=$iv_ruleRefOneOf0AllOf2NotPropertiesAbstract.current; }
	EOF;

// Rule RefOneOf0AllOf2NotPropertiesAbstract
ruleRefOneOf0AllOf2NotPropertiesAbstract returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(ruleRefOneOf0AllOf2NotAdditionalProperties)=>
		{
			newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotPropertiesAbstractAccess().getRefOneOf0AllOf2NotAdditionalPropertiesParserRuleCall());
		}
		this_RefOneOf0AllOf2NotAdditionalProperties_0=ruleRefOneOf0AllOf2NotAdditionalProperties
		{
			$current = $this_RefOneOf0AllOf2NotAdditionalProperties_0.current;
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

// Entry rule entryRuleRefOneOf0AllOf2NotTypeString
entryRuleRefOneOf0AllOf2NotTypeString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeStringRule()); }
	iv_ruleRefOneOf0AllOf2NotTypeString=ruleRefOneOf0AllOf2NotTypeString
	{ $current=$iv_ruleRefOneOf0AllOf2NotTypeString.current; }
	EOF;

// Rule RefOneOf0AllOf2NotTypeString
ruleRefOneOf0AllOf2NotTypeString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeStringAccess().getRefEStringParserRuleCall_0());
			}
			lv_ref_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotTypeStringRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2Not.EString");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRefOneOf0AllOf2NotTypeInteger
entryRuleRefOneOf0AllOf2NotTypeInteger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeIntegerRule()); }
	iv_ruleRefOneOf0AllOf2NotTypeInteger=ruleRefOneOf0AllOf2NotTypeInteger
	{ $current=$iv_ruleRefOneOf0AllOf2NotTypeInteger.current; }
	EOF;

// Rule RefOneOf0AllOf2NotTypeInteger
ruleRefOneOf0AllOf2NotTypeInteger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeIntegerAccess().getRefEDoubleObjectParserRuleCall_0());
			}
			lv_ref_0_0=ruleEDoubleObject
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotTypeIntegerRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2Not.EDoubleObject");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRefOneOf0AllOf2NotTypeNumber
entryRuleRefOneOf0AllOf2NotTypeNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeNumberRule()); }
	iv_ruleRefOneOf0AllOf2NotTypeNumber=ruleRefOneOf0AllOf2NotTypeNumber
	{ $current=$iv_ruleRefOneOf0AllOf2NotTypeNumber.current; }
	EOF;

// Rule RefOneOf0AllOf2NotTypeNumber
ruleRefOneOf0AllOf2NotTypeNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeNumberAccess().getRefEDoubleObjectParserRuleCall_0());
			}
			lv_ref_0_0=ruleEDoubleObject
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotTypeNumberRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2Not.EDoubleObject");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRefOneOf0AllOf2NotTypeBoolean
entryRuleRefOneOf0AllOf2NotTypeBoolean returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeBooleanRule()); }
	iv_ruleRefOneOf0AllOf2NotTypeBoolean=ruleRefOneOf0AllOf2NotTypeBoolean
	{ $current=$iv_ruleRefOneOf0AllOf2NotTypeBoolean.current; }
	EOF;

// Rule RefOneOf0AllOf2NotTypeBoolean
ruleRefOneOf0AllOf2NotTypeBoolean returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeBooleanAccess().getRefEBooleanObjectParserRuleCall_0());
			}
			lv_ref_0_0=ruleEBooleanObject
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotTypeBooleanRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2Not.EBooleanObject");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRefOneOf0AllOf2NotTypeObject
entryRuleRefOneOf0AllOf2NotTypeObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeObjectRule()); }
	iv_ruleRefOneOf0AllOf2NotTypeObject=ruleRefOneOf0AllOf2NotTypeObject
	{ $current=$iv_ruleRefOneOf0AllOf2NotTypeObject.current; }
	EOF;

// Rule RefOneOf0AllOf2NotTypeObject
ruleRefOneOf0AllOf2NotTypeObject returns [EObject current=null]
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
					grammarAccess.getRefOneOf0AllOf2NotTypeObjectAccess().getRefOneOf0AllOf2NotTypeObjectAction_0(),
					$current);
			}
		)
		otherlv_1=LeftCurlyBracket
		{
			newLeafNode(otherlv_1, grammarAccess.getRefOneOf0AllOf2NotTypeObjectAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeObjectAccess().getRefRefOneOf0AllOf2NotPropertiesAbstractParserRuleCall_2_0_0());
					}
					lv_ref_2_0=ruleRefOneOf0AllOf2NotPropertiesAbstract
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotTypeObjectRule());
						}
						add(
							$current,
							"ref",
							lv_ref_2_0,
							"githubwf.githubwf.RefOneOf0AllOf2Not.RefOneOf0AllOf2NotPropertiesAbstract");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=Comma
				{
					newLeafNode(otherlv_3, grammarAccess.getRefOneOf0AllOf2NotTypeObjectAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeObjectAccess().getRefRefOneOf0AllOf2NotPropertiesAbstractParserRuleCall_2_1_1_0());
						}
						lv_ref_4_0=ruleRefOneOf0AllOf2NotPropertiesAbstract
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotTypeObjectRule());
							}
							add(
								$current,
								"ref",
								lv_ref_4_0,
								"githubwf.githubwf.RefOneOf0AllOf2Not.RefOneOf0AllOf2NotPropertiesAbstract");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=RightCurlyBracket
		{
			newLeafNode(otherlv_5, grammarAccess.getRefOneOf0AllOf2NotTypeObjectAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleRefOneOf0AllOf2NotTypeArray
entryRuleRefOneOf0AllOf2NotTypeArray returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeArrayRule()); }
	iv_ruleRefOneOf0AllOf2NotTypeArray=ruleRefOneOf0AllOf2NotTypeArray
	{ $current=$iv_ruleRefOneOf0AllOf2NotTypeArray.current; }
	EOF;

// Rule RefOneOf0AllOf2NotTypeArray
ruleRefOneOf0AllOf2NotTypeArray returns [EObject current=null]
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
					grammarAccess.getRefOneOf0AllOf2NotTypeArrayAccess().getRefOneOf0AllOf2NotTypeArrayAction_0(),
					$current);
			}
		)
		otherlv_1=LeftSquareBracket
		{
			newLeafNode(otherlv_1, grammarAccess.getRefOneOf0AllOf2NotTypeArrayAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeArrayAccess().getRefRefOneOf0AllOf2NotItemsParserRuleCall_2_0_0());
					}
					lv_ref_2_0=ruleRefOneOf0AllOf2NotItems
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotTypeArrayRule());
						}
						add(
							$current,
							"ref",
							lv_ref_2_0,
							"githubwf.githubwf.RefOneOf0AllOf2Not.RefOneOf0AllOf2NotItems");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=Comma
				{
					newLeafNode(otherlv_3, grammarAccess.getRefOneOf0AllOf2NotTypeArrayAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeArrayAccess().getRefRefOneOf0AllOf2NotItemsParserRuleCall_2_1_1_0());
						}
						lv_ref_4_0=ruleRefOneOf0AllOf2NotItems
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotTypeArrayRule());
							}
							add(
								$current,
								"ref",
								lv_ref_4_0,
								"githubwf.githubwf.RefOneOf0AllOf2Not.RefOneOf0AllOf2NotItems");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=RightSquareBracket
		{
			newLeafNode(otherlv_5, grammarAccess.getRefOneOf0AllOf2NotTypeArrayAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleRefOneOf0AllOf2NotTypeNull
entryRuleRefOneOf0AllOf2NotTypeNull returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeNullRule()); }
	iv_ruleRefOneOf0AllOf2NotTypeNull=ruleRefOneOf0AllOf2NotTypeNull
	{ $current=$iv_ruleRefOneOf0AllOf2NotTypeNull.current; }
	EOF;

// Rule RefOneOf0AllOf2NotTypeNull
ruleRefOneOf0AllOf2NotTypeNull returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotTypeNullAccess().getRefNullValueParserRuleCall_0());
			}
			lv_ref_0_0=ruleNullValue
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotTypeNullRule());
				}
				set(
					$current,
					"ref",
					lv_ref_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2Not.NullValue");
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

// Entry rule entryRuleRefOneOf0AllOf2NotAdditionalProperties
entryRuleRefOneOf0AllOf2NotAdditionalProperties returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAdditionalPropertiesRule()); }
	iv_ruleRefOneOf0AllOf2NotAdditionalProperties=ruleRefOneOf0AllOf2NotAdditionalProperties
	{ $current=$iv_ruleRefOneOf0AllOf2NotAdditionalProperties.current; }
	EOF;

// Rule RefOneOf0AllOf2NotAdditionalProperties
ruleRefOneOf0AllOf2NotAdditionalProperties returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
				}
				lv_key_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotAdditionalPropertiesRule());
					}
					set(
						$current,
						"key",
						lv_key_0_0,
						"githubwf.githubwf.RefOneOf0AllOf2Not.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getRefOneOf0AllOf2NotAdditionalPropertiesAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
				}
				lv_additionalProperties_2_0=ruleJsonDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotAdditionalPropertiesRule());
					}
					set(
						$current,
						"additionalProperties",
						lv_additionalProperties_2_0,
						"githubwf.githubwf.RefOneOf0AllOf2Not.JsonDocument");
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
					"githubwf.githubwf.RefOneOf0AllOf2Not.Value");
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
					"githubwf.githubwf.RefOneOf0AllOf2Not.EString");
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
							"githubwf.githubwf.RefOneOf0AllOf2Not.Value");
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
								"githubwf.githubwf.RefOneOf0AllOf2Not.Value");
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
					"githubwf.githubwf.RefOneOf0AllOf2Not.NullEnum");
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
					"githubwf.githubwf.RefOneOf0AllOf2Not.EDouble");
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
							"githubwf.githubwf.RefOneOf0AllOf2Not.KeyValuePair");
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
								"githubwf.githubwf.RefOneOf0AllOf2Not.KeyValuePair");
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
					"githubwf.githubwf.RefOneOf0AllOf2Not.EBoolean");
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
						"githubwf.githubwf.RefOneOf0AllOf2Not.EString");
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
						"githubwf.githubwf.RefOneOf0AllOf2Not.Value");
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

// Entry rule entryRuleRefOneOf0AllOf2NotItems
entryRuleRefOneOf0AllOf2NotItems returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotItemsRule()); }
	iv_ruleRefOneOf0AllOf2NotItems=ruleRefOneOf0AllOf2NotItems
	{ $current=$iv_ruleRefOneOf0AllOf2NotItems.current; }
	EOF;

// Rule RefOneOf0AllOf2NotItems
ruleRefOneOf0AllOf2NotItems returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRefOneOf0AllOf2NotItemsAccess().getItemsJsonDocumentParserRuleCall_0());
			}
			lv_items_0_0=ruleJsonDocument
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf2NotItemsRule());
				}
				set(
					$current,
					"items",
					lv_items_0_0,
					"githubwf.githubwf.RefOneOf0AllOf2Not.JsonDocument");
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