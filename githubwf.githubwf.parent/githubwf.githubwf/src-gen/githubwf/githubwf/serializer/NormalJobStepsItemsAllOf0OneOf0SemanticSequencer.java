/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.GithubwfPackage;
import githubwf.NormalJobStepsItemsAllOf0OneOf0;
import githubwf.NormalJobStepsItemsAllOf0OneOf0AdditionalProperties;
import githubwf.NormalJobStepsItemsAllOf0OneOf0Uses;
import githubwf.githubwf.services.NormalJobStepsItemsAllOf0OneOf0GrammarAccess;
import java.util.Set;
import jsonMM.ArrayValue;
import jsonMM.BooleanValue;
import jsonMM.JsonDocument;
import jsonMM.JsonMMPackage;
import jsonMM.KeyValuePair;
import jsonMM.NullValue;
import jsonMM.NumberValue;
import jsonMM.ObjectValue;
import jsonMM.StringValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class NormalJobStepsItemsAllOf0OneOf0SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NormalJobStepsItemsAllOf0OneOf0GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ONE_OF0:
				sequence_NormalJobStepsItemsAllOf0OneOf0(context, (NormalJobStepsItemsAllOf0OneOf0) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ONE_OF0_ADDITIONAL_PROPERTIES:
				sequence_NormalJobStepsItemsAllOf0OneOf0AdditionalProperties(context, (NormalJobStepsItemsAllOf0OneOf0AdditionalProperties) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ONE_OF0_USES:
				sequence_NormalJobStepsItemsAllOf0OneOf0Uses(context, (NormalJobStepsItemsAllOf0OneOf0Uses) semanticObject); 
				return; 
			}
		else if (epackage == JsonMMPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JsonMMPackage.ARRAY_VALUE:
				sequence_ArrayValue(context, (ArrayValue) semanticObject); 
				return; 
			case JsonMMPackage.BOOLEAN_VALUE:
				sequence_BooleanValue(context, (BooleanValue) semanticObject); 
				return; 
			case JsonMMPackage.JSON_DOCUMENT:
				sequence_JsonDocument(context, (JsonDocument) semanticObject); 
				return; 
			case JsonMMPackage.KEY_VALUE_PAIR:
				sequence_KeyValuePair(context, (KeyValuePair) semanticObject); 
				return; 
			case JsonMMPackage.NULL_VALUE:
				sequence_NullValue(context, (NullValue) semanticObject); 
				return; 
			case JsonMMPackage.NUMBER_VALUE:
				sequence_NumberValue(context, (NumberValue) semanticObject); 
				return; 
			case JsonMMPackage.OBJECT_VALUE:
				sequence_ObjectValue(context, (ObjectValue) semanticObject); 
				return; 
			case JsonMMPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns ArrayValue
	 *     ArrayValue returns ArrayValue
	 *
	 * Constraint:
	 *     (value+=Value value+=Value*)?
	 * </pre>
	 */
	protected void sequence_ArrayValue(ISerializationContext context, ArrayValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns BooleanValue
	 *     BooleanValue returns BooleanValue
	 *
	 * Constraint:
	 *     value=EBoolean
	 * </pre>
	 */
	protected void sequence_BooleanValue(ISerializationContext context, BooleanValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMMPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMMPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     JsonDocument returns JsonDocument
	 *
	 * Constraint:
	 *     value=Value
	 * </pre>
	 */
	protected void sequence_JsonDocument(ISerializationContext context, JsonDocument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMMPackage.Literals.JSON_DOCUMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMMPackage.Literals.JSON_DOCUMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     KeyValuePair returns KeyValuePair
	 *
	 * Constraint:
	 *     (key=EString value=Value)
	 * </pre>
	 */
	protected void sequence_KeyValuePair(ISerializationContext context, KeyValuePair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMMPackage.Literals.KEY_VALUE_PAIR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMMPackage.Literals.KEY_VALUE_PAIR__KEY));
			if (transientValues.isValueTransient(semanticObject, JsonMMPackage.Literals.KEY_VALUE_PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMMPackage.Literals.KEY_VALUE_PAIR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract returns NormalJobStepsItemsAllOf0OneOf0AdditionalProperties
	 *     NormalJobStepsItemsAllOf0OneOf0AdditionalProperties returns NormalJobStepsItemsAllOf0OneOf0AdditionalProperties
	 *
	 * Constraint:
	 *     (key=EString additionalProperties=JsonDocument)
	 * </pre>
	 */
	protected void sequence_NormalJobStepsItemsAllOf0OneOf0AdditionalProperties(ISerializationContext context, NormalJobStepsItemsAllOf0OneOf0AdditionalProperties semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties_Key()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties_Key()));
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract returns NormalJobStepsItemsAllOf0OneOf0Uses
	 *     NormalJobStepsItemsAllOf0OneOf0Uses returns NormalJobStepsItemsAllOf0OneOf0Uses
	 *
	 * Constraint:
	 *     uses=EString
	 * </pre>
	 */
	protected void sequence_NormalJobStepsItemsAllOf0OneOf0Uses(ISerializationContext context, NormalJobStepsItemsAllOf0OneOf0Uses semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0OneOf0Uses_Uses()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0OneOf0Uses_Uses()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobStepsItemsAllOf0OneOf0UsesAccess().getUsesEStringParserRuleCall_2_0(), semanticObject.getUses());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobStepsItemsAllOf0OneOf0 returns NormalJobStepsItemsAllOf0OneOf0
	 *
	 * Constraint:
	 *     (items+=NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract items+=NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract*)?
	 * </pre>
	 */
	protected void sequence_NormalJobStepsItemsAllOf0OneOf0(ISerializationContext context, NormalJobStepsItemsAllOf0OneOf0 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns NullValue
	 *     NullValue returns NullValue
	 *
	 * Constraint:
	 *     value=NullEnum
	 * </pre>
	 */
	protected void sequence_NullValue(ISerializationContext context, NullValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMMPackage.Literals.NULL_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMMPackage.Literals.NULL_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns NumberValue
	 *     NumberValue returns NumberValue
	 *
	 * Constraint:
	 *     value=EDouble
	 * </pre>
	 */
	protected void sequence_NumberValue(ISerializationContext context, NumberValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMMPackage.Literals.NUMBER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMMPackage.Literals.NUMBER_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns ObjectValue
	 *     ObjectValue returns ObjectValue
	 *
	 * Constraint:
	 *     (keyvaluepair+=KeyValuePair keyvaluepair+=KeyValuePair*)?
	 * </pre>
	 */
	protected void sequence_ObjectValue(ISerializationContext context, ObjectValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     value=EString
	 * </pre>
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMMPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMMPackage.Literals.STRING_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
