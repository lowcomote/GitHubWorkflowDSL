/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalEnvOneOf0AdditionalPropertiesOneOf0Parser;
import githubwf.githubwf.services.EnvOneOf0AdditionalPropertiesOneOf0GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EnvOneOf0AdditionalPropertiesOneOf0Parser extends AbstractAntlrParser {

	@Inject
	private EnvOneOf0AdditionalPropertiesOneOf0GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEnvOneOf0AdditionalPropertiesOneOf0Parser createParser(XtextTokenStream stream) {
		return new InternalEnvOneOf0AdditionalPropertiesOneOf0Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "EnvOneOf0AdditionalPropertiesOneOf0";
	}

	public EnvOneOf0AdditionalPropertiesOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EnvOneOf0AdditionalPropertiesOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
