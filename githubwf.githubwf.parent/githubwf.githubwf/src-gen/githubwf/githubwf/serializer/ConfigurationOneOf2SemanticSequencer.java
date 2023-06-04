/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.ConfigurationOneOf2;
import githubwf.GithubwfPackage;
import githubwf.githubwf.services.ConfigurationOneOf2GrammarAccess;
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
public class ConfigurationOneOf2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ConfigurationOneOf2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.CONFIGURATION_ONE_OF2:
				sequence_ConfigurationOneOf2(context, (ConfigurationOneOf2) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ConfigurationOneOf2 returns ConfigurationOneOf2
	 *
	 * Constraint:
	 *     configuration=EBooleanObject
	 * </pre>
	 */
	protected void sequence_ConfigurationOneOf2(ISerializationContext context, ConfigurationOneOf2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getConfigurationOneOf2_Configuration()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getConfigurationOneOf2_Configuration()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConfigurationOneOf2Access().getConfigurationEBooleanObjectParserRuleCall_0(), semanticObject.getConfiguration());
		feeder.finish();
	}
	
	
}
