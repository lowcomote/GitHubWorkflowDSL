/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalEventObjectOneOf1Parser;

options {
	tokenVocab=InternalEventObjectOneOf1Lexer;
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
import githubwf.githubwf.services.EventObjectOneOf1GrammarAccess;

}
@members {
	private EventObjectOneOf1GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("Null", "'null'");
	}

	public void setGrammarAccess(EventObjectOneOf1GrammarAccess grammarAccess) {
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

// Entry rule entryRuleEventObjectOneOf1
entryRuleEventObjectOneOf1
:
{ before(grammarAccess.getEventObjectOneOf1Rule()); }
	 ruleEventObjectOneOf1
{ after(grammarAccess.getEventObjectOneOf1Rule()); } 
	 EOF 
;

// Rule EventObjectOneOf1
ruleEventObjectOneOf1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEventObjectOneOf1Access().getEventObjectAssignment()); }
		(rule__EventObjectOneOf1__EventObjectAssignment)
		{ after(grammarAccess.getEventObjectOneOf1Access().getEventObjectAssignment()); }
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

rule__EventObjectOneOf1__EventObjectAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventObjectOneOf1Access().getEventObjectNullValueParserRuleCall_0()); }
		ruleNullValue
		{ after(grammarAccess.getEventObjectOneOf1Access().getEventObjectNullValueParserRuleCall_0()); }
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
