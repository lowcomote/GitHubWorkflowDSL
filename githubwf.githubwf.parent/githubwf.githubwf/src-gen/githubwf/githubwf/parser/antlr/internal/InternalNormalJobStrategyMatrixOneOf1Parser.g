/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalNormalJobStrategyMatrixOneOf1Parser;

options {
	tokenVocab=InternalNormalJobStrategyMatrixOneOf1Lexer;
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
import githubwf.githubwf.services.NormalJobStrategyMatrixOneOf1GrammarAccess;

}

@members {

 	private NormalJobStrategyMatrixOneOf1GrammarAccess grammarAccess;

    public InternalNormalJobStrategyMatrixOneOf1Parser(TokenStream input, NormalJobStrategyMatrixOneOf1GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "NormalJobStrategyMatrixOneOf1";
   	}

   	@Override
   	protected NormalJobStrategyMatrixOneOf1GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleNormalJobStrategyMatrixOneOf1
entryRuleNormalJobStrategyMatrixOneOf1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNormalJobStrategyMatrixOneOf1Rule()); }
	iv_ruleNormalJobStrategyMatrixOneOf1=ruleNormalJobStrategyMatrixOneOf1
	{ $current=$iv_ruleNormalJobStrategyMatrixOneOf1.current; }
	EOF;

// Rule NormalJobStrategyMatrixOneOf1
ruleNormalJobStrategyMatrixOneOf1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Matrix
		{
			newLeafNode(otherlv_0, grammarAccess.getNormalJobStrategyMatrixOneOf1Access().getMatrixKeyword_0());
		}
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getNormalJobStrategyMatrixOneOf1Access().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNormalJobStrategyMatrixOneOf1Access().getMatrixExpressionSyntaxParserRuleCall_2_0());
				}
				lv_matrix_2_0=ruleExpressionSyntax
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNormalJobStrategyMatrixOneOf1Rule());
					}
					set(
						$current,
						"matrix",
						lv_matrix_2_0,
						"githubwf.githubwf.NormalJobStrategyMatrixOneOf1.ExpressionSyntax");
					afterParserOrEnumRuleCall();
				}
			)
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
					"githubwf.githubwf.NormalJobStrategyMatrixOneOf1.EString");
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
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1());
		}
		this_KEYWORD_1=ruleKEYWORD
		{
			$current.merge(this_KEYWORD_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleKEYWORD
entryRuleKEYWORD returns [String current=null]:
	{ newCompositeNode(grammarAccess.getKEYWORDRule()); }
	iv_ruleKEYWORD=ruleKEYWORD
	{ $current=$iv_ruleKEYWORD.current.getText(); }
	EOF;

// Rule KEYWORD
ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw=Matrix
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMatrixKeyword());
	}
;
