/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfFormatter extends AbstractFormatter2 {
	
	@Inject extension GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfGrammarAccess

	def dispatch void format(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If.patternProperties0.format
	}

	def dispatch void format(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract : githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject.patternProperties0) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract.format
		}
	}
	
	// TODO: implement for GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems
}
