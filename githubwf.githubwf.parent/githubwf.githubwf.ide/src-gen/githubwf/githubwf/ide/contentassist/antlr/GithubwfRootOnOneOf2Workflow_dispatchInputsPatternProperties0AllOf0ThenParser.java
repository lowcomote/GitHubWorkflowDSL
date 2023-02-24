/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser;
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractAccess().getAlternatives(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract__Alternatives");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractAccess().getAlternatives(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getEDoubleObjectAccess().getAlternatives(), "rule__EDoubleObject__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives(), "rule__EDouble__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getGroup(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject__Group__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getGroup_2(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject__Group_2__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getGroup_2_1(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject__Group_2_1__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getGroup(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray__Group__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getGroup_2(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray__Group_2__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getGroup_2_1(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray__Group_2_1__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultAccess().getGroup(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault__Group__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesAccess().getGroup(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2_1(), "rule__ArrayValue__Group_2_1__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup(), "rule__ObjectValue__Group__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2(), "rule__ObjectValue__Group_2__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2_1(), "rule__ObjectValue__Group_2_1__0");
			builder.put(grammarAccess.getKeyValuePairAccess().getGroup(), "rule__KeyValuePair__Group__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getPatternProperties0Assignment_2_0(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject__PatternProperties0Assignment_2_0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getPatternProperties0Assignment_2_1_1(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject__PatternProperties0Assignment_2_1_1");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getPatternProperties0Assignment_2_0(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray__PatternProperties0Assignment_2_0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getPatternProperties0Assignment_2_1_1(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray__PatternProperties0Assignment_2_1_1");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultAccess().getDefault_Assignment_2(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault__Default_Assignment_2");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesAccess().getKeyAssignment_0(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties__KeyAssignment_0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties__AdditionalPropertiesAssignment_2");
			builder.put(grammarAccess.getJsonDocumentAccess().getValueAssignment(), "rule__JsonDocument__ValueAssignment");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
			builder.put(grammarAccess.getArrayValueAccess().getValueAssignment_2_0(), "rule__ArrayValue__ValueAssignment_2_0");
			builder.put(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1(), "rule__ArrayValue__ValueAssignment_2_1_1");
			builder.put(grammarAccess.getNullValueAccess().getValueAssignment(), "rule__NullValue__ValueAssignment");
			builder.put(grammarAccess.getNumberValueAccess().getValueAssignment(), "rule__NumberValue__ValueAssignment");
			builder.put(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0(), "rule__ObjectValue__KeyvaluepairAssignment_2_0");
			builder.put(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1(), "rule__ObjectValue__KeyvaluepairAssignment_2_1_1");
			builder.put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
			builder.put(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0(), "rule__KeyValuePair__KeyAssignment_0");
			builder.put(grammarAccess.getKeyValuePairAccess().getValueAssignment_2(), "rule__KeyValuePair__ValueAssignment_2");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsAccess().getItemsAssignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems__ItemsAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess grammarAccess;

	@Override
	protected InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser createParser() {
		InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser result = new InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser(null);
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

	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
