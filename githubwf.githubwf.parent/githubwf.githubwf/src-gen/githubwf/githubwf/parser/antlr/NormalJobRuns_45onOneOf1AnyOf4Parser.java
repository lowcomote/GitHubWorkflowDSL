/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalNormalJobRuns_45onOneOf1AnyOf4Parser;
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1AnyOf4GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class NormalJobRuns_45onOneOf1AnyOf4Parser extends AbstractAntlrParser {

	@Inject
	private NormalJobRuns_45onOneOf1AnyOf4GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalNormalJobRuns_45onOneOf1AnyOf4Parser createParser(XtextTokenStream stream) {
		return new InternalNormalJobRuns_45onOneOf1AnyOf4Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "NormalJobRuns_45onOneOf1AnyOf4";
	}

	public NormalJobRuns_45onOneOf1AnyOf4GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NormalJobRuns_45onOneOf1AnyOf4GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}