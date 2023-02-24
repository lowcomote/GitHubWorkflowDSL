/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalNormalJobContainerOneOf1Parser;
import githubwf.githubwf.services.NormalJobContainerOneOf1GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class NormalJobContainerOneOf1Parser extends AbstractAntlrParser {

	@Inject
	private NormalJobContainerOneOf1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalNormalJobContainerOneOf1Parser createParser(XtextTokenStream stream) {
		return new InternalNormalJobContainerOneOf1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "NormalJobContainerOneOf1";
	}

	public NormalJobContainerOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NormalJobContainerOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
