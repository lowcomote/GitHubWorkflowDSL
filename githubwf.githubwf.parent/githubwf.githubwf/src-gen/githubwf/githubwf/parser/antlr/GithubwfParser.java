/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalGithubwfParser;
import githubwf.githubwf.services.GithubwfGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GithubwfParser extends AbstractAntlrParser {

	@Inject
	private GithubwfGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGithubwfParser createParser(XtextTokenStream stream) {
		return new InternalGithubwfParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GithubwfRoot";
	}

	public GithubwfGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GithubwfGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
