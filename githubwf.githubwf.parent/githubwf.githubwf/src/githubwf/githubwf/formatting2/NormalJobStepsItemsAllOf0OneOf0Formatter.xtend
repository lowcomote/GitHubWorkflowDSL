/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.NormalJobStepsItemsAllOf0OneOf0
import githubwf.NormalJobStepsItemsAllOf0OneOf0AdditionalProperties
import githubwf.githubwf.services.NormalJobStepsItemsAllOf0OneOf0GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class NormalJobStepsItemsAllOf0OneOf0Formatter extends AbstractFormatter2 {
	
	@Inject extension NormalJobStepsItemsAllOf0OneOf0GrammarAccess

	def dispatch void format(NormalJobStepsItemsAllOf0OneOf0 normalJobStepsItemsAllOf0OneOf0, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (normalJobStepsItemsAllOf0OneOf0PropertiesAbstract : normalJobStepsItemsAllOf0OneOf0.items) {
			normalJobStepsItemsAllOf0OneOf0PropertiesAbstract.format
		}
	}

	def dispatch void format(NormalJobStepsItemsAllOf0OneOf0AdditionalProperties normalJobStepsItemsAllOf0OneOf0AdditionalProperties, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		normalJobStepsItemsAllOf0OneOf0AdditionalProperties.additionalProperties.format
	}
	
	// TODO: implement for JsonDocument, ArrayValue, ObjectValue, KeyValuePair
}
