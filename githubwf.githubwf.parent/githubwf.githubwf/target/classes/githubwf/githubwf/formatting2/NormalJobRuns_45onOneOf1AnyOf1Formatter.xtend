/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.NormalJobRuns_45onOneOf1AnyOf1
import githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeObject
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1AnyOf1GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class NormalJobRuns_45onOneOf1AnyOf1Formatter extends AbstractFormatter2 {
	
	@Inject extension NormalJobRuns_45onOneOf1AnyOf1GrammarAccess

	def dispatch void format(NormalJobRuns_45onOneOf1AnyOf1 normalJobRuns_45onOneOf1AnyOf1, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		normalJobRuns_45onOneOf1AnyOf1.runs_45on.format
	}

	def dispatch void format(NormalJobRuns_45onOneOf1AnyOf1TypeObject normalJobRuns_45onOneOf1AnyOf1TypeObject, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (normalJobRuns_45onOneOf1AnyOf1PropertiesAbstract : normalJobRuns_45onOneOf1AnyOf1TypeObject.runs_45on) {
			normalJobRuns_45onOneOf1AnyOf1PropertiesAbstract.format
		}
	}
	
	// TODO: implement for NormalJobRuns_45onOneOf1AnyOf1TypeArray, NormalJobRuns_45onOneOf1AnyOf1TypeNull, NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, NormalJobRuns_45onOneOf1AnyOf1Tuple, NormalJobRuns_45onOneOf1AnyOf1Items0, NormalJobRuns_45onOneOf1AnyOf1Items1, Machine
}
