/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser;

options {
	tokenVocab=InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Lexer;
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
import githubwf.githubwf.services.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess;

}
@members {
	private ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
	}

	public void setGrammarAccess(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess grammarAccess) {
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

// Entry rule entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1
entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1
:
{ before(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Rule()); }
	 ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1
{ after(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Rule()); } 
	 EOF 
;

// Rule ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1
ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Access().getAdditionalPropertiesAssignment()); }
		(rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment)
		{ after(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Access().getAdditionalPropertiesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpressionSyntax
entryRuleExpressionSyntax
:
{ before(grammarAccess.getExpressionSyntaxRule()); }
	 ruleExpressionSyntax
{ after(grammarAccess.getExpressionSyntaxRule()); } 
	 EOF 
;

// Rule ExpressionSyntax
ruleExpressionSyntax 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxAssignment()); }
		(rule__ExpressionSyntax__ExpressionSyntaxAssignment)
		{ after(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxAssignment()); }
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
		{ before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall()); }
		RULE_STRING
		{ after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Access().getAdditionalPropertiesExpressionSyntaxParserRuleCall_0()); }
		ruleExpressionSyntax
		{ after(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Access().getAdditionalPropertiesExpressionSyntaxParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpressionSyntax__ExpressionSyntaxAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxEStringParserRuleCall_0()); }
		ruleEString
		{ after(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxEStringParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
