/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalConfigurationOneOf3Parser;
import githubwf.githubwf.services.ConfigurationOneOf3GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ConfigurationOneOf3Parser extends AbstractAntlrParser {

	@Inject
	private ConfigurationOneOf3GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalConfigurationOneOf3Parser createParser(XtextTokenStream stream) {
		return new InternalConfigurationOneOf3Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ConfigurationOneOf3";
	}

	public ConfigurationOneOf3GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ConfigurationOneOf3GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
