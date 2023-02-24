/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.PermissionsOneOf1
import githubwf.Permissions_45event
import githubwf.githubwf.services.PermissionsOneOf1GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class PermissionsOneOf1Formatter extends AbstractFormatter2 {
	
	@Inject extension PermissionsOneOf1GrammarAccess

	def dispatch void format(PermissionsOneOf1 permissionsOneOf1, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		permissionsOneOf1.permissions.format
	}

	def dispatch void format(Permissions_45event permissions_45event, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (permissions_45eventPropertiesAbstract : permissions_45event.permissions_45event) {
			permissions_45eventPropertiesAbstract.format
		}
	}
	
	// TODO: implement for Permissions_45eventActions, Permissions_45eventChecks, Permissions_45eventContents, Permissions_45eventDeployments, Permissions_45eventDiscussions, Permissions_45eventId_45token, Permissions_45eventIssues, Permissions_45eventPackages, Permissions_45eventPages, Permissions_45eventPull_45requests, Permissions_45eventRepository_45projects, Permissions_45eventSecurity_45events, Permissions_45eventStatuses, Permissions_45level, JsonDocument, ArrayValue, ObjectValue, KeyValuePair
}
