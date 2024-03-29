/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.GithubwfRootOnOneOf1
import githubwf.GithubwfRootOnOneOf1Items
import githubwf.githubwf.services.GithubwfRootOnOneOf1GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class GithubwfRootOnOneOf1Formatter extends AbstractFormatter2 {
	
	@Inject extension GithubwfRootOnOneOf1GrammarAccess

	def dispatch void format(GithubwfRootOnOneOf1 githubwfRootOnOneOf1, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (githubwfRootOnOneOf1Items : githubwfRootOnOneOf1.on) {
			githubwfRootOnOneOf1Items.format
		}
	}

	def dispatch void format(GithubwfRootOnOneOf1Items githubwfRootOnOneOf1Items, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		githubwfRootOnOneOf1Items.items.format
	}
	
	// TODO: implement for Event, JsonDocument, ArrayValue, ObjectValue, KeyValuePair
}
