/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalConcurrencyCancel_45in_45progressOneOf1Parser;
import githubwf.githubwf.services.ConcurrencyCancel_45in_45progressOneOf1GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ConcurrencyCancel_45in_45progressOneOf1Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ConcurrencyCancel_45in_45progressOneOf1GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ConcurrencyCancel_45in_45progressOneOf1GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getConcurrencyCancel_45in_45progressOneOf1Access().getGroup(), "rule__ConcurrencyCancel_45in_45progressOneOf1__Group__0");
			builder.put(grammarAccess.getConcurrencyCancel_45in_45progressOneOf1Access().getCancel_45in_45progressAssignment_2(), "rule__ConcurrencyCancel_45in_45progressOneOf1__Cancel_45in_45progressAssignment_2");
			builder.put(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxAssignment(), "rule__ExpressionSyntax__ExpressionSyntaxAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ConcurrencyCancel_45in_45progressOneOf1GrammarAccess grammarAccess;

	@Override
	protected InternalConcurrencyCancel_45in_45progressOneOf1Parser createParser() {
		InternalConcurrencyCancel_45in_45progressOneOf1Parser result = new InternalConcurrencyCancel_45in_45progressOneOf1Parser(null);
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

	public ConcurrencyCancel_45in_45progressOneOf1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ConcurrencyCancel_45in_45progressOneOf1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
