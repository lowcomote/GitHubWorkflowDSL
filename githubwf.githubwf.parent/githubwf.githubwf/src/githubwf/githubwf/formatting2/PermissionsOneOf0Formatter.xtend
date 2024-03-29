/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.PermissionsOneOf0
import githubwf.githubwf.services.PermissionsOneOf0GrammarAccess
import jsonMM.JsonDocument
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class PermissionsOneOf0Formatter extends AbstractFormatter2 {
	
	@Inject extension PermissionsOneOf0GrammarAccess

	def dispatch void format(PermissionsOneOf0 permissionsOneOf0, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		permissionsOneOf0.permissions.format
	}

	def dispatch void format(JsonDocument jsonDocument, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		jsonDocument.value.format
	}
	
	// TODO: implement for ArrayValue, ObjectValue, KeyValuePair
}
