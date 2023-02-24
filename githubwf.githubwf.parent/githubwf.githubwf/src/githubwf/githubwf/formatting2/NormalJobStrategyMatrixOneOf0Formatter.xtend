/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.NormalJobStrategyMatrixOneOf0
import githubwf.NormalJobStrategyMatrixOneOf0AdditionalProperties
import githubwf.githubwf.services.NormalJobStrategyMatrixOneOf0GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class NormalJobStrategyMatrixOneOf0Formatter extends AbstractFormatter2 {
	
	@Inject extension NormalJobStrategyMatrixOneOf0GrammarAccess

	def dispatch void format(NormalJobStrategyMatrixOneOf0 normalJobStrategyMatrixOneOf0, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (normalJobStrategyMatrixOneOf0PropertiesAbstract : normalJobStrategyMatrixOneOf0.matrix) {
			normalJobStrategyMatrixOneOf0PropertiesAbstract.format
		}
	}

	def dispatch void format(NormalJobStrategyMatrixOneOf0AdditionalProperties normalJobStrategyMatrixOneOf0AdditionalProperties, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		normalJobStrategyMatrixOneOf0AdditionalProperties.additionalProperties.format
	}
	
	// TODO: implement for JsonDocument, ArrayValue, ObjectValue, KeyValuePair
}