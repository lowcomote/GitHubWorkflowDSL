/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalNormalJobEnvironmentOneOf0Parser;

options {
	tokenVocab=InternalNormalJobEnvironmentOneOf0Lexer;
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
import githubwf.githubwf.services.NormalJobEnvironmentOneOf0GrammarAccess;

}
@members {
	private NormalJobEnvironmentOneOf0GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("Colon", "':'");
		tokenNameToValue.put("Environment", "'\"environment\"'");
	}

	public void setGrammarAccess(NormalJobEnvironmentOneOf0GrammarAccess grammarAccess) {
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

// Entry rule entryRuleNormalJobEnvironmentOneOf0
entryRuleNormalJobEnvironmentOneOf0
:
{ before(grammarAccess.getNormalJobEnvironmentOneOf0Rule()); }
	 ruleNormalJobEnvironmentOneOf0
{ after(grammarAccess.getNormalJobEnvironmentOneOf0Rule()); } 
	 EOF 
;

// Rule NormalJobEnvironmentOneOf0
ruleNormalJobEnvironmentOneOf0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNormalJobEnvironmentOneOf0Access().getGroup()); }
		(rule__NormalJobEnvironmentOneOf0__Group__0)
		{ after(grammarAccess.getNormalJobEnvironmentOneOf0Access().getGroup()); }
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
		{ before(grammarAccess.getKEYWORDAccess().getEnvironmentKeyword()); }
		Environment
		{ after(grammarAccess.getKEYWORDAccess().getEnvironmentKeyword()); }
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

rule__NormalJobEnvironmentOneOf0__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobEnvironmentOneOf0__Group__0__Impl
	rule__NormalJobEnvironmentOneOf0__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobEnvironmentOneOf0__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentKeyword_0()); }
	Environment
	{ after(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobEnvironmentOneOf0__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobEnvironmentOneOf0__Group__1__Impl
	rule__NormalJobEnvironmentOneOf0__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobEnvironmentOneOf0__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobEnvironmentOneOf0Access().getColonKeyword_1()); }
	Colon
	{ after(grammarAccess.getNormalJobEnvironmentOneOf0Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobEnvironmentOneOf0__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalJobEnvironmentOneOf0__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalJobEnvironmentOneOf0__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentAssignment_2()); }
	(rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2)
	{ after(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
