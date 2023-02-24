/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.tests

import com.google.inject.Inject
import githubwf.ConfigurationOneOf0
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(ConfigurationOneOf0InjectorProvider)
class ConfigurationOneOf0ParsingTest {
	@Inject
	ParseHelper<ConfigurationOneOf0> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
