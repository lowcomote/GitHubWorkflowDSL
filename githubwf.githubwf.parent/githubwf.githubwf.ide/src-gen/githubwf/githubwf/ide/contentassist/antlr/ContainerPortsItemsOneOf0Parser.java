/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalContainerPortsItemsOneOf0Parser;
import githubwf.githubwf.services.ContainerPortsItemsOneOf0GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ContainerPortsItemsOneOf0Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ContainerPortsItemsOneOf0GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ContainerPortsItemsOneOf0GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEDoubleObjectAccess().getAlternatives(), "rule__EDoubleObject__Alternatives");
			builder.put(grammarAccess.getContainerPortsItemsOneOf0Access().getItemsAssignment(), "rule__ContainerPortsItemsOneOf0__ItemsAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ContainerPortsItemsOneOf0GrammarAccess grammarAccess;

	@Override
	protected InternalContainerPortsItemsOneOf0Parser createParser() {
		InternalContainerPortsItemsOneOf0Parser result = new InternalContainerPortsItemsOneOf0Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ContainerPortsItemsOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ContainerPortsItemsOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
