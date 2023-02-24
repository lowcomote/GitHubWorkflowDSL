/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalReusableWorkflowCallJobStrategyMatrixOneOf1Parser;
import githubwf.githubwf.services.ReusableWorkflowCallJobStrategyMatrixOneOf1GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ReusableWorkflowCallJobStrategyMatrixOneOf1Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ReusableWorkflowCallJobStrategyMatrixOneOf1GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ReusableWorkflowCallJobStrategyMatrixOneOf1GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf1Access().getGroup(), "rule__ReusableWorkflowCallJobStrategyMatrixOneOf1__Group__0");
			builder.put(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf1Access().getMatrixAssignment_2(), "rule__ReusableWorkflowCallJobStrategyMatrixOneOf1__MatrixAssignment_2");
			builder.put(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxAssignment(), "rule__ExpressionSyntax__ExpressionSyntaxAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ReusableWorkflowCallJobStrategyMatrixOneOf1GrammarAccess grammarAccess;

	@Override
	protected InternalReusableWorkflowCallJobStrategyMatrixOneOf1Parser createParser() {
		InternalReusableWorkflowCallJobStrategyMatrixOneOf1Parser result = new InternalReusableWorkflowCallJobStrategyMatrixOneOf1Parser(null);
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

	public ReusableWorkflowCallJobStrategyMatrixOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ReusableWorkflowCallJobStrategyMatrixOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}