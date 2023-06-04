/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0
import githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties
import githubwf.githubwf.services.ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ReusableWorkflowCallJobStrategyMatrixOneOf0Formatter extends AbstractFormatter2 {
	
	@Inject extension ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess

	def dispatch void format(ReusableWorkflowCallJobStrategyMatrixOneOf0 reusableWorkflowCallJobStrategyMatrixOneOf0, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (reusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract : reusableWorkflowCallJobStrategyMatrixOneOf0.matrix) {
			reusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract.format
		}
	}

	def dispatch void format(ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties.additionalProperties.format
	}
	
	// TODO: implement for JsonDocument, ArrayValue, ObjectValue, KeyValuePair
}
