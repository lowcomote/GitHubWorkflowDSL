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
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EnvOneOf0AdditionalPropertiesOneOf1GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class EnvOneOf0AdditionalPropertiesOneOf1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.EnvOneOf0AdditionalPropertiesOneOf1.EnvOneOf0AdditionalPropertiesOneOf1");
		private final Assignment cAdditionalPropertiesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAdditionalPropertiesEDoubleObjectParserRuleCall_0 = (RuleCall)cAdditionalPropertiesAssignment.eContents().get(0);
		
		////EClass EnvOneOf0AdditionalPropertiesOneOf1
		//EnvOneOf0AdditionalPropertiesOneOf1 returns EnvOneOf0AdditionalPropertiesOneOf1:
		//            additionalProperties=EDoubleObject
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//additionalProperties=EDoubleObject
		public Assignment getAdditionalPropertiesAssignment() { return cAdditionalPropertiesAssignment; }
		
		//EDoubleObject
		public RuleCall getAdditionalPropertiesEDoubleObjectParserRuleCall_0() { return cAdditionalPropertiesEDoubleObjectParserRuleCall_0; }
	}
	public class EDoubleObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.EnvOneOf0AdditionalPropertiesOneOf1.EDoubleObject");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cE_INTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cE_DOUBLETerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EDoubleObject returns ecore::EDoubleObject:
		//    E_INT | E_DOUBLE;
		@Override public ParserRule getRule() { return rule; }
		
		//E_INT | E_DOUBLE
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//E_INT
		public RuleCall getE_INTTerminalRuleCall_0() { return cE_INTTerminalRuleCall_0; }
		
		//E_DOUBLE
		public RuleCall getE_DOUBLETerminalRuleCall_1() { return cE_DOUBLETerminalRuleCall_1; }
	}
	public class VALID_STRINGElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.EnvOneOf0AdditionalPropertiesOneOf1.VALID_STRING");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//VALID_STRING: STRING  ;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final EnvOneOf0AdditionalPropertiesOneOf1Elements pEnvOneOf0AdditionalPropertiesOneOf1;
	private final EDoubleObjectElements pEDoubleObject;
	private final TerminalRule tINT;
	private final VALID_STRINGElements pVALID_STRING;
	private final TerminalRule tSTRING;
	private final TerminalRule tE_INT;
	private final TerminalRule tE_DOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EnvOneOf0AdditionalPropertiesOneOf1GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEnvOneOf0AdditionalPropertiesOneOf1 = new EnvOneOf0AdditionalPropertiesOneOf1Elements();
		this.pEDoubleObject = new EDoubleObjectElements();
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.EnvOneOf0AdditionalPropertiesOneOf1.INT");
		this.pVALID_STRING = new VALID_STRINGElements();
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.EnvOneOf0AdditionalPropertiesOneOf1.STRING");
		this.tE_INT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.EnvOneOf0AdditionalPropertiesOneOf1.E_INT");
		this.tE_DOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.EnvOneOf0AdditionalPropertiesOneOf1.E_DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("githubwf.githubwf.EnvOneOf0AdditionalPropertiesOneOf1".equals(grammar.getName())) {
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

	
	////EClass EnvOneOf0AdditionalPropertiesOneOf1
	//EnvOneOf0AdditionalPropertiesOneOf1 returns EnvOneOf0AdditionalPropertiesOneOf1:
	//            additionalProperties=EDoubleObject
	//    ;
	public EnvOneOf0AdditionalPropertiesOneOf1Elements getEnvOneOf0AdditionalPropertiesOneOf1Access() {
		return pEnvOneOf0AdditionalPropertiesOneOf1;
	}
	
	public ParserRule getEnvOneOf0AdditionalPropertiesOneOf1Rule() {
		return getEnvOneOf0AdditionalPropertiesOneOf1Access().getRule();
	}
	
	//EDoubleObject returns ecore::EDoubleObject:
	//    E_INT | E_DOUBLE;
	public EDoubleObjectElements getEDoubleObjectAccess() {
		return pEDoubleObject;
	}
	
	public ParserRule getEDoubleObjectRule() {
		return getEDoubleObjectAccess().getRule();
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
	
	//VALID_STRING: STRING  ;
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
