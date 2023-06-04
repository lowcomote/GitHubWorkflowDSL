/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalRefOneOf0Parser;
import githubwf.githubwf.services.RefOneOf0GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class RefOneOf0Parser extends AbstractAntlrParser {

	@Inject
	private RefOneOf0GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRefOneOf0Parser createParser(XtextTokenStream stream) {
		return new InternalRefOneOf0Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RefOneOf0";
	}

	public RefOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RefOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
