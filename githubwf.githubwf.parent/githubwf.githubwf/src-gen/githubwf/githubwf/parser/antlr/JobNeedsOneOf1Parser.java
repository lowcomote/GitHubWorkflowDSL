/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalJobNeedsOneOf1Parser;
import githubwf.githubwf.services.JobNeedsOneOf1GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class JobNeedsOneOf1Parser extends AbstractAntlrParser {

	@Inject
	private JobNeedsOneOf1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalJobNeedsOneOf1Parser createParser(XtextTokenStream stream) {
		return new InternalJobNeedsOneOf1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "JobNeedsOneOf1";
	}

	public JobNeedsOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JobNeedsOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
