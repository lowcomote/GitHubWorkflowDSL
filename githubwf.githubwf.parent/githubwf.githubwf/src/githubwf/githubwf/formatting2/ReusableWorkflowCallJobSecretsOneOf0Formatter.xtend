/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.Env
import githubwf.ReusableWorkflowCallJobSecretsOneOf0
import githubwf.githubwf.services.ReusableWorkflowCallJobSecretsOneOf0GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ReusableWorkflowCallJobSecretsOneOf0Formatter extends AbstractFormatter2 {
	
	@Inject extension ReusableWorkflowCallJobSecretsOneOf0GrammarAccess

	def dispatch void format(ReusableWorkflowCallJobSecretsOneOf0 reusableWorkflowCallJobSecretsOneOf0, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		reusableWorkflowCallJobSecretsOneOf0.secrets.format
	}

	def dispatch void format(Env env, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		env.env.format
	}
	
	// TODO: implement for EnvTypeObject, EnvTypeArray, EnvTypeNull, EnvAdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, EnvItems
}