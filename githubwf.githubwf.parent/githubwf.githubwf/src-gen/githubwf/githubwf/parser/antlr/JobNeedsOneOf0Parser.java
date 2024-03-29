/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalJobNeedsOneOf0Parser;
import githubwf.githubwf.services.JobNeedsOneOf0GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class JobNeedsOneOf0Parser extends AbstractAntlrParser {

	@Inject
	private JobNeedsOneOf0GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalJobNeedsOneOf0Parser createParser(XtextTokenStream stream) {
		return new InternalJobNeedsOneOf0Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "JobNeedsOneOf0";
	}

	public JobNeedsOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JobNeedsOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
