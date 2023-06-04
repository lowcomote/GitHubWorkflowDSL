/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.EnvOneOf1;
import githubwf.GithubwfPackage;
import githubwf.StringContainingExpressionSyntax;
import githubwf.githubwf.services.EnvOneOf1GrammarAccess;
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
public class EnvOneOf1SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EnvOneOf1GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.ENV_ONE_OF1:
				sequence_EnvOneOf1(context, (EnvOneOf1) semanticObject); 
				return; 
			case GithubwfPackage.STRING_CONTAINING_EXPRESSION_SYNTAX:
				sequence_StringContainingExpressionSyntax(context, (StringContainingExpressionSyntax) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     EnvOneOf1 returns EnvOneOf1
	 *
	 * Constraint:
	 *     env=StringContainingExpressionSyntax
	 * </pre>
	 */
	protected void sequence_EnvOneOf1(ISerializationContext context, EnvOneOf1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf1_Env()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getEnvOneOf1_Env()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvOneOf1Access().getEnvStringContainingExpressionSyntaxParserRuleCall_0(), semanticObject.getEnv());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StringContainingExpressionSyntax returns StringContainingExpressionSyntax
	 *
	 * Constraint:
	 *     stringContainingExpressionSyntax=EString
	 * </pre>
	 */
	protected void sequence_StringContainingExpressionSyntax(ISerializationContext context, StringContainingExpressionSyntax semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getStringContainingExpressionSyntax_StringContainingExpressionSyntax()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getStringContainingExpressionSyntax_StringContainingExpressionSyntax()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringContainingExpressionSyntaxAccess().getStringContainingExpressionSyntaxEStringParserRuleCall_0(), semanticObject.getStringContainingExpressionSyntax());
		feeder.finish();
	}
	
	
}
