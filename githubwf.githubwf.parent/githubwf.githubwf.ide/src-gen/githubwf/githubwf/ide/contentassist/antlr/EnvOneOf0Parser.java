/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalEnvOneOf0Parser;
import githubwf.githubwf.services.EnvOneOf0GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class EnvOneOf0Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EnvOneOf0GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EnvOneOf0GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getAlternatives(), "rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getEDoubleObjectAccess().getAlternatives(), "rule__EDoubleObject__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives(), "rule__EDouble__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEnvOneOf0Access().getGroup(), "rule__EnvOneOf0__Group__0");
			builder.put(grammarAccess.getEnvOneOf0Access().getGroup_2(), "rule__EnvOneOf0__Group_2__0");
			builder.put(grammarAccess.getEnvOneOf0Access().getGroup_2_1(), "rule__EnvOneOf0__Group_2_1__0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getGroup(), "rule__EnvOneOf0AdditionalProperties__Group__0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getGroup(), "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getGroup_2(), "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getGroup_2_1(), "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getGroup(), "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getGroup_2(), "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getGroup_2_1(), "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getGroup(), "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2_1(), "rule__ArrayValue__Group_2_1__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup(), "rule__ObjectValue__Group__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2(), "rule__ObjectValue__Group_2__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2_1(), "rule__ObjectValue__Group_2_1__0");
			builder.put(grammarAccess.getKeyValuePairAccess().getGroup(), "rule__KeyValuePair__Group__0");
			builder.put(grammarAccess.getEnvOneOf0Access().getEnvAssignment_2_0(), "rule__EnvOneOf0__EnvAssignment_2_0");
			builder.put(grammarAccess.getEnvOneOf0Access().getEnvAssignment_2_1_1(), "rule__EnvOneOf0__EnvAssignment_2_1_1");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getKeyAssignment_0(), "rule__EnvOneOf0AdditionalProperties__KeyAssignment_0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2(), "rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringAccess().getAdditionalPropertiesAssignment(), "rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerAccess().getAdditionalPropertiesAssignment(), "rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberAccess().getAdditionalPropertiesAssignment(), "rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanAccess().getAdditionalPropertiesAssignment(), "rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesAssignment_2_0(), "rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesAssignment_2_1_1(), "rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesAssignment_2_0(), "rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesAssignment_2_1_1(), "rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullAccess().getAdditionalPropertiesAssignment(), "rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getKeyAssignment_0(), "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0");
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2(), "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2");
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
			builder.put(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsAccess().getItemsAssignment(), "rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EnvOneOf0GrammarAccess grammarAccess;

	@Override
	protected InternalEnvOneOf0Parser createParser() {
		InternalEnvOneOf0Parser result = new InternalEnvOneOf0Parser(null);
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

	public EnvOneOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EnvOneOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
