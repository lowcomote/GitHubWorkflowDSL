/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalJobNeedsOneOf0Parser;
import githubwf.githubwf.services.JobNeedsOneOf0GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class JobNeedsOneOf0Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(JobNeedsOneOf0GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, JobNeedsOneOf0GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getJobNeedsOneOf0Access().getGroup(), "rule__JobNeedsOneOf0__Group__0");
			builder.put(grammarAccess.getJobNeedsOneOf0Access().getGroup_2(), "rule__JobNeedsOneOf0__Group_2__0");
			builder.put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
			builder.put(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsAssignment_1(), "rule__JobNeedsOneOf0__JobNeedsAssignment_1");
			builder.put(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsAssignment_2_1(), "rule__JobNeedsOneOf0__JobNeedsAssignment_2_1");
			builder.put(grammarAccess.getJobNeedsOneOf0ItemsAccess().getItemsAssignment(), "rule__JobNeedsOneOf0Items__ItemsAssignment");
			builder.put(grammarAccess.getNameAccess().getNameAssignment_1(), "rule__Name__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private JobNeedsOneOf0GrammarAccess grammarAccess;

	@Override
	protected InternalJobNeedsOneOf0Parser createParser() {
		InternalJobNeedsOneOf0Parser result = new InternalJobNeedsOneOf0Parser(null);
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

	public JobNeedsOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JobNeedsOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
