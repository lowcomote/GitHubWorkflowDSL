/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalConfigurationOneOf2Parser;

options {
	tokenVocab=InternalConfigurationOneOf2Lexer;
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
import githubwf.githubwf.services.ConfigurationOneOf2GrammarAccess;

}

@members {

 	private ConfigurationOneOf2GrammarAccess grammarAccess;

    public InternalConfigurationOneOf2Parser(TokenStream input, ConfigurationOneOf2GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ConfigurationOneOf2";
   	}

   	@Override
   	protected ConfigurationOneOf2GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleConfigurationOneOf2
entryRuleConfigurationOneOf2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationOneOf2Rule()); }
	iv_ruleConfigurationOneOf2=ruleConfigurationOneOf2
	{ $current=$iv_ruleConfigurationOneOf2.current; }
	EOF;

// Rule ConfigurationOneOf2
ruleConfigurationOneOf2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getConfigurationOneOf2Access().getConfigurationEBooleanObjectParserRuleCall_0());
			}
			lv_configuration_0_0=ruleEBooleanObject
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getConfigurationOneOf2Rule());
				}
				set(
					$current,
					"configuration",
					lv_configuration_0_0,
					"githubwf.githubwf.ConfigurationOneOf2.EBooleanObject");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleEBooleanObject
entryRuleEBooleanObject returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEBooleanObjectRule()); }
	iv_ruleEBooleanObject=ruleEBooleanObject
	{ $current=$iv_ruleEBooleanObject.current.getText(); }
	EOF;

// Rule EBooleanObject
ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=True
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
		}
		    |
		kw=False
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1());
		}
	)
;
