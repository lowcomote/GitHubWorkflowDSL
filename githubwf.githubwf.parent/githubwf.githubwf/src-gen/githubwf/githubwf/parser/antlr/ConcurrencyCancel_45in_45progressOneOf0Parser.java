/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalConcurrencyCancel_45in_45progressOneOf0Parser;
import githubwf.githubwf.services.ConcurrencyCancel_45in_45progressOneOf0GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ConcurrencyCancel_45in_45progressOneOf0Parser extends AbstractAntlrParser {

	@Inject
	private ConcurrencyCancel_45in_45progressOneOf0GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalConcurrencyCancel_45in_45progressOneOf0Parser createParser(XtextTokenStream stream) {
		return new InternalConcurrencyCancel_45in_45progressOneOf0Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ConcurrencyCancel_45in_45progressOneOf0";
	}

	public ConcurrencyCancel_45in_45progressOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ConcurrencyCancel_45in_45progressOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
