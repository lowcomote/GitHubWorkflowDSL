/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.EnvOneOf0;
import githubwf.EnvOneOf0AdditionalProperties;
import githubwf.EnvOneOf0AdditionalPropertiesAdditionalProperties;
import githubwf.EnvOneOf0AdditionalPropertiesItems;
import githubwf.EnvOneOf0AdditionalPropertiesTypeArray;
import githubwf.EnvOneOf0AdditionalPropertiesTypeBoolean;
import githubwf.EnvOneOf0AdditionalPropertiesTypeInteger;
import githubwf.EnvOneOf0AdditionalPropertiesTypeNull;
import githubwf.EnvOneOf0AdditionalPropertiesTypeNumber;
import githubwf.EnvOneOf0AdditionalPropertiesTypeObject;
import githubwf.EnvOneOf0AdditionalPropertiesTypeString;
import githubwf.GithubwfPackage;
import githubwf.githubwf.services.EnvOneOf0GrammarAccess;
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
public class EnvOneOf0SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EnvOneOf0GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.ENV_ONE_OF0:
				sequence_EnvOneOf0(context, (EnvOneOf0) semanticObject); 
				return; 
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES:
				sequence_EnvOneOf0AdditionalProperties(context, (EnvOneOf0AdditionalProperties) semanticObject); 
				return; 
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_ADDITIONAL_PROPERTIES:
				sequence_EnvOneOf0AdditionalPropertiesAdditionalProperties(context, (EnvOneOf0AdditionalPropertiesAdditionalProperties) semanticObject); 
				return; 
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_ITEMS:
				sequence_EnvOneOf0AdditionalPropertiesItems(context, (EnvOneOf0AdditionalPropertiesItems) semanticObject); 
				return; 
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_ARRAY:
				sequence_EnvOneOf0AdditionalPropertiesTypeArray(context, (EnvOneOf0AdditionalPropertiesTypeArray) semanticObject); 
				return; 
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_BOOLEAN:
				sequence_EnvOneOf0AdditionalPropertiesTypeBoolean(context, (EnvOneOf0AdditionalPropertiesTypeBoolean) semanticObject); 
				return; 
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_INTEGER:
				sequence_EnvOneOf0AdditionalPropertiesTypeInteger(context, (EnvOneOf0AdditionalPropertiesTypeInteger) semanticObject); 
				return; 
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_NULL:
				sequence_EnvOneOf0AdditionalPropertiesTypeNull(context, (EnvOneOf0AdditionalPropertiesTypeNull) semanticObject); 
				return; 
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_NUMBER:
				sequence_EnvOneOf0AdditionalPropertiesTypeNumber(context, (EnvOneOf0AdditionalPropertiesTypeNumber) semanticObject); 
				return; 
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_OBJECT:
				sequence_EnvOneOf0AdditionalPropertiesTypeObject(context, (EnvOneOf0AdditionalPropertiesTypeObject) semanticObject); 
				return; 
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_STRING:
				sequence_EnvOneOf0AdditionalPropertiesTypeString(context, (EnvOneOf0AdditionalPropertiesTypeString) semanticObject); 
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
	 * Contexts:
	 *     Value returns ArrayValue
	 *     ArrayValue returns ArrayValue
	 *
	 * Constraint:
	 *     (value+=Value value+=Value*)?
	 */
	protected void sequence_ArrayValue(ISerializationContext context, ArrayValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns BooleanValue
	 *     BooleanValue returns BooleanValue
	 *
	 * Constraint:
	 *     value=EBoolean
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
	 * Contexts:
	 *     EnvOneOf0AdditionalPropertiesPropertiesAbstract returns EnvOneOf0AdditionalPropertiesAdditionalProperties
	 *     EnvOneOf0AdditionalPropertiesAdditionalProperties returns EnvOneOf0AdditionalPropertiesAdditionalProperties
	 *
	 * Constraint:
	 *     (key=EString additionalProperties=JsonDocument)
	 */
	protected void sequence_EnvOneOf0AdditionalPropertiesAdditionalProperties(ISerializationContext context, EnvOneOf0AdditionalPropertiesAdditionalProperties semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesAdditionalProperties_Key()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesAdditionalProperties_Key()));
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesAdditionalProperties_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesAdditionalProperties_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnvOneOf0AdditionalPropertiesItems returns EnvOneOf0AdditionalPropertiesItems
	 *
	 * Constraint:
	 *     items=JsonDocument
	 */
	protected void sequence_EnvOneOf0AdditionalPropertiesItems(ISerializationContext context, EnvOneOf0AdditionalPropertiesItems semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesItems_Items()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesItems_Items()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsAccess().getItemsJsonDocumentParserRuleCall_0(), semanticObject.getItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnvOneOf0AdditionalPropertiesAbstract returns EnvOneOf0AdditionalPropertiesTypeArray
	 *     EnvOneOf0AdditionalPropertiesTypeArray returns EnvOneOf0AdditionalPropertiesTypeArray
	 *
	 * Constraint:
	 *     (additionalProperties+=EnvOneOf0AdditionalPropertiesItems additionalProperties+=EnvOneOf0AdditionalPropertiesItems*)?
	 */
	protected void sequence_EnvOneOf0AdditionalPropertiesTypeArray(ISerializationContext context, EnvOneOf0AdditionalPropertiesTypeArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnvOneOf0AdditionalPropertiesAbstract returns EnvOneOf0AdditionalPropertiesTypeBoolean
	 *     EnvOneOf0AdditionalPropertiesTypeBoolean returns EnvOneOf0AdditionalPropertiesTypeBoolean
	 *
	 * Constraint:
	 *     additionalProperties=EBooleanObject
	 */
	protected void sequence_EnvOneOf0AdditionalPropertiesTypeBoolean(ISerializationContext context, EnvOneOf0AdditionalPropertiesTypeBoolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeBoolean_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeBoolean_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanAccess().getAdditionalPropertiesEBooleanObjectParserRuleCall_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnvOneOf0AdditionalPropertiesAbstract returns EnvOneOf0AdditionalPropertiesTypeInteger
	 *     EnvOneOf0AdditionalPropertiesTypeInteger returns EnvOneOf0AdditionalPropertiesTypeInteger
	 *
	 * Constraint:
	 *     additionalProperties=EDoubleObject
	 */
	protected void sequence_EnvOneOf0AdditionalPropertiesTypeInteger(ISerializationContext context, EnvOneOf0AdditionalPropertiesTypeInteger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeInteger_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeInteger_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerAccess().getAdditionalPropertiesEDoubleObjectParserRuleCall_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnvOneOf0AdditionalPropertiesAbstract returns EnvOneOf0AdditionalPropertiesTypeNull
	 *     EnvOneOf0AdditionalPropertiesTypeNull returns EnvOneOf0AdditionalPropertiesTypeNull
	 *
	 * Constraint:
	 *     additionalProperties=NullValue
	 */
	protected void sequence_EnvOneOf0AdditionalPropertiesTypeNull(ISerializationContext context, EnvOneOf0AdditionalPropertiesTypeNull semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeNull_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeNull_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullAccess().getAdditionalPropertiesNullValueParserRuleCall_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnvOneOf0AdditionalPropertiesAbstract returns EnvOneOf0AdditionalPropertiesTypeNumber
	 *     EnvOneOf0AdditionalPropertiesTypeNumber returns EnvOneOf0AdditionalPropertiesTypeNumber
	 *
	 * Constraint:
	 *     additionalProperties=EDoubleObject
	 */
	protected void sequence_EnvOneOf0AdditionalPropertiesTypeNumber(ISerializationContext context, EnvOneOf0AdditionalPropertiesTypeNumber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeNumber_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeNumber_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberAccess().getAdditionalPropertiesEDoubleObjectParserRuleCall_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnvOneOf0AdditionalPropertiesAbstract returns EnvOneOf0AdditionalPropertiesTypeObject
	 *     EnvOneOf0AdditionalPropertiesTypeObject returns EnvOneOf0AdditionalPropertiesTypeObject
	 *
	 * Constraint:
	 *     (additionalProperties+=EnvOneOf0AdditionalPropertiesPropertiesAbstract additionalProperties+=EnvOneOf0AdditionalPropertiesPropertiesAbstract*)?
	 */
	protected void sequence_EnvOneOf0AdditionalPropertiesTypeObject(ISerializationContext context, EnvOneOf0AdditionalPropertiesTypeObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnvOneOf0AdditionalPropertiesAbstract returns EnvOneOf0AdditionalPropertiesTypeString
	 *     EnvOneOf0AdditionalPropertiesTypeString returns EnvOneOf0AdditionalPropertiesTypeString
	 *
	 * Constraint:
	 *     additionalProperties=EString
	 */
	protected void sequence_EnvOneOf0AdditionalPropertiesTypeString(ISerializationContext context, EnvOneOf0AdditionalPropertiesTypeString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeString_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeString_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringAccess().getAdditionalPropertiesEStringParserRuleCall_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnvOneOf0PropertiesAbstract returns EnvOneOf0AdditionalProperties
	 *     EnvOneOf0AdditionalProperties returns EnvOneOf0AdditionalProperties
	 *
	 * Constraint:
	 *     (key=EString additionalProperties=EnvOneOf0AdditionalPropertiesAbstract)
	 */
	protected void sequence_EnvOneOf0AdditionalProperties(ISerializationContext context, EnvOneOf0AdditionalProperties semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalProperties_Key()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalProperties_Key()));
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalProperties_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalProperties_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesAbstractParserRuleCall_2_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnvOneOf0 returns EnvOneOf0
	 *
	 * Constraint:
	 *     (env+=EnvOneOf0PropertiesAbstract env+=EnvOneOf0PropertiesAbstract*)?
	 */
	protected void sequence_EnvOneOf0(ISerializationContext context, EnvOneOf0 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JsonDocument returns JsonDocument
	 *
	 * Constraint:
	 *     value=Value
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
	 * Contexts:
	 *     KeyValuePair returns KeyValuePair
	 *
	 * Constraint:
	 *     (key=EString value=Value)
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
	 * Contexts:
	 *     Value returns NullValue
	 *     NullValue returns NullValue
	 *
	 * Constraint:
	 *     value=NullEnum
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
	 * Contexts:
	 *     Value returns NumberValue
	 *     NumberValue returns NumberValue
	 *
	 * Constraint:
	 *     value=EDouble
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
	 * Contexts:
	 *     Value returns ObjectValue
	 *     ObjectValue returns ObjectValue
	 *
	 * Constraint:
	 *     (keyvaluepair+=KeyValuePair keyvaluepair+=KeyValuePair*)?
	 */
	protected void sequence_ObjectValue(ISerializationContext context, ObjectValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     value=EString
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
