/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser;
import githubwf.githubwf.services.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser extends AbstractAntlrParser {

	@Inject
	private ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser createParser(XtextTokenStream stream) {
		return new InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1";
	}

	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
