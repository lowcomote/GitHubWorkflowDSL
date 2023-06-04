/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Parser;
import githubwf.githubwf.services.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getGroup(), "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Group__0");
			builder.put(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Access().getContinue_45on_45errorAssignment_2(), "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1__Continue_45on_45errorAssignment_2");
			builder.put(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxAssignment(), "rule__ExpressionSyntax__ExpressionSyntaxAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess grammarAccess;

	@Override
	protected InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Parser createParser() {
		InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Parser result = new InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Parser(null);
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

	public NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
