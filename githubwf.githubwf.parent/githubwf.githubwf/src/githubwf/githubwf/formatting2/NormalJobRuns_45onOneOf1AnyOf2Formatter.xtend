/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.NormalJobRuns_45onOneOf1AnyOf2
import githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeObject
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1AnyOf2GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class NormalJobRuns_45onOneOf1AnyOf2Formatter extends AbstractFormatter2 {
	
	@Inject extension NormalJobRuns_45onOneOf1AnyOf2GrammarAccess

	def dispatch void format(NormalJobRuns_45onOneOf1AnyOf2 normalJobRuns_45onOneOf1AnyOf2, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		normalJobRuns_45onOneOf1AnyOf2.runs_45on.format
	}

	def dispatch void format(NormalJobRuns_45onOneOf1AnyOf2TypeObject normalJobRuns_45onOneOf1AnyOf2TypeObject, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (normalJobRuns_45onOneOf1AnyOf2PropertiesAbstract : normalJobRuns_45onOneOf1AnyOf2TypeObject.runs_45on) {
			normalJobRuns_45onOneOf1AnyOf2PropertiesAbstract.format
		}
	}
	
	// TODO: implement for NormalJobRuns_45onOneOf1AnyOf2TypeArray, NormalJobRuns_45onOneOf1AnyOf2TypeNull, NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, NormalJobRuns_45onOneOf1AnyOf2Tuple, NormalJobRuns_45onOneOf1AnyOf2Items0, NormalJobRuns_45onOneOf1AnyOf2Items1, Architecture
}