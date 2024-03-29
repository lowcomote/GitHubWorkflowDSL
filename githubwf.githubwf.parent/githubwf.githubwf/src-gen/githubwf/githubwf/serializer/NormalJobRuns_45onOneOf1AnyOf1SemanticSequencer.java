/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.GithubwfPackage;
import githubwf.Machine;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1AdditionalItems;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1Items0;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1Items1;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1Tuple;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeArray;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeBoolean;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeInteger;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeNull;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeNumber;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeObject;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeString;
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1AnyOf1GrammarAccess;
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
public class NormalJobRuns_45onOneOf1AnyOf1SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NormalJobRuns_45onOneOf1AnyOf1GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.MACHINE:
				sequence_Machine(context, (Machine) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1:
				sequence_NormalJobRuns_45onOneOf1AnyOf1(context, (NormalJobRuns_45onOneOf1AnyOf1) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ADDITIONAL_ITEMS:
				sequence_NormalJobRuns_45onOneOf1AnyOf1AdditionalItems(context, (NormalJobRuns_45onOneOf1AnyOf1AdditionalItems) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ADDITIONAL_PROPERTIES:
				sequence_NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties(context, (NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS0:
				sequence_NormalJobRuns_45onOneOf1AnyOf1Items0(context, (NormalJobRuns_45onOneOf1AnyOf1Items0) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1:
				sequence_NormalJobRuns_45onOneOf1AnyOf1Items1(context, (NormalJobRuns_45onOneOf1AnyOf1Items1) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TUPLE:
				sequence_NormalJobRuns_45onOneOf1AnyOf1Tuple(context, (NormalJobRuns_45onOneOf1AnyOf1Tuple) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY:
				sequence_NormalJobRuns_45onOneOf1AnyOf1TypeArray(context, (NormalJobRuns_45onOneOf1AnyOf1TypeArray) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_BOOLEAN:
				sequence_NormalJobRuns_45onOneOf1AnyOf1TypeBoolean(context, (NormalJobRuns_45onOneOf1AnyOf1TypeBoolean) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_INTEGER:
				sequence_NormalJobRuns_45onOneOf1AnyOf1TypeInteger(context, (NormalJobRuns_45onOneOf1AnyOf1TypeInteger) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_NULL:
				sequence_NormalJobRuns_45onOneOf1AnyOf1TypeNull(context, (NormalJobRuns_45onOneOf1AnyOf1TypeNull) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_NUMBER:
				sequence_NormalJobRuns_45onOneOf1AnyOf1TypeNumber(context, (NormalJobRuns_45onOneOf1AnyOf1TypeNumber) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_OBJECT:
				sequence_NormalJobRuns_45onOneOf1AnyOf1TypeObject(context, (NormalJobRuns_45onOneOf1AnyOf1TypeObject) semanticObject); 
				return; 
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_STRING:
				sequence_NormalJobRuns_45onOneOf1AnyOf1TypeString(context, (NormalJobRuns_45onOneOf1AnyOf1TypeString) semanticObject); 
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
	 *     Machine returns Machine
	 *
	 * Constraint:
	 *     machine=JsonDocument
	 * </pre>
	 */
	protected void sequence_Machine(ISerializationContext context, Machine semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getMachine_Machine()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getMachine_Machine()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMachineAccess().getMachineJsonDocumentParserRuleCall_0(), semanticObject.getMachine());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1AdditionalItems returns NormalJobRuns_45onOneOf1AnyOf1AdditionalItems
	 *
	 * Constraint:
	 *     additionalItems=EString
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1AdditionalItems(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1AdditionalItems semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1AdditionalItems_AdditionalItems()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1AdditionalItems_AdditionalItems()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1AdditionalItemsAccess().getAdditionalItemsEStringParserRuleCall_0(), semanticObject.getAdditionalItems());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1PropertiesAbstract returns NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties
	 *     NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties returns NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties
	 *
	 * Constraint:
	 *     (key=EString additionalProperties=JsonDocument)
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties_Key()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties_Key()));
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1Items0 returns NormalJobRuns_45onOneOf1AnyOf1Items0
	 *
	 * Constraint:
	 *     items0=JsonDocument
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1Items0(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1Items0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1Items0_Items0()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1Items0_Items0()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1Items0Access().getItems0JsonDocumentParserRuleCall_0(), semanticObject.getItems0());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1Items1 returns NormalJobRuns_45onOneOf1AnyOf1Items1
	 *
	 * Constraint:
	 *     items1=Machine
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1Items1(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1Items1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1Items1_Items1()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1Items1_Items1()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1Items1Access().getItems1MachineParserRuleCall_0(), semanticObject.getItems1());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1Tuple returns NormalJobRuns_45onOneOf1AnyOf1Tuple
	 *
	 * Constraint:
	 *     (
	 *         items0=NormalJobRuns_45onOneOf1AnyOf1Items0 
	 *         (
	 *             items1=NormalJobRuns_45onOneOf1AnyOf1Items1 
	 *             (additionalItems+=NormalJobRuns_45onOneOf1AnyOf1AdditionalItems additionalItems+=NormalJobRuns_45onOneOf1AnyOf1AdditionalItems*)?
	 *         )?
	 *     )?
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1Tuple(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1Tuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1Abstract returns NormalJobRuns_45onOneOf1AnyOf1TypeArray
	 *     NormalJobRuns_45onOneOf1AnyOf1TypeArray returns NormalJobRuns_45onOneOf1AnyOf1TypeArray
	 *
	 * Constraint:
	 *     runs_45on=NormalJobRuns_45onOneOf1AnyOf1Tuple
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1TypeArray(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1TypeArray semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeArray_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeArray_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1TypeArrayAccess().getRuns_45onNormalJobRuns_45onOneOf1AnyOf1TupleParserRuleCall_3_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1Abstract returns NormalJobRuns_45onOneOf1AnyOf1TypeBoolean
	 *     NormalJobRuns_45onOneOf1AnyOf1TypeBoolean returns NormalJobRuns_45onOneOf1AnyOf1TypeBoolean
	 *
	 * Constraint:
	 *     runs_45on=EBooleanObject
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1TypeBoolean(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1TypeBoolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeBoolean_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeBoolean_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1TypeBooleanAccess().getRuns_45onEBooleanObjectParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1Abstract returns NormalJobRuns_45onOneOf1AnyOf1TypeInteger
	 *     NormalJobRuns_45onOneOf1AnyOf1TypeInteger returns NormalJobRuns_45onOneOf1AnyOf1TypeInteger
	 *
	 * Constraint:
	 *     runs_45on=EDoubleObject
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1TypeInteger(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1TypeInteger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeInteger_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeInteger_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1TypeIntegerAccess().getRuns_45onEDoubleObjectParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1Abstract returns NormalJobRuns_45onOneOf1AnyOf1TypeNull
	 *     NormalJobRuns_45onOneOf1AnyOf1TypeNull returns NormalJobRuns_45onOneOf1AnyOf1TypeNull
	 *
	 * Constraint:
	 *     runs_45on=NullValue
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1TypeNull(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1TypeNull semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeNull_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeNull_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1TypeNullAccess().getRuns_45onNullValueParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1Abstract returns NormalJobRuns_45onOneOf1AnyOf1TypeNumber
	 *     NormalJobRuns_45onOneOf1AnyOf1TypeNumber returns NormalJobRuns_45onOneOf1AnyOf1TypeNumber
	 *
	 * Constraint:
	 *     runs_45on=EDoubleObject
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1TypeNumber(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1TypeNumber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeNumber_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeNumber_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1TypeNumberAccess().getRuns_45onEDoubleObjectParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1Abstract returns NormalJobRuns_45onOneOf1AnyOf1TypeObject
	 *     NormalJobRuns_45onOneOf1AnyOf1TypeObject returns NormalJobRuns_45onOneOf1AnyOf1TypeObject
	 *
	 * Constraint:
	 *     (runs_45on+=NormalJobRuns_45onOneOf1AnyOf1PropertiesAbstract runs_45on+=NormalJobRuns_45onOneOf1AnyOf1PropertiesAbstract*)?
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1TypeObject(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1TypeObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1Abstract returns NormalJobRuns_45onOneOf1AnyOf1TypeString
	 *     NormalJobRuns_45onOneOf1AnyOf1TypeString returns NormalJobRuns_45onOneOf1AnyOf1TypeString
	 *
	 * Constraint:
	 *     runs_45on=EString
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1TypeString(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1TypeString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeString_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeString_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1TypeStringAccess().getRuns_45onEStringParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobRuns_45onOneOf1AnyOf1 returns NormalJobRuns_45onOneOf1AnyOf1
	 *
	 * Constraint:
	 *     runs_45on=NormalJobRuns_45onOneOf1AnyOf1Abstract
	 * </pre>
	 */
	protected void sequence_NormalJobRuns_45onOneOf1AnyOf1(ISerializationContext context, NormalJobRuns_45onOneOf1AnyOf1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf1Access().getRuns_45onNormalJobRuns_45onOneOf1AnyOf1AbstractParserRuleCall_0(), semanticObject.getRuns_45on());
		feeder.finish();
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
