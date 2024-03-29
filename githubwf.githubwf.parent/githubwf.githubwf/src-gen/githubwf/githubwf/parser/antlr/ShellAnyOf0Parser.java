/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalShellAnyOf0Parser;
import githubwf.githubwf.services.ShellAnyOf0GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ShellAnyOf0Parser extends AbstractAntlrParser {

	@Inject
	private ShellAnyOf0GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalShellAnyOf0Parser createParser(XtextTokenStream stream) {
		return new InternalShellAnyOf0Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ShellAnyOf0";
	}

	public ShellAnyOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ShellAnyOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
