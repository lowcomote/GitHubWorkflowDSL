/*
 * generated by Xtext 2.23.0
 */
parser grammar InternalEnvOneOf0AdditionalPropertiesOneOf1Parser;

options {
	tokenVocab=InternalEnvOneOf0AdditionalPropertiesOneOf1Lexer;
	superClass=AbstractInternalContentAssistParser;
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
import githubwf.githubwf.services.EnvOneOf0AdditionalPropertiesOneOf1GrammarAccess;

}
@members {
	private EnvOneOf0AdditionalPropertiesOneOf1GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
	}

	public void setGrammarAccess(EnvOneOf0AdditionalPropertiesOneOf1GrammarAccess grammarAccess) {
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

// Entry rule entryRuleEnvOneOf0AdditionalPropertiesOneOf1
entryRuleEnvOneOf0AdditionalPropertiesOneOf1
:
{ before(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf1Rule()); }
	 ruleEnvOneOf0AdditionalPropertiesOneOf1
{ after(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf1Rule()); } 
	 EOF 
;

// Rule EnvOneOf0AdditionalPropertiesOneOf1
ruleEnvOneOf0AdditionalPropertiesOneOf1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf1Access().getAdditionalPropertiesAssignment()); }
		(rule__EnvOneOf0AdditionalPropertiesOneOf1__AdditionalPropertiesAssignment)
		{ after(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf1Access().getAdditionalPropertiesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEDoubleObject
entryRuleEDoubleObject
:
{ before(grammarAccess.getEDoubleObjectRule()); }
	 ruleEDoubleObject
{ after(grammarAccess.getEDoubleObjectRule()); } 
	 EOF 
;

// Rule EDoubleObject
ruleEDoubleObject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); }
		(rule__EDoubleObject__Alternatives)
		{ after(grammarAccess.getEDoubleObjectAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDoubleObject__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0()); }
		RULE_E_INT
		{ after(grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1()); }
		RULE_E_DOUBLE
		{ after(grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnvOneOf0AdditionalPropertiesOneOf1__AdditionalPropertiesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf1Access().getAdditionalPropertiesEDoubleObjectParserRuleCall_0()); }
		ruleEDoubleObject
		{ after(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf1Access().getAdditionalPropertiesEDoubleObjectParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
