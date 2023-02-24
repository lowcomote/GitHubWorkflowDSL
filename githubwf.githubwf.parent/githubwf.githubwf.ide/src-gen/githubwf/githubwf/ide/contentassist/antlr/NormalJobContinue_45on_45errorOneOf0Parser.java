/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalNormalJobContinue_45on_45errorOneOf0Parser;
import githubwf.githubwf.services.NormalJobContinue_45on_45errorOneOf0GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class NormalJobContinue_45on_45errorOneOf0Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(NormalJobContinue_45on_45errorOneOf0GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, NormalJobContinue_45on_45errorOneOf0GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getNormalJobContinue_45on_45errorOneOf0Access().getGroup(), "rule__NormalJobContinue_45on_45errorOneOf0__Group__0");
			builder.put(grammarAccess.getNormalJobContinue_45on_45errorOneOf0Access().getContinue_45on_45errorAssignment_2(), "rule__NormalJobContinue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private NormalJobContinue_45on_45errorOneOf0GrammarAccess grammarAccess;

	@Override
	protected InternalNormalJobContinue_45on_45errorOneOf0Parser createParser() {
		InternalNormalJobContinue_45on_45errorOneOf0Parser result = new InternalNormalJobContinue_45on_45errorOneOf0Parser(null);
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

	public NormalJobContinue_45on_45errorOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NormalJobContinue_45on_45errorOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
