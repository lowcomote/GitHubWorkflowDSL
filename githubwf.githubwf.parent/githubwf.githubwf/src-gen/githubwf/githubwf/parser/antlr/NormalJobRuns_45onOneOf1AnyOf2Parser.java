/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalNormalJobRuns_45onOneOf1AnyOf2Parser;
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1AnyOf2GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class NormalJobRuns_45onOneOf1AnyOf2Parser extends AbstractAntlrParser {

	@Inject
	private NormalJobRuns_45onOneOf1AnyOf2GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalNormalJobRuns_45onOneOf1AnyOf2Parser createParser(XtextTokenStream stream) {
		return new InternalNormalJobRuns_45onOneOf1AnyOf2Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "NormalJobRuns_45onOneOf1AnyOf2";
	}

	public NormalJobRuns_45onOneOf1AnyOf2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NormalJobRuns_45onOneOf1AnyOf2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
