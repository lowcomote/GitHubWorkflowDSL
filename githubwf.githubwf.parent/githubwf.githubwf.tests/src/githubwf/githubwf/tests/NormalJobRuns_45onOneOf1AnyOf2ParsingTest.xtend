/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.tests

import com.google.inject.Inject
import githubwf.NormalJobRuns_45onOneOf1AnyOf2
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(NormalJobRuns_45onOneOf1AnyOf2InjectorProvider)
class NormalJobRuns_45onOneOf1AnyOf2ParsingTest {
	@Inject
	ParseHelper<NormalJobRuns_45onOneOf1AnyOf2> parseHelper
	
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
