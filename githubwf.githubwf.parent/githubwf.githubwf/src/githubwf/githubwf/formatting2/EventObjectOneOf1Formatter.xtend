/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.EventObjectOneOf1
import githubwf.githubwf.services.EventObjectOneOf1GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class EventObjectOneOf1Formatter extends AbstractFormatter2 {
	
	@Inject extension EventObjectOneOf1GrammarAccess

	def dispatch void format(EventObjectOneOf1 eventObjectOneOf1, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		eventObjectOneOf1.eventObject.format
	}
	
}
