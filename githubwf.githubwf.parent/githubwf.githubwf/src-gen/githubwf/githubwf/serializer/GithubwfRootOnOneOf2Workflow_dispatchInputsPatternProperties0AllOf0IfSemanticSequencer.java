/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString;
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfGrammarAccess;
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
public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If) semanticObject); 
				return; 
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_ADDITIONAL_PROPERTIES:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties) semanticObject); 
				return; 
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_ITEMS:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems) semanticObject); 
				return; 
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType) semanticObject); 
				return; 
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_ARRAY:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray) semanticObject); 
				return; 
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_BOOLEAN:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean) semanticObject); 
				return; 
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_INTEGER:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger) semanticObject); 
				return; 
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_NULL:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull) semanticObject); 
				return; 
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_NUMBER:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber) semanticObject); 
				return; 
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_OBJECT:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject) semanticObject); 
				return; 
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_STRING:
				sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString(context, (GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString) semanticObject); 
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
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties
	 *
	 * Constraint:
	 *     (key=EString additionalProperties=JsonDocument)
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties_Key()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties_Key()));
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties_AdditionalProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties_AdditionalProperties()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems
	 *
	 * Constraint:
	 *     items=JsonDocument
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems_Items()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems_Items()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItemsAccess().getItemsJsonDocumentParserRuleCall_0(), semanticObject.getItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray
	 *
	 * Constraint:
	 *     (
	 *         patternProperties0+=GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems 
	 *         patternProperties0+=GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems*
	 *     )?
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean
	 *
	 * Constraint:
	 *     patternProperties0=EBooleanObject
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean_PatternProperties0()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean_PatternProperties0()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0(), semanticObject.getPatternProperties0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger
	 *
	 * Constraint:
	 *     patternProperties0=EDoubleObject
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger_PatternProperties0()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger_PatternProperties0()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0(), semanticObject.getPatternProperties0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull
	 *
	 * Constraint:
	 *     patternProperties0=NullValue
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull_PatternProperties0()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull_PatternProperties0()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNullAccess().getPatternProperties0NullValueParserRuleCall_0(), semanticObject.getPatternProperties0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber
	 *
	 * Constraint:
	 *     patternProperties0=EDoubleObject
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber_PatternProperties0()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber_PatternProperties0()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0(), semanticObject.getPatternProperties0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject
	 *
	 * Constraint:
	 *     (
	 *         patternProperties0+=GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract 
	 *         patternProperties0+=GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract*
	 *     )?
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString
	 *
	 * Constraint:
	 *     patternProperties0=EString
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString_PatternProperties0()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString_PatternProperties0()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeStringAccess().getPatternProperties0EStringParserRuleCall_0(), semanticObject.getPatternProperties0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType
	 *
	 * Constraint:
	 *     type=JsonDocument
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType_Type()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType_Type()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeAccess().getTypeJsonDocumentParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If
	 *
	 * Constraint:
	 *     patternProperties0=GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract
	 */
	protected void sequence_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If(ISerializationContext context, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If_PatternProperties0()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If_PatternProperties0()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstractParserRuleCall_0(), semanticObject.getPatternProperties0());
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