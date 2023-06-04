/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalNormalJobStrategyMatrixOneOf1Parser;
import githubwf.githubwf.services.NormalJobStrategyMatrixOneOf1GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class NormalJobStrategyMatrixOneOf1Parser extends AbstractAntlrParser {

	@Inject
	private NormalJobStrategyMatrixOneOf1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalNormalJobStrategyMatrixOneOf1Parser createParser(XtextTokenStream stream) {
		return new InternalNormalJobStrategyMatrixOneOf1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "NormalJobStrategyMatrixOneOf1";
	}

	public NormalJobStrategyMatrixOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NormalJobStrategyMatrixOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
