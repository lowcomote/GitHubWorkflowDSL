/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenFormatter extends AbstractFormatter2 {
	
	@Inject extension GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenGrammarAccess

	def dispatch void format(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then.patternProperties0.format
	}

	def dispatch void format(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract : githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject.patternProperties0) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract.format
		}
	}
	
	// TODO: implement for GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems
}
