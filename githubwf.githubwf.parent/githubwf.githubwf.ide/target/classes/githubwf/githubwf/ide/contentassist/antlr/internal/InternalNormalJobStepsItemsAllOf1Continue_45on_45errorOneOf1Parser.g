/*
 * generated by Xtext 2.23.0
 */
parser grammar InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Parser;

options {
	tokenVocab=InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Lexer;
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
import githubwf.githubwf.services.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess;

}
@members {
	private NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("Colon", "':'");
		tokenNameToValue.put("ContinueOnError", "'\"continue-on-error\"'");
	}

	public void setGrammarAccess(NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess grammarAccess) {
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

// Entry rule entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1
entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1
:
{ before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Rule()); }
	 ruleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1
{ after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Rule()); } 
	 EOF 
;

// Rule NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1
ruleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getGroup()); }
		(rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__0)
		{ after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getGroup()); }
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
		{ before(grammarAccess.getKEYWORDAccess().getContinueOnErrorKeyword()); }
		ContinueOnError
		{ after(grammarAccess.getKEYWORDAccess().getContinueOnErrorKeyword()); }
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

rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__0__Impl
	rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getContinueOnErrorKeyword_0()); }
	ContinueOnError
	{ after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getContinueOnErrorKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__1__Impl
	rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getColonKeyword_1()); }
	Colon
	{ after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getContinue_45on_45errorAssignment_2()); }
	(rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Continue_45on_45errorAssignment_2)
	{ after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getContinue_45on_45errorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Continue_45on_45errorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getContinue_45on_45errorExpressionSyntaxParserRuleCall_2_0()); }
		ruleExpressionSyntax
		{ after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getContinue_45on_45errorExpressionSyntaxParserRuleCall_2_0()); }
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
