/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalJobNeedsOneOf0Parser;

options {
	tokenVocab=InternalJobNeedsOneOf0Lexer;
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
import githubwf.githubwf.services.JobNeedsOneOf0GrammarAccess;

}
@members {
	private JobNeedsOneOf0GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("Comma", "','");
		tokenNameToValue.put("LeftSquareBracket", "'['");
		tokenNameToValue.put("RightSquareBracket", "']'");
	}

	public void setGrammarAccess(JobNeedsOneOf0GrammarAccess grammarAccess) {
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

// Entry rule entryRuleJobNeedsOneOf0
entryRuleJobNeedsOneOf0
:
{ before(grammarAccess.getJobNeedsOneOf0Rule()); }
	 ruleJobNeedsOneOf0
{ after(grammarAccess.getJobNeedsOneOf0Rule()); } 
	 EOF 
;

// Rule JobNeedsOneOf0
ruleJobNeedsOneOf0 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJobNeedsOneOf0Access().getGroup()); }
		(rule__JobNeedsOneOf0__Group__0)
		{ after(grammarAccess.getJobNeedsOneOf0Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJobNeedsOneOf0Items
entryRuleJobNeedsOneOf0Items
:
{ before(grammarAccess.getJobNeedsOneOf0ItemsRule()); }
	 ruleJobNeedsOneOf0Items
{ after(grammarAccess.getJobNeedsOneOf0ItemsRule()); } 
	 EOF 
;

// Rule JobNeedsOneOf0Items
ruleJobNeedsOneOf0Items 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJobNeedsOneOf0ItemsAccess().getItemsAssignment()); }
		(rule__JobNeedsOneOf0Items__ItemsAssignment)
		{ after(grammarAccess.getJobNeedsOneOf0ItemsAccess().getItemsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleName
entryRuleName
:
{ before(grammarAccess.getNameRule()); }
	 ruleName
{ after(grammarAccess.getNameRule()); } 
	 EOF 
;

// Rule Name
ruleName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNameAccess().getGroup()); }
		(rule__Name__Group__0)
		{ after(grammarAccess.getNameAccess().getGroup()); }
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

rule__JobNeedsOneOf0__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JobNeedsOneOf0__Group__0__Impl
	rule__JobNeedsOneOf0__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobNeedsOneOf0Access().getLeftSquareBracketKeyword_0()); }
	LeftSquareBracket
	{ after(grammarAccess.getJobNeedsOneOf0Access().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JobNeedsOneOf0__Group__1__Impl
	rule__JobNeedsOneOf0__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsAssignment_1()); }
	(rule__JobNeedsOneOf0__JobNeedsAssignment_1)
	{ after(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JobNeedsOneOf0__Group__2__Impl
	rule__JobNeedsOneOf0__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobNeedsOneOf0Access().getGroup_2()); }
	(rule__JobNeedsOneOf0__Group_2__0)*
	{ after(grammarAccess.getJobNeedsOneOf0Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JobNeedsOneOf0__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobNeedsOneOf0Access().getRightSquareBracketKeyword_3()); }
	RightSquareBracket
	{ after(grammarAccess.getJobNeedsOneOf0Access().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JobNeedsOneOf0__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JobNeedsOneOf0__Group_2__0__Impl
	rule__JobNeedsOneOf0__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobNeedsOneOf0Access().getCommaKeyword_2_0()); }
	Comma
	{ after(grammarAccess.getJobNeedsOneOf0Access().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JobNeedsOneOf0__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsAssignment_2_1()); }
	(rule__JobNeedsOneOf0__JobNeedsAssignment_2_1)
	{ after(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Name__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Name__Group__0__Impl
	rule__Name__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNameAccess().getNameAction_0()); }
	()
	{ after(grammarAccess.getNameAccess().getNameAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Name__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNameAccess().getNameAssignment_1()); }
	(rule__Name__NameAssignment_1)
	{ after(grammarAccess.getNameAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JobNeedsOneOf0__JobNeedsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsJobNeedsOneOf0ItemsParserRuleCall_1_0()); }
		ruleJobNeedsOneOf0Items
		{ after(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsJobNeedsOneOf0ItemsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0__JobNeedsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsJobNeedsOneOf0ItemsParserRuleCall_2_1_0()); }
		ruleJobNeedsOneOf0Items
		{ after(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsJobNeedsOneOf0ItemsParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JobNeedsOneOf0Items__ItemsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJobNeedsOneOf0ItemsAccess().getItemsNameParserRuleCall_0()); }
		ruleName
		{ after(grammarAccess.getJobNeedsOneOf0ItemsAccess().getItemsNameParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNameAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getNameAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
