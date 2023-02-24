/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.Container
import githubwf.NormalJobContainerOneOf1
import githubwf.githubwf.services.NormalJobContainerOneOf1GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class NormalJobContainerOneOf1Formatter extends AbstractFormatter2 {
	
	@Inject extension NormalJobContainerOneOf1GrammarAccess

	def dispatch void format(NormalJobContainerOneOf1 normalJobContainerOneOf1, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		normalJobContainerOneOf1.container.format
	}

	def dispatch void format(Container container, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (containerPropertiesAbstract : container.container) {
			containerPropertiesAbstract.format
		}
	}
	
	// TODO: implement for ContainerCredentials, ContainerEnv, ContainerPorts, ContainerVolumes, ContainerCredentialsAdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, Env, EnvTypeObject, EnvTypeArray, EnvTypeNull, EnvAdditionalProperties, EnvItems, ContainerPortsItems, ContainerPortsItemsTypeObject, ContainerPortsItemsTypeArray, ContainerPortsItemsTypeNull, ContainerPortsItemsAdditionalProperties, ContainerPortsItemsItems
}