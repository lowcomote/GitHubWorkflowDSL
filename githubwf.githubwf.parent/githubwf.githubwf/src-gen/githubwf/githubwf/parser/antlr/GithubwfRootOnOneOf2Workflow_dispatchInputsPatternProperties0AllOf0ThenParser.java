/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser;
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser extends AbstractAntlrParser {

	@Inject
	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser createParser(XtextTokenStream stream) {
		return new InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then";
	}

	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
