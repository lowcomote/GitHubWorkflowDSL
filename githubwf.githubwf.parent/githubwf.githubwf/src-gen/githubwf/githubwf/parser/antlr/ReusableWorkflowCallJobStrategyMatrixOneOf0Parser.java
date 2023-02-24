/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser;
import githubwf.githubwf.services.ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ReusableWorkflowCallJobStrategyMatrixOneOf0Parser extends AbstractAntlrParser {

	@Inject
	private ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser createParser(XtextTokenStream stream) {
		return new InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ReusableWorkflowCallJobStrategyMatrixOneOf0";
	}

	public ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}