/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalNormalJobRuns_45onOneOf1AnyOf3Parser;
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1AnyOf3GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class NormalJobRuns_45onOneOf1AnyOf3Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(NormalJobRuns_45onOneOf1AnyOf3GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, NormalJobRuns_45onOneOf1AnyOf3GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3AbstractAccess().getAlternatives(), "rule__NormalJobRuns_45onOneOf1AnyOf3Abstract__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getEDoubleObjectAccess().getAlternatives(), "rule__EDoubleObject__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives(), "rule__EDouble__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeStringAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeString__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeIntegerAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeInteger__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeNumberAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeNumber__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeBooleanAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeBoolean__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeObjectAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeObject__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeObjectAccess().getGroup_4(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeObject__Group_4__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeObjectAccess().getGroup_4_1(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeObject__Group_4_1__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeArrayAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeArray__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeNullAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeNull__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf3AdditionalProperties__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2_1(), "rule__ArrayValue__Group_2_1__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup(), "rule__ObjectValue__Group__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2(), "rule__ObjectValue__Group_2__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2_1(), "rule__ObjectValue__Group_2_1__0");
			builder.put(grammarAccess.getKeyValuePairAccess().getGroup(), "rule__KeyValuePair__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getGroup_1(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__Group_1__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getGroup_1_1(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__Group_1_1__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getGroup_1_1_2(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__Group_1_1_2__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getGroup_1_1_2_2(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__Group_1_1_2_2__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getGroup_1_1_2_2_2(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__Group_1_1_2_2_2__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3Access().getRuns_45onAssignment(), "rule__NormalJobRuns_45onOneOf1AnyOf3__Runs_45onAssignment");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeStringAccess().getRuns_45onAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeString__Runs_45onAssignment_2");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeIntegerAccess().getRuns_45onAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeInteger__Runs_45onAssignment_2");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeNumberAccess().getRuns_45onAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeNumber__Runs_45onAssignment_2");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeBooleanAccess().getRuns_45onAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeBoolean__Runs_45onAssignment_2");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeObjectAccess().getRuns_45onAssignment_4_0(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeObject__Runs_45onAssignment_4_0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeObjectAccess().getRuns_45onAssignment_4_1_1(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeObject__Runs_45onAssignment_4_1_1");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeArrayAccess().getRuns_45onAssignment_3(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeArray__Runs_45onAssignment_3");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TypeNullAccess().getRuns_45onAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf3TypeNull__Runs_45onAssignment_2");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesAccess().getKeyAssignment_0(), "rule__NormalJobRuns_45onOneOf1AnyOf3AdditionalProperties__KeyAssignment_0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf3AdditionalProperties__AdditionalPropertiesAssignment_2");
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
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getItems0Assignment_1_0(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__Items0Assignment_1_0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getItems1Assignment_1_1_1(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__Items1Assignment_1_1_1");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getItems2Assignment_1_1_2_1(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__Items2Assignment_1_1_2_1");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getAdditionalItemsAssignment_1_1_2_2_1(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__AdditionalItemsAssignment_1_1_2_2_1");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3TupleAccess().getAdditionalItemsAssignment_1_1_2_2_2_1(), "rule__NormalJobRuns_45onOneOf1AnyOf3Tuple__AdditionalItemsAssignment_1_1_2_2_2_1");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3Items0Access().getItems0Assignment(), "rule__NormalJobRuns_45onOneOf1AnyOf3Items0__Items0Assignment");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3Items1Access().getItems1Assignment(), "rule__NormalJobRuns_45onOneOf1AnyOf3Items1__Items1Assignment");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3Items2Access().getItems2Assignment(), "rule__NormalJobRuns_45onOneOf1AnyOf3Items2__Items2Assignment");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf3AdditionalItemsAccess().getAdditionalItemsAssignment(), "rule__NormalJobRuns_45onOneOf1AnyOf3AdditionalItems__AdditionalItemsAssignment");
			builder.put(grammarAccess.getMachineAccess().getMachineAssignment(), "rule__Machine__MachineAssignment");
			builder.put(grammarAccess.getArchitectureAccess().getArchitectureAssignment(), "rule__Architecture__ArchitectureAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private NormalJobRuns_45onOneOf1AnyOf3GrammarAccess grammarAccess;

	@Override
	protected InternalNormalJobRuns_45onOneOf1AnyOf3Parser createParser() {
		InternalNormalJobRuns_45onOneOf1AnyOf3Parser result = new InternalNormalJobRuns_45onOneOf1AnyOf3Parser(null);
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

	public NormalJobRuns_45onOneOf1AnyOf3GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NormalJobRuns_45onOneOf1AnyOf3GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
