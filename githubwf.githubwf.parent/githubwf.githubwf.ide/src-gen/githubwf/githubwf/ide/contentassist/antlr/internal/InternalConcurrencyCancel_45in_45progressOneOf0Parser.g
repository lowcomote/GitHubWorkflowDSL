/*
 * generated by Xtext 2.23.0
 */
parser grammar InternalConcurrencyCancel_45in_45progressOneOf0Parser;

options {
	tokenVocab=InternalConcurrencyCancel_45in_45progressOneOf0Lexer;
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
import githubwf.githubwf.services.ConcurrencyCancel_45in_45progressOneOf0GrammarAccess;

}
@members {
	private ConcurrencyCancel_45in_45progressOneOf0GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("Colon", "':'");
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("False", "'false'");
		tokenNameToValue.put("CancelInProgress", "'\"cancel-in-progress\"'");
	}

	public void setGrammarAccess(ConcurrencyCancel_45in_45progressOneOf0GrammarAccess grammarAccess) {
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

// Entry rule entryRuleConcurrencyCancel_45in_45progressOneOf0
entryRuleConcurrencyCancel_45in_45progressOneOf0
:
{ before(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Rule()); }
	 ruleConcurrencyCancel_45in_45progressOneOf0
{ after(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Rule()); } 
	 EOF 
;

// Rule ConcurrencyCancel_45in_45progressOneOf0
ruleConcurrencyCancel_45in_45progressOneOf0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getGroup()); }
		(rule__ConcurrencyCancel_45in_45progressOneOf0__Group__0)
		{ after(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEBooleanObject
entryRuleEBooleanObject
:
{ before(grammarAccess.getEBooleanObjectRule()); }
	 ruleEBooleanObject
{ after(grammarAccess.getEBooleanObjectRule()); } 
	 EOF 
;

// Rule EBooleanObject
ruleEBooleanObject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); }
		(rule__EBooleanObject__Alternatives)
		{ after(grammarAccess.getEBooleanObjectAccess().getAlternatives()); }
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
		{ before(grammarAccess.getKEYWORDAccess().getCancelInProgressKeyword()); }
		CancelInProgress
		{ after(grammarAccess.getKEYWORDAccess().getCancelInProgressKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EBooleanObject__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); }
		True
		{ after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); }
		False
		{ after(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConcurrencyCancel_45in_45progressOneOf0__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConcurrencyCancel_45in_45progressOneOf0__Group__0__Impl
	rule__ConcurrencyCancel_45in_45progressOneOf0__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConcurrencyCancel_45in_45progressOneOf0__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getCancelInProgressKeyword_0()); }
	CancelInProgress
	{ after(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getCancelInProgressKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConcurrencyCancel_45in_45progressOneOf0__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConcurrencyCancel_45in_45progressOneOf0__Group__1__Impl
	rule__ConcurrencyCancel_45in_45progressOneOf0__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConcurrencyCancel_45in_45progressOneOf0__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getColonKeyword_1()); }
	Colon
	{ after(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConcurrencyCancel_45in_45progressOneOf0__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConcurrencyCancel_45in_45progressOneOf0__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConcurrencyCancel_45in_45progressOneOf0__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getCancel_45in_45progressAssignment_2()); }
	(rule__ConcurrencyCancel_45in_45progressOneOf0__Cancel_45in_45progressAssignment_2)
	{ after(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getCancel_45in_45progressAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConcurrencyCancel_45in_45progressOneOf0__Cancel_45in_45progressAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getCancel_45in_45progressEBooleanObjectParserRuleCall_2_0()); }
		ruleEBooleanObject
		{ after(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getCancel_45in_45progressEBooleanObjectParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
