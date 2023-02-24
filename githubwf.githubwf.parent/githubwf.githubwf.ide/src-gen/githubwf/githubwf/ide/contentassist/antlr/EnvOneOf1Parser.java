/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalEnvOneOf1Parser;
import githubwf.githubwf.services.EnvOneOf1GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class EnvOneOf1Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EnvOneOf1GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EnvOneOf1GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEnvOneOf1Access().getEnvAssignment(), "rule__EnvOneOf1__EnvAssignment");
			builder.put(grammarAccess.getStringContainingExpressionSyntaxAccess().getStringContainingExpressionSyntaxAssignment(), "rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EnvOneOf1GrammarAccess grammarAccess;

	@Override
	protected InternalEnvOneOf1Parser createParser() {
		InternalEnvOneOf1Parser result = new InternalEnvOneOf1Parser(null);
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

	public EnvOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EnvOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
