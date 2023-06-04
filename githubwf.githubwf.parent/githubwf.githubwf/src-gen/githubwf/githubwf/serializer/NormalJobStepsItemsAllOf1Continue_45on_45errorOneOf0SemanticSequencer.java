/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.GithubwfPackage;
import githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0;
import githubwf.githubwf.services.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0GrammarAccess;
import java.util.Set;
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
public class NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF0:
				sequence_NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0(context, (NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 returns NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0
	 *
	 * Constraint:
	 *     continue_45on_45error=EBooleanObject
	 * </pre>
	 */
	protected void sequence_NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0(ISerializationContext context, NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0_Continue_45on_45error()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0_Continue_45on_45error()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getContinue_45on_45errorEBooleanObjectParserRuleCall_2_0(), semanticObject.getContinue_45on_45error());
		feeder.finish();
	}
	
	
}
