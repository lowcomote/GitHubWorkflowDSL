/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalEnvOneOf1Parser;

options {
	tokenVocab=InternalEnvOneOf1Lexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
package githubwf.githubwf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import githubwf.githubwf.services.EnvOneOf1GrammarAccess;

}

@members {

 	private EnvOneOf1GrammarAccess grammarAccess;

    public InternalEnvOneOf1Parser(TokenStream input, EnvOneOf1GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "EnvOneOf1";
   	}

   	@Override
   	protected EnvOneOf1GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEnvOneOf1
entryRuleEnvOneOf1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvOneOf1Rule()); }
	iv_ruleEnvOneOf1=ruleEnvOneOf1
	{ $current=$iv_ruleEnvOneOf1.current; }
	EOF;

// Rule EnvOneOf1
ruleEnvOneOf1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getEnvOneOf1Access().getEnvStringContainingExpressionSyntaxParserRuleCall_0());
			}
			lv_env_0_0=ruleStringContainingExpressionSyntax
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getEnvOneOf1Rule());
				}
				set(
					$current,
					"env",
					lv_env_0_0,
					"githubwf.githubwf.EnvOneOf1.StringContainingExpressionSyntax");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleStringContainingExpressionSyntax
entryRuleStringContainingExpressionSyntax returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringContainingExpressionSyntaxRule()); }
	iv_ruleStringContainingExpressionSyntax=ruleStringContainingExpressionSyntax
	{ $current=$iv_ruleStringContainingExpressionSyntax.current; }
	EOF;

// Rule StringContainingExpressionSyntax
ruleStringContainingExpressionSyntax returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStringContainingExpressionSyntaxAccess().getStringContainingExpressionSyntaxEStringParserRuleCall_0());
			}
			lv_stringContainingExpressionSyntax_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getStringContainingExpressionSyntaxRule());
				}
				set(
					$current,
					"stringContainingExpressionSyntax",
					lv_stringContainingExpressionSyntax_0_0,
					"githubwf.githubwf.EnvOneOf1.EString");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall());
	}
	this_VALID_STRING_0=ruleVALID_STRING
	{
		$current.merge(this_VALID_STRING_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleVALID_STRING
entryRuleVALID_STRING returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVALID_STRINGRule()); }
	iv_ruleVALID_STRING=ruleVALID_STRING
	{ $current=$iv_ruleVALID_STRING.current.getText(); }
	EOF;

// Rule VALID_STRING
ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall());
	}
;
