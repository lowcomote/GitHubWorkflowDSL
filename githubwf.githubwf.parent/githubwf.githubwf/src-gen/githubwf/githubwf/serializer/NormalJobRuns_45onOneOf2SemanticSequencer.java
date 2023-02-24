/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.serializer;

import com.google.inject.Inject;
import githubwf.GithubwfPackage;
import githubwf.NormalJobRuns_45onOneOf2;
import githubwf.StringContainingExpressionSyntax;
import githubwf.githubwf.services.NormalJobRuns_45onOneOf2GrammarAccess;
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
public class NormalJobRuns_45onOneOf2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NormalJobRuns_45onOneOf2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubwfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF2:
				sequence_NormalJobRuns_45onOneOf2(context, (NormalJobRuns_45onOneOf2) semanticObject); 
				return; 
			case GithubwfPackage.STRING_CONTAINING_EXPRESSION_SYNTAX:
				sequence_StringContainingExpressionSyntax(context, (StringContainingExpressionSyntax) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     NormalJobRuns_45onOneOf2 returns NormalJobRuns_45onOneOf2
	 *
	 * Constraint:
	 *     runs_45on=StringContainingExpressionSyntax
	 */
	protected void sequence_NormalJobRuns_45onOneOf2(ISerializationContext context, NormalJobRuns_45onOneOf2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf2_Runs_45on()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf2_Runs_45on()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalJobRuns_45onOneOf2Access().getRuns_45onStringContainingExpressionSyntaxParserRuleCall_2_0(), semanticObject.getRuns_45on());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StringContainingExpressionSyntax returns StringContainingExpressionSyntax
	 *
	 * Constraint:
	 *     stringContainingExpressionSyntax=EString
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