/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.Event
import githubwf.GithubwfRootOnOneOf0
import githubwf.githubwf.services.GithubwfRootOnOneOf0GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class GithubwfRootOnOneOf0Formatter extends AbstractFormatter2 {
	
	@Inject extension GithubwfRootOnOneOf0GrammarAccess

	def dispatch void format(GithubwfRootOnOneOf0 githubwfRootOnOneOf0, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		githubwfRootOnOneOf0.on.format
	}

	def dispatch void format(Event event, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		event.event.format
	}
	
	// TODO: implement for JsonDocument, ArrayValue, ObjectValue, KeyValuePair
}