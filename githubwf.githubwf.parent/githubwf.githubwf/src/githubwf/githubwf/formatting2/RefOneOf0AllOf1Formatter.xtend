/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.RefOneOf0AllOf1
import githubwf.RefOneOf0AllOf1TypeObject
import githubwf.githubwf.services.RefOneOf0AllOf1GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class RefOneOf0AllOf1Formatter extends AbstractFormatter2 {
	
	@Inject extension RefOneOf0AllOf1GrammarAccess

	def dispatch void format(RefOneOf0AllOf1 refOneOf0AllOf1, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		refOneOf0AllOf1.ref.format
	}

	def dispatch void format(RefOneOf0AllOf1TypeObject refOneOf0AllOf1TypeObject, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (refOneOf0AllOf1PropertiesAbstract : refOneOf0AllOf1TypeObject.ref) {
			refOneOf0AllOf1PropertiesAbstract.format
		}
	}
	
	// TODO: implement for RefOneOf0AllOf1TypeArray, RefOneOf0AllOf1TypeNull, RefOneOf0AllOf1AdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, RefOneOf0AllOf1Items
}
