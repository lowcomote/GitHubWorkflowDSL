/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfFormatter extends AbstractFormatter2 {
	
	@Inject extension GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess

	def dispatch void format(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.patternProperties0.format
	}

	def dispatch void format(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract : githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject.patternProperties0) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract.format
		}
	}
	
	// TODO: implement for GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems
}
