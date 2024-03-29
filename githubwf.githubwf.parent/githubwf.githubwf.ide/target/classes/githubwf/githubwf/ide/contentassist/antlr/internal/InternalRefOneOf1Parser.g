/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalRefOneOf1Parser;

options {
	tokenVocab=InternalRefOneOf1Lexer;
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
import githubwf.githubwf.services.RefOneOf1GrammarAccess;

}
@members {
	private RefOneOf1GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("Null", "'null'");
	}

	public void setGrammarAccess(RefOneOf1GrammarAccess grammarAccess) {
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

// Entry rule entryRuleRefOneOf1
entryRuleRefOneOf1
:
{ before(grammarAccess.getRefOneOf1Rule()); }
	 ruleRefOneOf1
{ after(grammarAccess.getRefOneOf1Rule()); } 
	 EOF 
;

// Rule RefOneOf1
ruleRefOneOf1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRefOneOf1Access().getRefAssignment()); }
		(rule__RefOneOf1__RefAssignment)
		{ after(grammarAccess.getRefOneOf1Access().getRefAssignment()); }
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

rule__RefOneOf1__RefAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefOneOf1Access().getRefNullValueParserRuleCall_0()); }
		ruleNullValue
		{ after(grammarAccess.getRefOneOf1Access().getRefNullValueParserRuleCall_0()); }
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
