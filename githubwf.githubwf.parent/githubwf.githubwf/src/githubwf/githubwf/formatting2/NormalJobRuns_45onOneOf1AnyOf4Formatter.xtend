/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.NormalJobRuns_45onOneOf1AnyOf4
import githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeObject
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1AnyOf4GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class NormalJobRuns_45onOneOf1AnyOf4Formatter extends AbstractFormatter2 {
	
	@Inject extension NormalJobRuns_45onOneOf1AnyOf4GrammarAccess

	def dispatch void format(NormalJobRuns_45onOneOf1AnyOf4 normalJobRuns_45onOneOf1AnyOf4, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		normalJobRuns_45onOneOf1AnyOf4.runs_45on.format
	}

	def dispatch void format(NormalJobRuns_45onOneOf1AnyOf4TypeObject normalJobRuns_45onOneOf1AnyOf4TypeObject, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (normalJobRuns_45onOneOf1AnyOf4PropertiesAbstract : normalJobRuns_45onOneOf1AnyOf4TypeObject.runs_45on) {
			normalJobRuns_45onOneOf1AnyOf4PropertiesAbstract.format
		}
	}
	
	// TODO: implement for NormalJobRuns_45onOneOf1AnyOf4TypeArray, NormalJobRuns_45onOneOf1AnyOf4TypeNull, NormalJobRuns_45onOneOf1AnyOf4AdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, NormalJobRuns_45onOneOf1AnyOf4Tuple, NormalJobRuns_45onOneOf1AnyOf4Items0, NormalJobRuns_45onOneOf1AnyOf4Items1, NormalJobRuns_45onOneOf1AnyOf4Items2, Architecture, Machine
}
