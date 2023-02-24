/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser;
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getAlternatives(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractAccess().getAlternatives(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getEDoubleObjectAccess().getAlternatives(), "rule__EDoubleObject__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives(), "rule__EDouble__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGroup(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGroup_2(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGroup_2_1(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGroup(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGroup_2(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGroup_2_1(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getGroup(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getGroup(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2_1(), "rule__ArrayValue__Group_2_1__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup(), "rule__ObjectValue__Group__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2(), "rule__ObjectValue__Group_2__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2_1(), "rule__ObjectValue__Group_2_1__0");
			builder.put(grammarAccess.getKeyValuePairAccess().getGroup(), "rule__KeyValuePair__Group__0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getPatternProperties0Assignment_2_0(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getPatternProperties0Assignment_2_1_1(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getPatternProperties0Assignment_2_0(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getPatternProperties0Assignment_2_1_1(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullAccess().getPatternProperties0Assignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getDefault_Assignment_2(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getKeyAssignment_0(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0");
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2");
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
			builder.put(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsAccess().getItemsAssignment(), "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseGrammarAccess grammarAccess;

	@Override
	protected InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser createParser() {
		InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser result = new InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser(null);
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

	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}