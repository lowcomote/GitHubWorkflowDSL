/*
 * generated by Xtext 2.23.0
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
public class NormalJobContinue_45on_45errorOneOf0GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class NormalJobContinue_45on_45errorOneOf0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobContinue_45on_45errorOneOf0.NormalJobContinue_45on_45errorOneOf0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContinueOnErrorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContinue_45on_45errorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContinue_45on_45errorEBooleanObjectParserRuleCall_2_0 = (RuleCall)cContinue_45on_45errorAssignment_2.eContents().get(0);
		
		////EClass NormalJobContinue_45on_45errorOneOf0
		//NormalJobContinue_45on_45errorOneOf0: //Keywords
		//	'"continue-on-error"' ':' continue_45on_45error=EBooleanObject;
		@Override public ParserRule getRule() { return rule; }
		
		////Keywords
		//'"continue-on-error"' ':' continue_45on_45error=EBooleanObject
		public Group getGroup() { return cGroup; }
		
		////Keywords
		//'"continue-on-error"'
		public Keyword getContinueOnErrorKeyword_0() { return cContinueOnErrorKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//continue_45on_45error=EBooleanObject
		public Assignment getContinue_45on_45errorAssignment_2() { return cContinue_45on_45errorAssignment_2; }
		
		//EBooleanObject
		public RuleCall getContinue_45on_45errorEBooleanObjectParserRuleCall_2_0() { return cContinue_45on_45errorEBooleanObjectParserRuleCall_2_0; }
	}
	public class EBooleanObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobContinue_45on_45errorOneOf0.EBooleanObject");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBooleanObject ecore::EBooleanObject:
		//	'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class VALID_STRINGElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobContinue_45on_45errorOneOf0.VALID_STRING");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cKEYWORDParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//VALID_STRING:
		//	STRING | KEYWORD;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//KEYWORD
		public RuleCall getKEYWORDParserRuleCall_1() { return cKEYWORDParserRuleCall_1; }
	}
	public class KEYWORDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobContinue_45on_45errorOneOf0.KEYWORD");
		private final Keyword cContinueOnErrorKeyword = (Keyword)rule.eContents().get(1);
		
		//KEYWORD:
		//	'"continue-on-error"';
		@Override public ParserRule getRule() { return rule; }
		
		//'"continue-on-error"'
		public Keyword getContinueOnErrorKeyword() { return cContinueOnErrorKeyword; }
	}
	
	
	private final NormalJobContinue_45on_45errorOneOf0Elements pNormalJobContinue_45on_45errorOneOf0;
	private final EBooleanObjectElements pEBooleanObject;
	private final TerminalRule tINT;
	private final VALID_STRINGElements pVALID_STRING;
	private final TerminalRule tSTRING;
	private final TerminalRule tE_INT;
	private final KEYWORDElements pKEYWORD;
	private final TerminalRule tE_DOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public NormalJobContinue_45on_45errorOneOf0GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pNormalJobContinue_45on_45errorOneOf0 = new NormalJobContinue_45on_45errorOneOf0Elements();
		this.pEBooleanObject = new EBooleanObjectElements();
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobContinue_45on_45errorOneOf0.INT");
		this.pVALID_STRING = new VALID_STRINGElements();
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobContinue_45on_45errorOneOf0.STRING");
		this.tE_INT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobContinue_45on_45errorOneOf0.E_INT");
		this.pKEYWORD = new KEYWORDElements();
		this.tE_DOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "githubwf.githubwf.NormalJobContinue_45on_45errorOneOf0.E_DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("githubwf.githubwf.NormalJobContinue_45on_45errorOneOf0".equals(grammar.getName())) {
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

	
	////EClass NormalJobContinue_45on_45errorOneOf0
	//NormalJobContinue_45on_45errorOneOf0: //Keywords
	//	'"continue-on-error"' ':' continue_45on_45error=EBooleanObject;
	public NormalJobContinue_45on_45errorOneOf0Elements getNormalJobContinue_45on_45errorOneOf0Access() {
		return pNormalJobContinue_45on_45errorOneOf0;
	}
	
	public ParserRule getNormalJobContinue_45on_45errorOneOf0Rule() {
		return getNormalJobContinue_45on_45errorOneOf0Access().getRule();
	}
	
	//EBooleanObject ecore::EBooleanObject:
	//	'true' | 'false';
	public EBooleanObjectElements getEBooleanObjectAccess() {
		return pEBooleanObject;
	}
	
	public ParserRule getEBooleanObjectRule() {
		return getEBooleanObjectAccess().getRule();
	}
	
	//@Override
	//terminal INT returns ecore::EInt:
	//	'0' | '1'..'9' '0'..'9'*;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//VALID_STRING:
	//	STRING | KEYWORD;
	public VALID_STRINGElements getVALID_STRINGAccess() {
		return pVALID_STRING;
	}
	
	public ParserRule getVALID_STRINGRule() {
		return getVALID_STRINGAccess().getRule();
	}
	
	//@Override
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"';
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal E_INT:
	//	'-'? INT;
	public TerminalRule getE_INTRule() {
		return tE_INT;
	}
	
	//KEYWORD:
	//	'"continue-on-error"';
	public KEYWORDElements getKEYWORDAccess() {
		return pKEYWORD;
	}
	
	public ParserRule getKEYWORDRule() {
		return getKEYWORDAccess().getRule();
	}
	
	//terminal E_DOUBLE:
	//	'-'? INT ('.' INT+)? (('E' | 'e') ('+' | '-')? INT)?;
	public TerminalRule getE_DOUBLERule() {
		return tE_DOUBLE;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
