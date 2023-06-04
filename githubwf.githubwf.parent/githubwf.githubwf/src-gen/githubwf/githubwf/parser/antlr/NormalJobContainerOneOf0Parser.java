/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalNormalJobContainerOneOf0Parser;
import githubwf.githubwf.services.NormalJobContainerOneOf0GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class NormalJobContainerOneOf0Parser extends AbstractAntlrParser {

	@Inject
	private NormalJobContainerOneOf0GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalNormalJobContainerOneOf0Parser createParser(XtextTokenStream stream) {
		return new InternalNormalJobContainerOneOf0Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "NormalJobContainerOneOf0";
	}

	public NormalJobContainerOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NormalJobContainerOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
