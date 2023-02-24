/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalGithubwfRootOnOneOf1Parser;
import githubwf.githubwf.services.GithubwfRootOnOneOf1GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GithubwfRootOnOneOf1Parser extends AbstractAntlrParser {

	@Inject
	private GithubwfRootOnOneOf1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGithubwfRootOnOneOf1Parser createParser(XtextTokenStream stream) {
		return new InternalGithubwfRootOnOneOf1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GithubwfRootOnOneOf1";
	}

	public GithubwfRootOnOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GithubwfRootOnOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
