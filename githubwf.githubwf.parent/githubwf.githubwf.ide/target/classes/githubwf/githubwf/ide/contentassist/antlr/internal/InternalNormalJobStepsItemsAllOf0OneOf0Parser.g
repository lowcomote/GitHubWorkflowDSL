/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalNormalJobStepsItemsAllOf0OneOf0Parser;

options {
	tokenVocab=InternalNormalJobStepsItemsAllOf0OneOf0Lexer;
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@header {
package githubwf.githubwf.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import githubwf.githubwf.services.NormalJobStepsItemsAllOf0OneOf0GrammarAccess;

}
@members {
	private NormalJobStepsItemsAllOf0OneOf0GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("Comma", "','");
		tokenNameToValue.put("Colon", "':'");
		tokenNameToValue.put("LeftSquareBracket", "'['");
		tokenNameToValue.put("RightSquareBracket", "']'");
		tokenNameToValue.put("LeftCurlyBracket", "'{'");
		tokenNameToValue.put("RightCurlyBracket", "'}'");
		tokenNameToValue.put("Null", "'null'");
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("False", "'false'");
		tokenNameToValue.put("Uses", "'\"uses\"'");
	}

	public void setGrammarAccess(NormalJobStepsItemsAllOf0OneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		String result = tokenNameToValue.get(tokenName);
		if (result == null)
			result = tokenName;
		return result;
	}
}

// Entry rule entryRuleNormalJobStepsItemsAllOf0OneOf0
entryRuleNormalJobStepsItemsAllOf0OneOf0
:
{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Rule()); }
	 ruleNormalJobStepsItemsAllOf0OneOf0
{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Rule()); } 
	 EOF 
;

// Rule NormalJobStepsItemsAllOf0OneOf0
ruleNormalJobStepsItemsAllOf0OneOf0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getGroup()); }
		(rule__NormalJobStepsItemsAllOf0OneOf0__Group__0)
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNormalJobStepsItemsAllOf0OneOf0PropertiesAbstract
entryRuleNormalJobStepsItemsAllOf0OneOf0PropertiesAbstract
:
{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractRule()); }
	 ruleNormalJobStepsItemsAllOf0OneOf0PropertiesAbstract
{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractRule()); } 
	 EOF 
;

// Rule NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract
ruleNormalJobStepsItemsAllOf0OneOf0PropertiesAbstract 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractAccess().getAlternatives()); }
		(rule__NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract__Alternatives)
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValue
entryRuleValue
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValueAccess().getAlternatives()); }
		(rule__Value__Alternatives)
		{ after(grammarAccess.getValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNormalJobStepsItemsAllOf0OneOf0Uses
entryRuleNormalJobStepsItemsAllOf0OneOf0Uses
:
{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesRule()); }
	 ruleNormalJobStepsItemsAllOf0OneOf0Uses
{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesRule()); } 
	 EOF 
;

// Rule NormalJobStepsItemsAllOf0OneOf0Uses
ruleNormalJobStepsItemsAllOf0OneOf0Uses 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getGroup()); }
		(rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__0)
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNormalJobStepsItemsAllOf0OneOf0AdditionalProperties
entryRuleNormalJobStepsItemsAllOf0OneOf0AdditionalProperties
:
{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesRule()); }
	 ruleNormalJobStepsItemsAllOf0OneOf0AdditionalProperties
{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesRule()); } 
	 EOF 
;

