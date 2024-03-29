/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.GithubwfPackage;
import githubwf.NormalJobEnvironmentOneOf0;
import githubwf.githubwf.services.NormalJobEnvironmentOneOf0GrammarAccess;
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
public class NormalJobEnvironmentOneOf0SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NormalJobEnvironmentOneOf0GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_ONE_OF0:
				sequence_NormalJobEnvironmentOneOf0(context, (NormalJobEnvironmentOneOf0) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalJobEnvironmentOneOf0 returns NormalJobEnvironmentOneOf0
	 *
	 * Constraint:
	 *     environment=EString
	 * </pre>
	 */
	protected void sequence_NormalJobEnvironmentOneOf0(ISerializationContext context, NormalJobEnvironmentOneOf0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobEnvironmentOneOf0_Environment()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobEnvironmentOneOf0_Environment()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentEStringParserRuleCall_2_0(), semanticObject.getEnvironment());
		feeder.finish();
	}
	
	
}
