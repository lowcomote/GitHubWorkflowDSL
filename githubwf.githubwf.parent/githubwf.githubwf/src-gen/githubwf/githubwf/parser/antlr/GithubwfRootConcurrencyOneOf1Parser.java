/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalGithubwfRootConcurrencyOneOf1Parser;
import githubwf.githubwf.services.GithubwfRootConcurrencyOneOf1GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GithubwfRootConcurrencyOneOf1Parser extends AbstractAntlrParser {

	@Inject
	private GithubwfRootConcurrencyOneOf1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGithubwfRootConcurrencyOneOf1Parser createParser(XtextTokenStream stream) {
		return new InternalGithubwfRootConcurrencyOneOf1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GithubwfRootConcurrencyOneOf1";
	}

	public GithubwfRootConcurrencyOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GithubwfRootConcurrencyOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
