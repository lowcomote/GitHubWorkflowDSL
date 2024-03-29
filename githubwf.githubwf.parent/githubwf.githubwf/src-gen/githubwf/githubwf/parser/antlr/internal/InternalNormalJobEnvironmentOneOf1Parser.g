/*
 * generated by Xtext 2.29.0
 */
parser grammar InternalNormalJobEnvironmentOneOf1Parser;

options {
	tokenVocab=InternalNormalJobEnvironmentOneOf1Lexer;
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
import githubwf.githubwf.services.NormalJobEnvironmentOneOf1GrammarAccess;

}

@members {

 	private NormalJobEnvironmentOneOf1GrammarAccess grammarAccess;

    public InternalNormalJobEnvironmentOneOf1Parser(TokenStream input, NormalJobEnvironmentOneOf1GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "NormalJobEnvironmentOneOf1";
   	}

   	@Override
   	protected NormalJobEnvironmentOneOf1GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleNormalJobEnvironmentOneOf1
entryRuleNormalJobEnvironmentOneOf1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNormalJobEnvironmentOneOf1Rule()); }
	iv_ruleNormalJobEnvironmentOneOf1=ruleNormalJobEnvironmentOneOf1
	{ $current=$iv_ruleNormalJobEnvironmentOneOf1.current; }
	EOF;

// Rule NormalJobEnvironmentOneOf1
ruleNormalJobEnvironmentOneOf1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Environment
		{
			newLeafNode(otherlv_0, grammarAccess.getNormalJobEnvironmentOneOf1Access().getEnvironmentKeyword_0());
		}
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getNormalJobEnvironmentOneOf1Access().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNormalJobEnvironmentOneOf1Access().getEnvironmentEnvironmentParserRuleCall_2_0());
				}
				lv_environment_2_0=ruleEnvironment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNormalJobEnvironmentOneOf1Rule());
					}
					set(
						$current,
						"environment",
						lv_environment_2_0,
						"githubwf.githubwf.NormalJobEnvironmentOneOf1.Environment");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEnvironmentPropertiesAbstract
entryRuleEnvironmentPropertiesAbstract returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvironmentPropertiesAbstractRule()); }
	iv_ruleEnvironmentPropertiesAbstract=ruleEnvironmentPropertiesAbstract
	{ $current=$iv_ruleEnvironmentPropertiesAbstract.current; }
	EOF;

// Rule EnvironmentPropertiesAbstract
ruleEnvironmentPropertiesAbstract returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEnvironmentPropertiesAbstractAccess().getEnvironmentNameParserRuleCall_0());
		}
		this_EnvironmentName_0=ruleEnvironmentName
		{
			$current = $this_EnvironmentName_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEnvironmentPropertiesAbstractAccess().getEnvironmentUrlParserRuleCall_1());
		}
		this_EnvironmentUrl_1=ruleEnvironmentUrl
		{
			$current = $this_EnvironmentUrl_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEnvironment
entryRuleEnvironment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvironmentRule()); }
	iv_ruleEnvironment=ruleEnvironment
	{ $current=$iv_ruleEnvironment.current; }
	EOF;

// Rule Environment
ruleEnvironment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
					$current);
			}
		)
		otherlv_1=LeftCurlyBracket
		{
			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentPropertiesAbstractParserRuleCall_2_0_0());
					}
					lv_environment_2_0=ruleEnvironmentPropertiesAbstract
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnvironmentRule());
						}
						add(
							$current,
							"environment",
							lv_environment_2_0,
							"githubwf.githubwf.NormalJobEnvironmentOneOf1.EnvironmentPropertiesAbstract");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=Comma
				{
					newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentPropertiesAbstractParserRuleCall_2_1_1_0());
						}
						lv_environment_4_0=ruleEnvironmentPropertiesAbstract
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEnvironmentRule());
							}
							add(
								$current,
								"environment",
								lv_environment_4_0,
								"githubwf.githubwf.NormalJobEnvironmentOneOf1.EnvironmentPropertiesAbstract");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=RightCurlyBracket
		{
			newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleEnvironmentName
entryRuleEnvironmentName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvironmentNameRule()); }
	iv_ruleEnvironmentName=ruleEnvironmentName
	{ $current=$iv_ruleEnvironmentName.current; }
	EOF;

// Rule EnvironmentName
ruleEnvironmentName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEnvironmentNameAccess().getEnvironmentNameAction_0(),
					$current);
			}
		)
		otherlv_1=Name
		{
			newLeafNode(otherlv_1, grammarAccess.getEnvironmentNameAccess().getNameKeyword_1());
		}
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getEnvironmentNameAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnvironmentNameAccess().getNameEStringParserRuleCall_3_0());
				}
				lv_name_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnvironmentNameRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"githubwf.githubwf.NormalJobEnvironmentOneOf1.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEnvironmentUrl
entryRuleEnvironmentUrl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvironmentUrlRule()); }
	iv_ruleEnvironmentUrl=ruleEnvironmentUrl
	{ $current=$iv_ruleEnvironmentUrl.current; }
	EOF;

// Rule EnvironmentUrl
ruleEnvironmentUrl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Url
		{
			newLeafNode(otherlv_0, grammarAccess.getEnvironmentUrlAccess().getUrlKeyword_0());
		}
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getEnvironmentUrlAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnvironmentUrlAccess().getUrlEStringParserRuleCall_2_0());
				}
				lv_url_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnvironmentUrlRule());
					}
					set(
						$current,
						"url",
						lv_url_2_0,
						"githubwf.githubwf.NormalJobEnvironmentOneOf1.EString");
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
	(
		kw=Environment
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnvironmentKeyword_0());
		}
		    |
		kw=Name
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_1());
		}
		    |
		kw=Url
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getUrlKeyword_2());
		}
	)
;
