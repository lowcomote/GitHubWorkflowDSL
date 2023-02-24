/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0
import githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items
import githubwf.githubwf.services.NormalJobStrategyMatrixAdditionalPropertiesOneOf0GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class NormalJobStrategyMatrixAdditionalPropertiesOneOf0Formatter extends AbstractFormatter2 {
	
	@Inject extension NormalJobStrategyMatrixAdditionalPropertiesOneOf0GrammarAccess

	def dispatch void format(NormalJobStrategyMatrixAdditionalPropertiesOneOf0 normalJobStrategyMatrixAdditionalPropertiesOneOf0, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (normalJobStrategyMatrixAdditionalPropertiesOneOf0Items : normalJobStrategyMatrixAdditionalPropertiesOneOf0.additionalProperties) {
			normalJobStrategyMatrixAdditionalPropertiesOneOf0Items.format
		}
	}

	def dispatch void format(NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items normalJobStrategyMatrixAdditionalPropertiesOneOf0Items, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		normalJobStrategyMatrixAdditionalPropertiesOneOf0Items.items.format
	}
	
	// TODO: implement for Configuration, ConfigurationTypeObject, ConfigurationTypeArray, ConfigurationTypeNull, ConfigurationAdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, ConfigurationItems
}
