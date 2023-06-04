/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalNormalJobConcurrencyOneOf0Parser;
import githubwf.githubwf.services.NormalJobConcurrencyOneOf0GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class NormalJobConcurrencyOneOf0Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(NormalJobConcurrencyOneOf0GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, NormalJobConcurrencyOneOf0GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getNormalJobConcurrencyOneOf0Access().getGroup(), "rule__NormalJobConcurrencyOneOf0__Group__0");
			builder.put(grammarAccess.getNormalJobConcurrencyOneOf0Access().getConcurrencyAssignment_2(), "rule__NormalJobConcurrencyOneOf0__ConcurrencyAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private NormalJobConcurrencyOneOf0GrammarAccess grammarAccess;

	@Override
	protected InternalNormalJobConcurrencyOneOf0Parser createParser() {
		InternalNormalJobConcurrencyOneOf0Parser result = new InternalNormalJobConcurrencyOneOf0Parser(null);
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

	public NormalJobConcurrencyOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NormalJobConcurrencyOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
