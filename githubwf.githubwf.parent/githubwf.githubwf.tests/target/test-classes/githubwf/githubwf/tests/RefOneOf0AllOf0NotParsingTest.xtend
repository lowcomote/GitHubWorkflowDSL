/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.tests

import com.google.inject.Inject
import githubwf.RefOneOf0AllOf0Not
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(RefOneOf0AllOf0NotInjectorProvider)
class RefOneOf0AllOf0NotParsingTest {
	@Inject
	ParseHelper<RefOneOf0AllOf0Not> parseHelper
	
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