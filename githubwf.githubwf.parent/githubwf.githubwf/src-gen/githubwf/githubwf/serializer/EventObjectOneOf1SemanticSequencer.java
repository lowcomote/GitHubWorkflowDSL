/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.EventObjectOneOf1;
import githubwf.GithubwfPackage;
import githubwf.githubwf.services.EventObjectOneOf1GrammarAccess;
import java.util.Set;
import jsonMM.JsonMMPackage;
import jsonMM.NullValue;
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
public class EventObjectOneOf1SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EventObjectOneOf1GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.EVENT_OBJECT_ONE_OF1:
				sequence_EventObjectOneOf1(context, (EventObjectOneOf1) semanticObject); 
				return; 
			}
		else if (epackage == JsonMMPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JsonMMPackage.NULL_VALUE:
				sequence_NullValue(context, (NullValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     EventObjectOneOf1 returns EventObjectOneOf1
	 *
	 * Constraint:
	 *     eventObject=NullValue
	 * </pre>
	 */
	protected void sequence_EventObjectOneOf1(ISerializationContext context, EventObjectOneOf1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEventObjectOneOf1_EventObject()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEventObjectOneOf1_EventObject()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventObjectOneOf1Access().getEventObjectNullValueParserRuleCall_0(), semanticObject.getEventObject());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
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
	
	
}
