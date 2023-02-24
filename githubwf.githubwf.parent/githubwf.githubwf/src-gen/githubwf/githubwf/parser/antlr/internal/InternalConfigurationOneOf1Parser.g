/*
 * generated by Xtext 2.23.0
 */
parser grammar InternalConfigurationOneOf1Parser;

options {
	tokenVocab=InternalConfigurationOneOf1Lexer;
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
import githubwf.githubwf.services.ConfigurationOneOf1GrammarAccess;

}

@members {

 	private ConfigurationOneOf1GrammarAccess grammarAccess;

    public InternalConfigurationOneOf1Parser(TokenStream input, ConfigurationOneOf1GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ConfigurationOneOf1";
   	}

   	@Override
   	protected ConfigurationOneOf1GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleConfigurationOneOf1
entryRuleConfigurationOneOf1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationOneOf1Rule()); }
	iv_ruleConfigurationOneOf1=ruleConfigurationOneOf1
	{ $current=$iv_ruleConfigurationOneOf1.current; }
	EOF;

// Rule ConfigurationOneOf1
ruleConfigurationOneOf1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getConfigurationOneOf1Access().getConfigurationEDoubleObjectParserRuleCall_0());
			}
			lv_configuration_0_0=ruleEDoubleObject
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getConfigurationOneOf1Rule());
				}
				set(
					$current,
					"configuration",
					lv_configuration_0_0,
					"githubwf.githubwf.ConfigurationOneOf1.EDoubleObject");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleEDoubleObject
entryRuleEDoubleObject returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleObjectRule()); }
	iv_ruleEDoubleObject=ruleEDoubleObject
	{ $current=$iv_ruleEDoubleObject.current.getText(); }
	EOF;

// Rule EDoubleObject
ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_E_INT_0=RULE_E_INT
		{
			$current.merge(this_E_INT_0);
		}
		{
			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0());
		}
		    |
		this_E_DOUBLE_1=RULE_E_DOUBLE
		{
			$current.merge(this_E_DOUBLE_1);
		}
		{
			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1());
		}
	)
;
