/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.NormalJobRuns_45onOneOf0
import githubwf.githubwf.services.NormalJobRuns_45onOneOf0GrammarAccess
import jsonMM.JsonDocument
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class NormalJobRuns_45onOneOf0Formatter extends AbstractFormatter2 {
	
	@Inject extension NormalJobRuns_45onOneOf0GrammarAccess

	def dispatch void format(NormalJobRuns_45onOneOf0 normalJobRuns_45onOneOf0, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		normalJobRuns_45onOneOf0.runs_45on.format
	}

	def dispatch void format(JsonDocument jsonDocument, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		jsonDocument.value.format
	}
	
	// TODO: implement for ArrayValue, ObjectValue, KeyValuePair
}