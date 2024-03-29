/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser;

options {
	tokenVocab=InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Lexer;
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
import githubwf.githubwf.services.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess;

}

@members {

 	private ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess grammarAccess;

    public InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser(TokenStream input, ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1";
   	}

   	@Override
   	protected ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1
entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Rule()); }
	iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1
	{ $current=$iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1.current; }
	EOF;

// Rule ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1
ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Access().getAdditionalPropertiesExpressionSyntaxParserRuleCall_0());
			}
			lv_additionalProperties_0_0=ruleExpressionSyntax
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Rule());
				}
				set(
					$current,
					"additionalProperties",
					lv_additionalProperties_0_0,
					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1.ExpressionSyntax");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleExpressionSyntax
entryRuleExpressionSyntax returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionSyntaxRule()); }
	iv_ruleExpressionSyntax=ruleExpressionSyntax
	{ $current=$iv_ruleExpressionSyntax.current; }
	EOF;

// Rule ExpressionSyntax
ruleExpressionSyntax returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxEStringParserRuleCall_0());
			}
			lv_expressionSyntax_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getExpressionSyntaxRule());
				}
				set(
					$current,
					"expressionSyntax",
					lv_expressionSyntax_0_0,
					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1.EString");
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