// Rule NormalJobStepsItemsAllOf0OneOf0AdditionalProperties
ruleNormalJobStepsItemsAllOf0OneOf0AdditionalProperties 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getGroup()); }
		(rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__0)
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall()); }
		ruleVALID_STRING
		{ after(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJsonDocument
entryRuleJsonDocument
:
{ before(grammarAccess.getJsonDocumentRule()); }
	 ruleJsonDocument
{ after(grammarAccess.getJsonDocumentRule()); } 
	 EOF 
;

// Rule JsonDocument
ruleJsonDocument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); }
		(rule__JsonDocument__ValueAssignment)
		{ after(grammarAccess.getJsonDocumentAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringValue
entryRuleStringValue
:
{ before(grammarAccess.getStringValueRule()); }
	 ruleStringValue
{ after(grammarAccess.getStringValueRule()); } 
	 EOF 
;

// Rule StringValue
ruleStringValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringValueAccess().getValueAssignment()); }
		(rule__StringValue__ValueAssignment)
		{ after(grammarAccess.getStringValueAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArrayValue
entryRuleArrayValue
:
{ before(grammarAccess.getArrayValueRule()); }
	 ruleArrayValue
{ after(grammarAccess.getArrayValueRule()); } 
	 EOF 
;

// Rule ArrayValue
ruleArrayValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArrayValueAccess().getGroup()); }
		(rule__ArrayValue__Group__0)
		{ after(grammarAccess.getArrayValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNullValue
entryRuleNullValue
:
{ before(grammarAccess.getNullValueRule()); }
	 ruleNullValue
{ after(grammarAccess.getNullValueRule()); } 
	 EOF 
;

// Rule NullValue
ruleNullValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNullValueAccess().getValueAssignment()); }
		(rule__NullValue__ValueAssignment)
		{ after(grammarAccess.getNullValueAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumberValue
entryRuleNumberValue
:
{ before(grammarAccess.getNumberValueRule()); }
	 ruleNumberValue
{ after(grammarAccess.getNumberValueRule()); } 
	 EOF 
;

// Rule NumberValue
ruleNumberValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumberValueAccess().getValueAssignment()); }
		(rule__NumberValue__ValueAssignment)
		{ after(grammarAccess.getNumberValueAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleObjectValue
entryRuleObjectValue
:
{ before(grammarAccess.getObjectValueRule()); }
	 ruleObjectValue
{ after(grammarAccess.getObjectValueRule()); } 
	 EOF 
;

// Rule ObjectValue
ruleObjectValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getObjectValueAccess().getGroup()); }
		(rule__ObjectValue__Group__0)
		{ after(grammarAccess.getObjectValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanValue
entryRuleBooleanValue
:
{ before(grammarAccess.getBooleanValueRule()); }
	 ruleBooleanValue
{ after(grammarAccess.getBooleanValueRule()); } 
	 EOF 
;

// Rule BooleanValue
ruleBooleanValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanValueAccess().getValueAssignment()); }
		(rule__BooleanValue__ValueAssignment)
		{ after(grammarAccess.getBooleanValueAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEDouble
entryRuleEDouble
:
{ before(grammarAccess.getEDoubleRule()); }
	 ruleEDouble
{ after(grammarAccess.getEDoubleRule()); } 
	 EOF 
;

// Rule EDouble
ruleEDouble 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEDoubleAccess().getAlternatives()); }
		(rule__EDouble__Alternatives)
		{ after(grammarAccess.getEDoubleAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKeyValuePair
entryRuleKeyValuePair
:
{ before(grammarAccess.getKeyValuePairRule()); }
	 ruleKeyValuePair
{ after(grammarAccess.getKeyValuePairRule()); } 
	 EOF 
;

// Rule KeyValuePair
ruleKeyValuePair 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKeyValuePairAccess().getGroup()); }
		(rule__KeyValuePair__Group__0)
		{ after(grammarAccess.getKeyValuePairAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEBoolean
entryRuleEBoolean
:
{ before(grammarAccess.getEBooleanRule()); }
	 ruleEBoolean
{ after(grammarAccess.getEBooleanRule()); } 
	 EOF 
;

// Rule EBoolean
ruleEBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEBooleanAccess().getAlternatives()); }
		(rule__EBoolean__Alternatives)
		{ after(grammarAccess.getEBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVALID_STRING
entryRuleVALID_STRING
:
{ before(grammarAccess.getVALID_STRINGRule()); }
	 ruleVALID_STRING
{ after(grammarAccess.getVALID_STRINGRule()); } 
	 EOF 
;

// Rule VALID_STRING
ruleVALID_STRING 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); }
		(rule__VALID_STRING__Alternatives)
		{ after(grammarAccess.getVALID_STRINGAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKEYWORD
entryRuleKEYWORD
:
{ before(grammarAccess.getKEYWORDRule()); }
	 ruleKEYWORD
{ after(grammarAccess.getKEYWORDRule()); } 
	 EOF 
;

// Rule KEYWORD
ruleKEYWORD 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKEYWORDAccess().getUsesKeyword()); }
		Uses
		{ after(grammarAccess.getKEYWORDAccess().getUsesKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule NullEnum
ruleNullEnum
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); }
		(Null)
		{ after(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractAccess().getNormalJobStepsItemsAllOf0OneOf0UsesParserRuleCall_0()); }
		ruleNormalJobStepsItemsAllOf0OneOf0Uses
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractAccess().getNormalJobStepsItemsAllOf0OneOf0UsesParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractAccess().getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesParserRuleCall_1()); }
		(ruleNormalJobStepsItemsAllOf0OneOf0AdditionalProperties)
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractAccess().getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); }
		ruleStringValue
		{ after(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getArrayValueParserRuleCall_1()); }
		ruleArrayValue
		{ after(grammarAccess.getValueAccess().getArrayValueParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getNullValueParserRuleCall_2()); }
		ruleNullValue
		{ after(grammarAccess.getValueAccess().getNullValueParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3()); }
		ruleNumberValue
		{ after(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4()); }
		ruleObjectValue
		{ after(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_5()); }
		ruleBooleanValue
		{ after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); }
		RULE_E_INT
		{ after(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1()); }
		RULE_E_DOUBLE
		{ after(grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EBoolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
		True
		{ after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
		False
		{ after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VALID_STRING__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); }
		ruleKEYWORD
		{ after(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0__Group__0__Impl
	rule__NormalJobStepsItemsAllOf0OneOf0__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getNormalJobStepsItemsAllOf0OneOf0Action_0()); }
	()
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getNormalJobStepsItemsAllOf0OneOf0Action_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0__Group__1__Impl
	rule__NormalJobStepsItemsAllOf0OneOf0__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getLeftCurlyBracketKeyword_1()); }
	LeftCurlyBracket
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0__Group__2__Impl
	rule__NormalJobStepsItemsAllOf0OneOf0__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getGroup_2()); }
	(rule__NormalJobStepsItemsAllOf0OneOf0__Group_2__0)?
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getRightCurlyBracketKeyword_3()); }
	RightCurlyBracket
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NormalJobStepsItemsAllOf0OneOf0__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0__Group_2__0__Impl
	rule__NormalJobStepsItemsAllOf0OneOf0__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getItemsAssignment_2_0()); }
	(rule__NormalJobStepsItemsAllOf0OneOf0__ItemsAssignment_2_0)
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getItemsAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getGroup_2_1()); }
	(rule__NormalJobStepsItemsAllOf0OneOf0__Group_2_1__0)*
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NormalJobStepsItemsAllOf0OneOf0__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0__Group_2_1__0__Impl
	rule__NormalJobStepsItemsAllOf0OneOf0__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getCommaKeyword_2_1_0()); }
	Comma
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getItemsAssignment_2_1_1()); }
	(rule__NormalJobStepsItemsAllOf0OneOf0__ItemsAssignment_2_1_1)
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getItemsAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__0__Impl
	rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getUsesKeyword_0()); }
	Uses
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getUsesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__1__Impl
	rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getColonKeyword_1()); }
	Colon
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0Uses__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getUsesAssignment_2()); }
	(rule__NormalJobStepsItemsAllOf0OneOf0Uses__UsesAssignment_2)
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getUsesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__0__Impl
	rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getKeyAssignment_0()); }
	(rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__KeyAssignment_0)
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getKeyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__1__Impl
	rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getColonKeyword_1()); }
	Colon
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); }
	(rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__AdditionalPropertiesAssignment_2)
	{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group__0__Impl
	rule__ArrayValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); }
	()
	{ after(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group__1__Impl
	rule__ArrayValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1()); }
	LeftSquareBracket
	{ after(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group__2__Impl
	rule__ArrayValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getGroup_2()); }
	(rule__ArrayValue__Group_2__0)?
	{ after(grammarAccess.getArrayValueAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); }
	RightSquareBracket
	{ after(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayValue__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group_2__0__Impl
	rule__ArrayValue__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); }
	(rule__ArrayValue__ValueAssignment_2_0)
	{ after(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getGroup_2_1()); }
	(rule__ArrayValue__Group_2_1__0)*
	{ after(grammarAccess.getArrayValueAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayValue__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group_2_1__0__Impl
	rule__ArrayValue__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0()); }
	Comma
	{ after(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayValue__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); }
	(rule__ArrayValue__ValueAssignment_2_1_1)
	{ after(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectValue__Group__0__Impl
	rule__ObjectValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); }
	()
	{ after(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectValue__Group__1__Impl
	rule__ObjectValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); }
	LeftCurlyBracket
	{ after(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectValue__Group__2__Impl
	rule__ObjectValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectValueAccess().getGroup_2()); }
	(rule__ObjectValue__Group_2__0)?
	{ after(grammarAccess.getObjectValueAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectValue__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); }
	RightCurlyBracket
	{ after(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectValue__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectValue__Group_2__0__Impl
	rule__ObjectValue__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); }
	(rule__ObjectValue__KeyvaluepairAssignment_2_0)
	{ after(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectValue__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectValueAccess().getGroup_2_1()); }
	(rule__ObjectValue__Group_2_1__0)*
	{ after(grammarAccess.getObjectValueAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectValue__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectValue__Group_2_1__0__Impl
	rule__ObjectValue__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0()); }
	Comma
	{ after(grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectValue__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); }
	(rule__ObjectValue__KeyvaluepairAssignment_2_1_1)
	{ after(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KeyValuePair__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KeyValuePair__Group__0__Impl
	rule__KeyValuePair__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KeyValuePair__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); }
	(rule__KeyValuePair__KeyAssignment_0)
	{ after(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KeyValuePair__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KeyValuePair__Group__1__Impl
	rule__KeyValuePair__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__KeyValuePair__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKeyValuePairAccess().getColonKeyword_1()); }
	Colon
	{ after(grammarAccess.getKeyValuePairAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KeyValuePair__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KeyValuePair__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KeyValuePair__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); }
	(rule__KeyValuePair__ValueAssignment_2)
	{ after(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NormalJobStepsItemsAllOf0OneOf0__ItemsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getItemsNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractParserRuleCall_2_0_0()); }
		ruleNormalJobStepsItemsAllOf0OneOf0PropertiesAbstract
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getItemsNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0__ItemsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getItemsNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractParserRuleCall_2_1_1_0()); }
		ruleNormalJobStepsItemsAllOf0OneOf0PropertiesAbstract
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0Access().getItemsNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0Uses__UsesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getUsesEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getUsesEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__KeyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); }
		ruleEString
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf0OneOf0AdditionalProperties__AdditionalPropertiesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); }
		ruleJsonDocument
		{ after(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JsonDocument__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0()); }
		ruleValue
		{ after(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValue__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0()); }
		ruleEString
		{ after(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__ValueAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0()); }
		ruleValue
		{ after(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayValue__ValueAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0()); }
		ruleValue
		{ after(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NullValue__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0()); }
		ruleNullEnum
		{ after(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumberValue__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0()); }
		ruleEDouble
		{ after(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__KeyvaluepairAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0()); }
		ruleKeyValuePair
		{ after(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectValue__KeyvaluepairAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0()); }
		ruleKeyValuePair
		{ after(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValue__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); }
		ruleEBoolean
		{ after(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KeyValuePair__KeyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0()); }
		ruleEString
		{ after(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KeyValuePair__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0()); }
		ruleValue
		{ after(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
