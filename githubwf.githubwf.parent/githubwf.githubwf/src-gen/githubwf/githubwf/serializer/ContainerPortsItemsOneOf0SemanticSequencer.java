/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.ContainerPortsItemsOneOf0;
import githubwf.GithubwfPackage;
import githubwf.githubwf.services.ContainerPortsItemsOneOf0GrammarAccess;
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
public class ContainerPortsItemsOneOf0SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ContainerPortsItemsOneOf0GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_ONE_OF0:
				sequence_ContainerPortsItemsOneOf0(context, (ContainerPortsItemsOneOf0) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ContainerPortsItemsOneOf0 returns ContainerPortsItemsOneOf0
	 *
	 * Constraint:
	 *     items=EDoubleObject
	 */
	protected void sequence_ContainerPortsItemsOneOf0(ISerializationContext context, ContainerPortsItemsOneOf0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getContainerPortsItemsOneOf0_Items()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getContainerPortsItemsOneOf0_Items()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainerPortsItemsOneOf0Access().getItemsEDoubleObjectParserRuleCall_0(), semanticObject.getItems());
		feeder.finish();
	}
	
	
}