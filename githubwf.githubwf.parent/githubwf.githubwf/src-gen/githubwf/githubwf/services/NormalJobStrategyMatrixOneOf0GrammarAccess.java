/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class NormalJobStrategyMatrixOneOf0GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class NormalJobStrategyMatrixOneOf0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.NormalJobStrategyMatrixOneOf0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNormalJobStrategyMatrixOneOf0Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMatrixKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cMatrixAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cMatrixNormalJobStrategyMatrixOneOf0PropertiesAbstractParserRuleCall_4_0_0 = (RuleCall)cMatrixAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cMatrixAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cMatrixNormalJobStrategyMatrixOneOf0PropertiesAbstractParserRuleCall_4_1_1_0 = (RuleCall)cMatrixAssignment_4_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		////EClass NormalJobStrategyMatrixOneOf0
		//NormalJobStrategyMatrixOneOf0 returns NormalJobStrategyMatrixOneOf0:
		//    {NormalJobStrategyMatrixOneOf0}
		//            //Keywords
		//            '"matrix"' ':'
		//            '{'(matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract ( "," matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract)* )?'}'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{NormalJobStrategyMatrixOneOf0}
		//        //Keywords
		//        '"matrix"' ':'
		//        '{'(matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract ( "," matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract)* )?'}'
		public Group getGroup() { return cGroup; }
		
		//{NormalJobStrategyMatrixOneOf0}
		public Action getNormalJobStrategyMatrixOneOf0Action_0() { return cNormalJobStrategyMatrixOneOf0Action_0; }
		
		////Keywords
		//'"matrix"'
		public Keyword getMatrixKeyword_1() { return cMatrixKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//(matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract ( "," matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract)* )?
		public Group getGroup_4() { return cGroup_4; }
		
		//matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract
		public Assignment getMatrixAssignment_4_0() { return cMatrixAssignment_4_0; }
		
		//NormalJobStrategyMatrixOneOf0PropertiesAbstract
		public RuleCall getMatrixNormalJobStrategyMatrixOneOf0PropertiesAbstractParserRuleCall_4_0_0() { return cMatrixNormalJobStrategyMatrixOneOf0PropertiesAbstractParserRuleCall_4_0_0; }
		
		//( "," matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract)*
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//","
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }
		
		//matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract
		public Assignment getMatrixAssignment_4_1_1() { return cMatrixAssignment_4_1_1; }
		
		//NormalJobStrategyMatrixOneOf0PropertiesAbstract
		public RuleCall getMatrixNormalJobStrategyMatrixOneOf0PropertiesAbstractParserRuleCall_4_1_1_0() { return cMatrixNormalJobStrategyMatrixOneOf0PropertiesAbstractParserRuleCall_4_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class NormalJobStrategyMatrixOneOf0PropertiesAbstractElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.NormalJobStrategyMatrixOneOf0PropertiesAbstract");
		private final RuleCall cNormalJobStrategyMatrixOneOf0AdditionalPropertiesParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//NormalJobStrategyMatrixOneOf0PropertiesAbstract returns NormalJobStrategyMatrixOneOf0PropertiesAbstract:
		//    =>NormalJobStrategyMatrixOneOf0AdditionalProperties;
		@Override public ParserRule getRule() { return rule; }
		
		//=>NormalJobStrategyMatrixOneOf0AdditionalProperties
		public RuleCall getNormalJobStrategyMatrixOneOf0AdditionalPropertiesParserRuleCall() { return cNormalJobStrategyMatrixOneOf0AdditionalPropertiesParserRuleCall; }
	}
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStringValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cArrayValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cNullValueParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cNumberValueParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cObjectValueParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cBooleanValueParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Value returns jsonMM::Value:
		//    StringValue | ArrayValue | NullValue | NumberValue | ObjectValue | BooleanValue;
		@Override public ParserRule getRule() { return rule; }
		
		//StringValue | ArrayValue | NullValue | NumberValue | ObjectValue | BooleanValue
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//StringValue
		public RuleCall getStringValueParserRuleCall_0() { return cStringValueParserRuleCall_0; }
		
		//ArrayValue
		public RuleCall getArrayValueParserRuleCall_1() { return cArrayValueParserRuleCall_1; }
		
		//NullValue
		public RuleCall getNullValueParserRuleCall_2() { return cNullValueParserRuleCall_2; }
		
		//NumberValue
		public RuleCall getNumberValueParserRuleCall_3() { return cNumberValueParserRuleCall_3; }
		
		//ObjectValue
		public RuleCall getObjectValueParserRuleCall_4() { return cObjectValueParserRuleCall_4; }
		
		//BooleanValue
		public RuleCall getBooleanValueParserRuleCall_5() { return cBooleanValueParserRuleCall_5; }
	}
	public class NormalJobStrategyMatrixOneOf0AdditionalPropertiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.NormalJobStrategyMatrixOneOf0AdditionalProperties");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKeyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cKeyEStringParserRuleCall_0_0 = (RuleCall)cKeyAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAdditionalPropertiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAdditionalPropertiesJsonDocumentParserRuleCall_2_0 = (RuleCall)cAdditionalPropertiesAssignment_2.eContents().get(0);
		
		////EClass NormalJobStrategyMatrixOneOf0AdditionalProperties
		//NormalJobStrategyMatrixOneOf0AdditionalProperties returns NormalJobStrategyMatrixOneOf0AdditionalProperties:
		//            //KeyValue
		//            key=EString
		//            ':'
		//            //EReference is not a keyword
		//            additionalProperties=JsonDocument
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		////KeyValue
		//key=EString
		//':'
		////EReference is not a keyword
		//additionalProperties=JsonDocument
		public Group getGroup() { return cGroup; }
		
		////KeyValue
		//key=EString
		public Assignment getKeyAssignment_0() { return cKeyAssignment_0; }
		
		//EString
		public RuleCall getKeyEStringParserRuleCall_0_0() { return cKeyEStringParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		////EReference is not a keyword
		//additionalProperties=JsonDocument
		public Assignment getAdditionalPropertiesAssignment_2() { return cAdditionalPropertiesAssignment_2; }
		
		//JsonDocument
		public RuleCall getAdditionalPropertiesJsonDocumentParserRuleCall_2_0() { return cAdditionalPropertiesJsonDocumentParserRuleCall_2_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.EString");
		private final RuleCall cVALID_STRINGParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString returns ecore::EString:
		//    VALID_STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//VALID_STRING
		public RuleCall getVALID_STRINGParserRuleCall() { return cVALID_STRINGParserRuleCall; }
	}
	public class JsonDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.JsonDocument");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueValueParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		////EClass JsonDocument
		//JsonDocument returns jsonMM::JsonDocument:
		//            //EReference is not a keyword
		//            value=Value
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		////EReference is not a keyword
		//value=Value
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_0() { return cValueValueParserRuleCall_0; }
	}
	public class StringValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.StringValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEStringParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		////EClass StringValue
		//StringValue returns jsonMM::StringValue:
		//            value=EString
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//value=EString
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//EString
		public RuleCall getValueEStringParserRuleCall_0() { return cValueEStringParserRuleCall_0; }
	}
	public class ArrayValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.ArrayValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cArrayValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cValueValueParserRuleCall_2_0_0 = (RuleCall)cValueAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cValueAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cValueValueParserRuleCall_2_1_1_0 = (RuleCall)cValueAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////EClass ArrayValue
		//ArrayValue returns jsonMM::ArrayValue:
		//    {jsonMM::ArrayValue}
		//            //EReference is not a keyword
		//            '['(value+=Value ( "," value+=Value)* )?']'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{jsonMM::ArrayValue}
		//        //EReference is not a keyword
		//        '['(value+=Value ( "," value+=Value)* )?']'
		public Group getGroup() { return cGroup; }
		
		//{jsonMM::ArrayValue}
		public Action getArrayValueAction_0() { return cArrayValueAction_0; }
		
		////EReference is not a keyword
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//(value+=Value ( "," value+=Value)* )?
		public Group getGroup_2() { return cGroup_2; }
		
		//value+=Value
		public Assignment getValueAssignment_2_0() { return cValueAssignment_2_0; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_0_0() { return cValueValueParserRuleCall_2_0_0; }
		
		//( "," value+=Value)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//value+=Value
		public Assignment getValueAssignment_2_1_1() { return cValueAssignment_2_1_1; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_1_1_0() { return cValueValueParserRuleCall_2_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class NullValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.NullValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueNullEnumEnumRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		////EClass NullValue
		//NullValue returns jsonMM::NullValue:
		//            value=NullEnum
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//value=NullEnum
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//NullEnum
		public RuleCall getValueNullEnumEnumRuleCall_0() { return cValueNullEnumEnumRuleCall_0; }
	}
	public class NumberValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.NumberValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEDoubleParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		////EClass NumberValue
		//NumberValue returns jsonMM::NumberValue:
		//            value=EDouble
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//value=EDouble
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//EDouble
		public RuleCall getValueEDoubleParserRuleCall_0() { return cValueEDoubleParserRuleCall_0; }
	}
	public class ObjectValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.ObjectValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cObjectValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cKeyvaluepairAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cKeyvaluepairKeyValuePairParserRuleCall_2_0_0 = (RuleCall)cKeyvaluepairAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cKeyvaluepairAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0 = (RuleCall)cKeyvaluepairAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////EClass ObjectValue
		//ObjectValue returns jsonMM::ObjectValue:
		//    {jsonMM::ObjectValue}
		//    '{'
		//            //EReference is not a keyword
		//            (keyvaluepair+=KeyValuePair ( "," keyvaluepair+=KeyValuePair)* )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{jsonMM::ObjectValue}
		//'{'
		//        //EReference is not a keyword
		//        (keyvaluepair+=KeyValuePair ( "," keyvaluepair+=KeyValuePair)* )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{jsonMM::ObjectValue}
		public Action getObjectValueAction_0() { return cObjectValueAction_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		////EReference is not a keyword
		//(keyvaluepair+=KeyValuePair ( "," keyvaluepair+=KeyValuePair)* )?
		public Group getGroup_2() { return cGroup_2; }
		
		//keyvaluepair+=KeyValuePair
		public Assignment getKeyvaluepairAssignment_2_0() { return cKeyvaluepairAssignment_2_0; }
		
		//KeyValuePair
		public RuleCall getKeyvaluepairKeyValuePairParserRuleCall_2_0_0() { return cKeyvaluepairKeyValuePairParserRuleCall_2_0_0; }
		
		//( "," keyvaluepair+=KeyValuePair)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//keyvaluepair+=KeyValuePair
		public Assignment getKeyvaluepairAssignment_2_1_1() { return cKeyvaluepairAssignment_2_1_1; }
		
		//KeyValuePair
		public RuleCall getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0() { return cKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class BooleanValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.BooleanValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEBooleanParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		////EClass BooleanValue
		//BooleanValue returns jsonMM::BooleanValue:
		//            value=EBoolean
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//value=EBoolean
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//EBoolean
		public RuleCall getValueEBooleanParserRuleCall_0() { return cValueEBooleanParserRuleCall_0; }
	}
	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.EDouble");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cE_INTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cE_DOUBLETerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EDouble returns ecore::EDouble:
		//    E_INT | E_DOUBLE;
		@Override public ParserRule getRule() { return rule; }
		
		//E_INT | E_DOUBLE
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//E_INT
		public RuleCall getE_INTTerminalRuleCall_0() { return cE_INTTerminalRuleCall_0; }
		
		//E_DOUBLE
		public RuleCall getE_DOUBLETerminalRuleCall_1() { return cE_DOUBLETerminalRuleCall_1; }
	}
	public class KeyValuePairElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.KeyValuePair");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKeyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cKeyEStringParserRuleCall_0_0 = (RuleCall)cKeyAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		////EClass KeyValuePair
		//KeyValuePair returns jsonMM::KeyValuePair:
		//            //KeyValue
		//            key=EString
		//            ':'
		//            //EReference is not a keyword
		//            value=Value
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		////KeyValue
		//key=EString
		//':'
		////EReference is not a keyword
		//value=Value
		public Group getGroup() { return cGroup; }
		
		////KeyValue
		//key=EString
		public Assignment getKeyAssignment_0() { return cKeyAssignment_0; }
		
		//EString
		public RuleCall getKeyEStringParserRuleCall_0_0() { return cKeyEStringParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		////EReference is not a keyword
		//value=Value
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_0() { return cValueValueParserRuleCall_2_0; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean returns ecore::EBoolean:
		//    'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class VALID_STRINGElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.VALID_STRING");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cKEYWORDParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//VALID_STRING: STRING  | KEYWORD ;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING  | KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//KEYWORD
		public RuleCall getKEYWORDParserRuleCall_1() { return cKEYWORDParserRuleCall_1; }
	}
	public class KEYWORDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.KEYWORD");
		private final Keyword cMatrixKeyword = (Keyword)rule.eContents().get(1);
		
		//KEYWORD:
		//'"matrix"'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'"matrix"'
		public Keyword getMatrixKeyword() { return cMatrixKeyword; }
	}
	
	public class NullEnumElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.NullEnum");
		private final EnumLiteralDeclaration cNullEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cNullNullKeyword_0 = (Keyword)cNullEnumLiteralDeclaration.eContents().get(0);
		
		//enum NullEnum returns jsonMM::NullEnum:
		//                null = 'null';
		public EnumRule getRule() { return rule; }
		
		//null = 'null'
		public EnumLiteralDeclaration getNullEnumLiteralDeclaration() { return cNullEnumLiteralDeclaration; }
		
		//'null'
		public Keyword getNullNullKeyword_0() { return cNullNullKeyword_0; }
	}
	
	private final NormalJobStrategyMatrixOneOf0Elements pNormalJobStrategyMatrixOneOf0;
	private final NormalJobStrategyMatrixOneOf0PropertiesAbstractElements pNormalJobStrategyMatrixOneOf0PropertiesAbstract;
	private final ValueElements pValue;
	private final NormalJobStrategyMatrixOneOf0AdditionalPropertiesElements pNormalJobStrategyMatrixOneOf0AdditionalProperties;
	private final EStringElements pEString;
	private final JsonDocumentElements pJsonDocument;
	private final StringValueElements pStringValue;
	private final ArrayValueElements pArrayValue;
	private final NullValueElements pNullValue;
	private final NumberValueElements pNumberValue;
	private final ObjectValueElements pObjectValue;
	private final BooleanValueElements pBooleanValue;
	private final NullEnumElements eNullEnum;
	private final EDoubleElements pEDouble;
	private final KeyValuePairElements pKeyValuePair;
	private final EBooleanElements pEBoolean;
	private final TerminalRule tINT;
	private final VALID_STRINGElements pVALID_STRING;
	private final TerminalRule tSTRING;
	private final TerminalRule tE_INT;
	private final KEYWORDElements pKEYWORD;
	private final TerminalRule tE_DOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public NormalJobStrategyMatrixOneOf0GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pNormalJobStrategyMatrixOneOf0 = new NormalJobStrategyMatrixOneOf0Elements();
		this.pNormalJobStrategyMatrixOneOf0PropertiesAbstract = new NormalJobStrategyMatrixOneOf0PropertiesAbstractElements();
		this.pValue = new ValueElements();
		this.pNormalJobStrategyMatrixOneOf0AdditionalProperties = new NormalJobStrategyMatrixOneOf0AdditionalPropertiesElements();
		this.pEString = new EStringElements();
		this.pJsonDocument = new JsonDocumentElements();
		this.pStringValue = new StringValueElements();
		this.pArrayValue = new ArrayValueElements();
		this.pNullValue = new NullValueElements();
		this.pNumberValue = new NumberValueElements();
		this.pObjectValue = new ObjectValueElements();
		this.pBooleanValue = new BooleanValueElements();
		this.eNullEnum = new NullEnumElements();
		this.pEDouble = new EDoubleElements();
		this.pKeyValuePair = new KeyValuePairElements();
		this.pEBoolean = new EBooleanElements();
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.INT");
		this.pVALID_STRING = new VALID_STRINGElements();
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.STRING");
		this.tE_INT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.E_INT");
		this.pKEYWORD = new KEYWORDElements();
		this.tE_DOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStrategyMatrixOneOf0.E_DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("githubwf.githubwf.NormalJobStrategyMatrixOneOf0".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	////EClass NormalJobStrategyMatrixOneOf0
	//NormalJobStrategyMatrixOneOf0 returns NormalJobStrategyMatrixOneOf0:
	//    {NormalJobStrategyMatrixOneOf0}
	//            //Keywords
	//            '"matrix"' ':'
	//            '{'(matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract ( "," matrix+=NormalJobStrategyMatrixOneOf0PropertiesAbstract)* )?'}'
	//    ;
	public NormalJobStrategyMatrixOneOf0Elements getNormalJobStrategyMatrixOneOf0Access() {
		return pNormalJobStrategyMatrixOneOf0;
	}
	
	public ParserRule getNormalJobStrategyMatrixOneOf0Rule() {
		return getNormalJobStrategyMatrixOneOf0Access().getRule();
	}
	
	//NormalJobStrategyMatrixOneOf0PropertiesAbstract returns NormalJobStrategyMatrixOneOf0PropertiesAbstract:
	//    =>NormalJobStrategyMatrixOneOf0AdditionalProperties;
	public NormalJobStrategyMatrixOneOf0PropertiesAbstractElements getNormalJobStrategyMatrixOneOf0PropertiesAbstractAccess() {
		return pNormalJobStrategyMatrixOneOf0PropertiesAbstract;
	}
	
	public ParserRule getNormalJobStrategyMatrixOneOf0PropertiesAbstractRule() {
		return getNormalJobStrategyMatrixOneOf0PropertiesAbstractAccess().getRule();
	}
	
	//Value returns jsonMM::Value:
	//    StringValue | ArrayValue | NullValue | NumberValue | ObjectValue | BooleanValue;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}
	
	////EClass NormalJobStrategyMatrixOneOf0AdditionalProperties
	//NormalJobStrategyMatrixOneOf0AdditionalProperties returns NormalJobStrategyMatrixOneOf0AdditionalProperties:
	//            //KeyValue
	//            key=EString
	//            ':'
	//            //EReference is not a keyword
	//            additionalProperties=JsonDocument
	//    ;
	public NormalJobStrategyMatrixOneOf0AdditionalPropertiesElements getNormalJobStrategyMatrixOneOf0AdditionalPropertiesAccess() {
		return pNormalJobStrategyMatrixOneOf0AdditionalProperties;
	}
	
	public ParserRule getNormalJobStrategyMatrixOneOf0AdditionalPropertiesRule() {
		return getNormalJobStrategyMatrixOneOf0AdditionalPropertiesAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    VALID_STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	////EClass JsonDocument
	//JsonDocument returns jsonMM::JsonDocument:
	//            //EReference is not a keyword
	//            value=Value
	//    ;
	public JsonDocumentElements getJsonDocumentAccess() {
		return pJsonDocument;
	}
	
	public ParserRule getJsonDocumentRule() {
		return getJsonDocumentAccess().getRule();
	}
	
	////EClass StringValue
	//StringValue returns jsonMM::StringValue:
	//            value=EString
	//    ;
	public StringValueElements getStringValueAccess() {
		return pStringValue;
	}
	
	public ParserRule getStringValueRule() {
		return getStringValueAccess().getRule();
	}
	
	////EClass ArrayValue
	//ArrayValue returns jsonMM::ArrayValue:
	//    {jsonMM::ArrayValue}
	//            //EReference is not a keyword
	//            '['(value+=Value ( "," value+=Value)* )?']'
	//    ;
	public ArrayValueElements getArrayValueAccess() {
		return pArrayValue;
	}
	
	public ParserRule getArrayValueRule() {
		return getArrayValueAccess().getRule();
	}
	
	////EClass NullValue
	//NullValue returns jsonMM::NullValue:
	//            value=NullEnum
	//    ;
	public NullValueElements getNullValueAccess() {
		return pNullValue;
	}
	
	public ParserRule getNullValueRule() {
		return getNullValueAccess().getRule();
	}
	
	////EClass NumberValue
	//NumberValue returns jsonMM::NumberValue:
	//            value=EDouble
	//    ;
	public NumberValueElements getNumberValueAccess() {
		return pNumberValue;
	}
	
	public ParserRule getNumberValueRule() {
		return getNumberValueAccess().getRule();
	}
	
	////EClass ObjectValue
	//ObjectValue returns jsonMM::ObjectValue:
	//    {jsonMM::ObjectValue}
	//    '{'
	//            //EReference is not a keyword
	//            (keyvaluepair+=KeyValuePair ( "," keyvaluepair+=KeyValuePair)* )?
	//    '}';
	public ObjectValueElements getObjectValueAccess() {
		return pObjectValue;
	}
	
	public ParserRule getObjectValueRule() {
		return getObjectValueAccess().getRule();
	}
	
	////EClass BooleanValue
	//BooleanValue returns jsonMM::BooleanValue:
	//            value=EBoolean
	//    ;
	public BooleanValueElements getBooleanValueAccess() {
		return pBooleanValue;
	}
	
	public ParserRule getBooleanValueRule() {
		return getBooleanValueAccess().getRule();
	}
	
	//enum NullEnum returns jsonMM::NullEnum:
	//                null = 'null';
	public NullEnumElements getNullEnumAccess() {
		return eNullEnum;
	}
	
	public EnumRule getNullEnumRule() {
		return getNullEnumAccess().getRule();
	}
	
	//EDouble returns ecore::EDouble:
	//    E_INT | E_DOUBLE;
	public EDoubleElements getEDoubleAccess() {
		return pEDouble;
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	////EClass KeyValuePair
	//KeyValuePair returns jsonMM::KeyValuePair:
	//            //KeyValue
	//            key=EString
	//            ':'
	//            //EReference is not a keyword
	//            value=Value
	//    ;
	public KeyValuePairElements getKeyValuePairAccess() {
		return pKeyValuePair;
	}
	
	public ParserRule getKeyValuePairRule() {
		return getKeyValuePairAccess().getRule();
	}
	
	//EBoolean returns ecore::EBoolean:
	//    'true' | 'false';
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	///**
	// * In JSON the first digit of an integer can not be 0, unless it is 0 itself.
	// */
	//@Override
	//terminal INT returns ecore::EInt:
	//    ('0' |  (('1'..'9') ('0'..'9')*))
	//;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//VALID_STRING: STRING  | KEYWORD ;
	public VALID_STRINGElements getVALID_STRINGAccess() {
		return pVALID_STRING;
	}
	
	public ParserRule getVALID_STRINGRule() {
		return getVALID_STRINGAccess().getRule();
	}
	
	///**
	// * In JSON the single quote for String is not admitted
	// */
	//@Override
	//terminal STRING:
	//    '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"'
	//;
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal E_INT :
	//    '-'? INT;
	public TerminalRule getE_INTRule() {
		return tE_INT;
	}
	
	//KEYWORD:
	//'"matrix"'
	//;
	public KEYWORDElements getKEYWORDAccess() {
		return pKEYWORD;
	}
	
	public ParserRule getKEYWORDRule() {
		return getKEYWORDAccess().getRule();
	}
	
	//terminal E_DOUBLE :
	//    '-'? INT ('.' INT+)? (('E'|'e') ('+'|'-')? INT)?
	//;
	public TerminalRule getE_DOUBLERule() {
		return tE_DOUBLE;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
