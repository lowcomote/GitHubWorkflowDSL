/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalNormalJobEnvironmentOneOf0Parser;

options {
	tokenVocab=InternalNormalJobEnvironmentOneOf0Lexer;
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
import githubwf.githubwf.services.NormalJobEnvironmentOneOf0GrammarAccess;

}

@members {

 	private NormalJobEnvironmentOneOf0GrammarAccess grammarAccess;

    public InternalNormalJobEnvironmentOneOf0Parser(TokenStream input, NormalJobEnvironmentOneOf0GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "NormalJobEnvironmentOneOf0";
   	}

   	@Override
   	protected NormalJobEnvironmentOneOf0GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleNormalJobEnvironmentOneOf0
entryRuleNormalJobEnvironmentOneOf0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNormalJobEnvironmentOneOf0Rule()); }
	iv_ruleNormalJobEnvironmentOneOf0=ruleNormalJobEnvironmentOneOf0
	{ $current=$iv_ruleNormalJobEnvironmentOneOf0.current; }
	EOF;

// Rule NormalJobEnvironmentOneOf0
ruleNormalJobEnvironmentOneOf0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Environment
		{
			newLeafNode(otherlv_0, grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentKeyword_0());
		}
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getNormalJobEnvironmentOneOf0Access().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentEStringParserRuleCall_2_0());
				}
				lv_environment_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNormalJobEnvironmentOneOf0Rule());
					}
					set(
						$current,
						"environment",
						lv_environment_2_0,
						"githubwf.githubwf.NormalJobEnvironmentOneOf0.EString");
					afterParserOrEnumRuleCall();
				}
			)
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
	kw=Environment
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnvironmentKeyword());
	}
;
