/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.parser.antlr;

import com.google.inject.Inject;
import githubwf.githubwf.parser.antlr.internal.InternalContainerPortsItemsOneOf0Parser;
import githubwf.githubwf.services.ContainerPortsItemsOneOf0GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ContainerPortsItemsOneOf0Parser extends AbstractAntlrParser {

	@Inject
	private ContainerPortsItemsOneOf0GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalContainerPortsItemsOneOf0Parser createParser(XtextTokenStream stream) {
		return new InternalContainerPortsItemsOneOf0Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ContainerPortsItemsOneOf0";
	}

	public ContainerPortsItemsOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ContainerPortsItemsOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
