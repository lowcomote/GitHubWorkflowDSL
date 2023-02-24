/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.GithubwfPackage;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0AdditionalItems;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0Items0;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0Tuple;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeArray;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeBoolean;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeInteger;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeNull;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeNumber;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeObject;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeString;
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1AnyOf0GrammarAccess;
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
public class NormalJobRuns_45onOneOf1AnyOf0SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NormalJobRuns_45onOneOf1AnyOf0GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0:
				sequence_NormalJobRuns_45onOneOf1AnyOf0(context, (NormalJobRuns_45onOneOf1AnyOf0) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_ADDITIONAL_ITEMS:
				sequence_NormalJobRuns_45onOneOf1AnyOf0AdditionalItems(context, (NormalJobRuns_45onOneOf1AnyOf0AdditionalItems) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_ADDITIONAL_PROPERTIES:
				sequence_NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties(context, (NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_ITEMS0:
				sequence_NormalJobRuns_45onOneOf1AnyOf0Items0(context, (NormalJobRuns_45onOneOf1AnyOf0Items0) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TUPLE:
				sequence_NormalJobRuns_45onOneOf1AnyOf0Tuple(context, (NormalJobRuns_45onOneOf1AnyOf0Tuple) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_ARRAY:
				sequence_NormalJobRuns_45onOneOf1AnyOf0TypeArray(context, (NormalJobRuns_45onOneOf1AnyOf0TypeArray) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_BOOLEAN:
				sequence_NormalJobRuns_45onOneOf1AnyOf0TypeBoolean(context, (NormalJobRuns_45onOneOf1AnyOf0TypeBoolean) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_INTEGER:
				sequence_NormalJobRuns_45onOneOf1AnyOf0TypeInteger(context, (NormalJobRuns_45onOneOf1AnyOf0TypeInteger) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_NULL:
				sequence_NormalJobRuns_45onOneOf1AnyOf0TypeNull(context, (NormalJobRuns_45onOneOf1AnyOf0TypeNull) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_NUMBER:
				sequence_NormalJobRuns_45onOneOf1AnyOf0TypeNumber(context, (NormalJobRuns_45onOneOf1AnyOf0TypeNumber) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_OBJECT:
				sequence_NormalJobRuns_45onOneOf1AnyOf0TypeObject(context, (NormalJobRuns_45onOneOf1AnyOf0TypeObject) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_STRING:
				sequence_NormalJobRuns_45onOneOf1AnyOf0TypeString(context, (NormalJobRuns_45onOneOf1AnyOf0TypeString) semanticObject); 
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
	 *     NormalJobRuns_45onOneOf1AnyOf0AdditionalItems returns NormalJobRuns_45onOneOf1AnyOf0AdditionalItems
	 *
	 * Constraint:
	 *     additionalItems=EString
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0AdditionalItems(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0AdditionalItems semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0AdditionalItems_AdditionalItems()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0AdditionalItems_AdditionalItems()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0AdditionalItemsAccess().getAdditionalItemsEStringParserRuleCall_0(), semanticObject.getAdditionalItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0PropertiesAbstract returns NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties
	 *     NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties returns NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties
	 *
	 * Constraint:
	 *     (key=EString additionalProperties=JsonDocument)
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties_Key()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties_Key()));
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0Items0 returns NormalJobRuns_45onOneOf1AnyOf0Items0
	 *
	 * Constraint:
	 *     items0=JsonDocument
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0Items0(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0Items0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0Items0_Items0()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0Items0_Items0()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0Items0Access().getItems0JsonDocumentParserRuleCall_0(), semanticObject.getItems0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0Tuple returns NormalJobRuns_45onOneOf1AnyOf0Tuple
	 *
	 * Constraint:
	 *     (
	 *         items0=NormalJobRuns_45onOneOf1AnyOf0Items0 
	 *         (additionalItems+=NormalJobRuns_45onOneOf1AnyOf0AdditionalItems additionalItems+=NormalJobRuns_45onOneOf1AnyOf0AdditionalItems*)?
	 *     )?
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0Tuple(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0Tuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0Abstract returns NormalJobRuns_45onOneOf1AnyOf0TypeArray
	 *     NormalJobRuns_45onOneOf1AnyOf0TypeArray returns NormalJobRuns_45onOneOf1AnyOf0TypeArray
	 *
	 * Constraint:
	 *     runs_45on=NormalJobRuns_45onOneOf1AnyOf0Tuple
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0TypeArray(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0TypeArray semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeArray_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeArray_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeArrayAccess().getRuns_45onNormalJobRuns_45onOneOf1AnyOf0TupleParserRuleCall_3_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0Abstract returns NormalJobRuns_45onOneOf1AnyOf0TypeBoolean
	 *     NormalJobRuns_45onOneOf1AnyOf0TypeBoolean returns NormalJobRuns_45onOneOf1AnyOf0TypeBoolean
	 *
	 * Constraint:
	 *     runs_45on=EBooleanObject
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0TypeBoolean(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0TypeBoolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeBoolean_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeBoolean_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeBooleanAccess().getRuns_45onEBooleanObjectParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0Abstract returns NormalJobRuns_45onOneOf1AnyOf0TypeInteger
	 *     NormalJobRuns_45onOneOf1AnyOf0TypeInteger returns NormalJobRuns_45onOneOf1AnyOf0TypeInteger
	 *
	 * Constraint:
	 *     runs_45on=EDoubleObject
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0TypeInteger(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0TypeInteger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeInteger_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeInteger_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeIntegerAccess().getRuns_45onEDoubleObjectParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0Abstract returns NormalJobRuns_45onOneOf1AnyOf0TypeNull
	 *     NormalJobRuns_45onOneOf1AnyOf0TypeNull returns NormalJobRuns_45onOneOf1AnyOf0TypeNull
	 *
	 * Constraint:
	 *     runs_45on=NullValue
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0TypeNull(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0TypeNull semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeNull_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeNull_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeNullAccess().getRuns_45onNullValueParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0Abstract returns NormalJobRuns_45onOneOf1AnyOf0TypeNumber
	 *     NormalJobRuns_45onOneOf1AnyOf0TypeNumber returns NormalJobRuns_45onOneOf1AnyOf0TypeNumber
	 *
	 * Constraint:
	 *     runs_45on=EDoubleObject
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0TypeNumber(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0TypeNumber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeNumber_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeNumber_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeNumberAccess().getRuns_45onEDoubleObjectParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0Abstract returns NormalJobRuns_45onOneOf1AnyOf0TypeObject
	 *     NormalJobRuns_45onOneOf1AnyOf0TypeObject returns NormalJobRuns_45onOneOf1AnyOf0TypeObject
	 *
	 * Constraint:
	 *     (runs_45on+=NormalJobRuns_45onOneOf1AnyOf0PropertiesAbstract runs_45on+=NormalJobRuns_45onOneOf1AnyOf0PropertiesAbstract*)?
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0TypeObject(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0TypeObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0Abstract returns NormalJobRuns_45onOneOf1AnyOf0TypeString
	 *     NormalJobRuns_45onOneOf1AnyOf0TypeString returns NormalJobRuns_45onOneOf1AnyOf0TypeString
	 *
	 * Constraint:
	 *     runs_45on=EString
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0TypeString(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0TypeString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeString_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeString_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0TypeStringAccess().getRuns_45onEStringParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf0 returns NormalJobRuns_45onOneOf1AnyOf0
	 *
	 * Constraint:
	 *     runs_45on=NormalJobRuns_45onOneOf1AnyOf0Abstract
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf0(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf0Access().getRuns_45onNormalJobRuns_45onOneOf1AnyOf0AbstractParserRuleCall_0(), semanticObject.getRuns_45on());
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
