/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalConfigurationOneOf2Parser;

options {
	tokenVocab=InternalConfigurationOneOf2Lexer;
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
import githubwf.githubwf.services.ConfigurationOneOf2GrammarAccess;

}
@members {
	private ConfigurationOneOf2GrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("False", "'false'");
	}

	public void setGrammarAccess(ConfigurationOneOf2GrammarAccess grammarAccess) {
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

// Entry rule entryRuleConfigurationOneOf2
entryRuleConfigurationOneOf2
:
{ before(grammarAccess.getConfigurationOneOf2Rule()); }
	 ruleConfigurationOneOf2
{ after(grammarAccess.getConfigurationOneOf2Rule()); } 
	 EOF 
;

// Rule ConfigurationOneOf2
ruleConfigurationOneOf2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigurationOneOf2Access().getConfigurationAssignment()); }
		(rule__ConfigurationOneOf2__ConfigurationAssignment)
		{ after(grammarAccess.getConfigurationOneOf2Access().getConfigurationAssignment()); }
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

rule__ConfigurationOneOf2__ConfigurationAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationOneOf2Access().getConfigurationEBooleanObjectParserRuleCall_0()); }
		ruleEBooleanObject
		{ after(grammarAccess.getConfigurationOneOf2Access().getConfigurationEBooleanObjectParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
