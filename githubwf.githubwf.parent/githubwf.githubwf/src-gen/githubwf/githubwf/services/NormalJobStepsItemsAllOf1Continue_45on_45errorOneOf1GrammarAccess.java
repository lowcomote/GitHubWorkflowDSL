/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContinueOnErrorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContinue_45on_45errorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContinue_45on_45errorExpressionSyntaxParserRuleCall_2_0 = (RuleCall)cContinue_45on_45errorAssignment_2.eContents().get(0);
		
		////EClass NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1
		//NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 returns NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1:
		//            //Keywords
		//            '"continue-on-error"' ':'
		//            continue_45on_45error=ExpressionSyntax
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		////Keywords
		//'"continue-on-error"' ':'
		//continue_45on_45error=ExpressionSyntax
		public Group getGroup() { return cGroup; }
		
		////Keywords
		//'"continue-on-error"'
		public Keyword getContinueOnErrorKeyword_0() { return cContinueOnErrorKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//continue_45on_45error=ExpressionSyntax
		public Assignment getContinue_45on_45errorAssignment_2() { return cContinue_45on_45errorAssignment_2; }
		
		//ExpressionSyntax
		public RuleCall getContinue_45on_45errorExpressionSyntaxParserRuleCall_2_0() { return cContinue_45on_45errorExpressionSyntaxParserRuleCall_2_0; }
	}
	public class ExpressionSyntaxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1.ExpressionSyntax");
		private final Assignment cExpressionSyntaxAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpressionSyntaxEStringParserRuleCall_0 = (RuleCall)cExpressionSyntaxAssignment.eContents().get(0);
		
		////EClass ExpressionSyntax
		//ExpressionSyntax returns ExpressionSyntax:
		//            expressionSyntax=EString
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//expressionSyntax=EString
		public Assignment getExpressionSyntaxAssignment() { return cExpressionSyntaxAssignment; }
		
		//EString
		public RuleCall getExpressionSyntaxEStringParserRuleCall_0() { return cExpressionSyntaxEStringParserRuleCall_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1.EString");
		private final RuleCall cVALID_STRINGParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString returns ecore::EString:
		//    VALID_STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//VALID_STRING
		public RuleCall getVALID_STRINGParserRuleCall() { return cVALID_STRINGParserRuleCall; }
	}
	public class VALID_STRINGElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1.VALID_STRING");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1.KEYWORD");
		private final Keyword cContinueOnErrorKeyword = (Keyword)rule.eContents().get(1);
		
		//KEYWORD:
		//'"continue-on-error"'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'"continue-on-error"'
		public Keyword getContinueOnErrorKeyword() { return cContinueOnErrorKeyword; }
	}
	
	
	private final NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Elements pNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1;
	private final ExpressionSyntaxElements pExpressionSyntax;
	private final EStringElements pEString;
	private final TerminalRule tINT;
	private final VALID_STRINGElements pVALID_STRING;
	private final TerminalRule tSTRING;
	private final TerminalRule tE_INT;
	private final KEYWORDElements pKEYWORD;
	private final TerminalRule tE_DOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 = new NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Elements();
		this.pExpressionSyntax = new ExpressionSyntaxElements();
		this.pEString = new EStringElements();
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1.INT");
		this.pVALID_STRING = new VALID_STRINGElements();
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1.STRING");
		this.tE_INT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1.E_INT");
		this.pKEYWORD = new KEYWORDElements();
		this.tE_DOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1.E_DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1".equals(grammar.getName())) {
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

	
	////EClass NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1
	//NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 returns NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1:
	//            //Keywords
	//            '"continue-on-error"' ':'
	//            continue_45on_45error=ExpressionSyntax
	//    ;
	public NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Elements getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access() {
		return pNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1;
	}
	
	public ParserRule getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Rule() {
		return getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getRule();
	}
	
	////EClass ExpressionSyntax
	//ExpressionSyntax returns ExpressionSyntax:
	//            expressionSyntax=EString
	//    ;
	public ExpressionSyntaxElements getExpressionSyntaxAccess() {
		return pExpressionSyntax;
	}
	
	public ParserRule getExpressionSyntaxRule() {
		return getExpressionSyntaxAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    VALID_STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
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
	//'"continue-on-error"'
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
