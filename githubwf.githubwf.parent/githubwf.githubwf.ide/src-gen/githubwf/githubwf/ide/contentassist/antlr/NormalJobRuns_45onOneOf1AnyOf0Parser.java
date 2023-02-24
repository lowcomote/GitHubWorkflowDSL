/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import githubwf.githubwf.ide.contentassist.antlr.internal.InternalNormalJobRuns_45onOneOf1AnyOf0Parser;
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1AnyOf0GrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class NormalJobRuns_45onOneOf1AnyOf0Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(NormalJobRuns_45onOneOf1AnyOf0GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, NormalJobRuns_45onOneOf1AnyOf0GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0AbstractAccess().getAlternatives(), "rule__NormalJobRuns_45onOneOf1AnyOf0Abstract__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getEDoubleObjectAccess().getAlternatives(), "rule__EDoubleObject__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives(), "rule__EDouble__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeStringAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeString__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeIntegerAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeInteger__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeNumberAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeNumber__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeBooleanAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeBoolean__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeObjectAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeObject__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeObjectAccess().getGroup_4(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeObject__Group_4__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeObjectAccess().getGroup_4_1(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeObject__Group_4_1__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeArrayAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeArray__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeNullAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeNull__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2_1(), "rule__ArrayValue__Group_2_1__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup(), "rule__ObjectValue__Group__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2(), "rule__ObjectValue__Group_2__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2_1(), "rule__ObjectValue__Group_2_1__0");
			builder.put(grammarAccess.getKeyValuePairAccess().getGroup(), "rule__KeyValuePair__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TupleAccess().getGroup(), "rule__NormalJobRuns_45onOneOf1AnyOf0Tuple__Group__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TupleAccess().getGroup_1(), "rule__NormalJobRuns_45onOneOf1AnyOf0Tuple__Group_1__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TupleAccess().getGroup_1_1(), "rule__NormalJobRuns_45onOneOf1AnyOf0Tuple__Group_1_1__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TupleAccess().getGroup_1_1_2(), "rule__NormalJobRuns_45onOneOf1AnyOf0Tuple__Group_1_1_2__0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0Access().getRuns_45onAssignment(), "rule__NormalJobRuns_45onOneOf1AnyOf0__Runs_45onAssignment");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeStringAccess().getRuns_45onAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeString__Runs_45onAssignment_2");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeIntegerAccess().getRuns_45onAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeInteger__Runs_45onAssignment_2");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeNumberAccess().getRuns_45onAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeNumber__Runs_45onAssignment_2");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeBooleanAccess().getRuns_45onAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeBoolean__Runs_45onAssignment_2");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeObjectAccess().getRuns_45onAssignment_4_0(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeObject__Runs_45onAssignment_4_0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeObjectAccess().getRuns_45onAssignment_4_1_1(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeObject__Runs_45onAssignment_4_1_1");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeArrayAccess().getRuns_45onAssignment_3(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeArray__Runs_45onAssignment_3");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeNullAccess().getRuns_45onAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf0TypeNull__Runs_45onAssignment_2");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesAccess().getKeyAssignment_0(), "rule__NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties__KeyAssignment_0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2(), "rule__NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties__AdditionalPropertiesAssignment_2");
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
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TupleAccess().getItems0Assignment_1_0(), "rule__NormalJobRuns_45onOneOf1AnyOf0Tuple__Items0Assignment_1_0");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TupleAccess().getAdditionalItemsAssignment_1_1_1(), "rule__NormalJobRuns_45onOneOf1AnyOf0Tuple__AdditionalItemsAssignment_1_1_1");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TupleAccess().getAdditionalItemsAssignment_1_1_2_1(), "rule__NormalJobRuns_45onOneOf1AnyOf0Tuple__AdditionalItemsAssignment_1_1_2_1");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0Items0Access().getItems0Assignment(), "rule__NormalJobRuns_45onOneOf1AnyOf0Items0__Items0Assignment");
			builder.put(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0AdditionalItemsAccess().getAdditionalItemsAssignment(), "rule__NormalJobRuns_45onOneOf1AnyOf0AdditionalItems__AdditionalItemsAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private NormalJobRuns_45onOneOf1AnyOf0GrammarAccess grammarAccess;

	@Override
	protected InternalNormalJobRuns_45onOneOf1AnyOf0Parser createParser() {
		InternalNormalJobRuns_45onOneOf1AnyOf0Parser result = new InternalNormalJobRuns_45onOneOf1AnyOf0Parser(null);
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

	public NormalJobRuns_45onOneOf1AnyOf0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NormalJobRuns_45onOneOf1AnyOf0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
