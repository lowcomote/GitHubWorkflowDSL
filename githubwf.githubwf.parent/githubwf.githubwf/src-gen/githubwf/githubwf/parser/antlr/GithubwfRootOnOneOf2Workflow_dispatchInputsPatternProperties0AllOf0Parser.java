/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Parser;
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Parser extends AbstractAntlrParser {

	@Inject
	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Parser createParser(XtextTokenStream stream) {
		return new InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0";
	}

	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
