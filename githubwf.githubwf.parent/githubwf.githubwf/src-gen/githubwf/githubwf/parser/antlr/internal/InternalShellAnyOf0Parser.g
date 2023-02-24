/*
 * generated by Xtext 2.23.0
 */
parser grammar InternalShellAnyOf0Parser;

options {
	tokenVocab=InternalShellAnyOf0Lexer;
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
import githubwf.githubwf.services.ShellAnyOf0GrammarAccess;

}

@members {

 	private ShellAnyOf0GrammarAccess grammarAccess;

    public InternalShellAnyOf0Parser(TokenStream input, ShellAnyOf0GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ShellAnyOf0";
   	}

   	@Override
   	protected ShellAnyOf0GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleShellAnyOf0
entryRuleShellAnyOf0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShellAnyOf0Rule()); }
	iv_ruleShellAnyOf0=ruleShellAnyOf0
	{ $current=$iv_ruleShellAnyOf0.current; }
	EOF;

// Rule ShellAnyOf0
ruleShellAnyOf0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getShellAnyOf0Access().getShellEStringParserRuleCall_0());
			}
			lv_shell_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getShellAnyOf0Rule());
				}
				set(
					$current,
					"shell",
					lv_shell_0_0,
					"githubwf.githubwf.ShellAnyOf0.EString");
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