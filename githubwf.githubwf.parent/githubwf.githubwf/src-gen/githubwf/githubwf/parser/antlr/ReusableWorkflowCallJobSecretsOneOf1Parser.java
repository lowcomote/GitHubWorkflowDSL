/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalReusableWorkflowCallJobSecretsOneOf1Parser;
import githubwf.githubwf.services.ReusableWorkflowCallJobSecretsOneOf1GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ReusableWorkflowCallJobSecretsOneOf1Parser extends AbstractAntlrParser {

	@Inject
	private ReusableWorkflowCallJobSecretsOneOf1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalReusableWorkflowCallJobSecretsOneOf1Parser createParser(XtextTokenStream stream) {
		return new InternalReusableWorkflowCallJobSecretsOneOf1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ReusableWorkflowCallJobSecretsOneOf1";
	}

	public ReusableWorkflowCallJobSecretsOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ReusableWorkflowCallJobSecretsOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
