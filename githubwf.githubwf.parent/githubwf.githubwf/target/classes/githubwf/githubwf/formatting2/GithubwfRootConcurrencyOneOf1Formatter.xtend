/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.Concurrency
import githubwf.GithubwfRootConcurrencyOneOf1
import githubwf.githubwf.services.GithubwfRootConcurrencyOneOf1GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class GithubwfRootConcurrencyOneOf1Formatter extends AbstractFormatter2 {
	
	@Inject extension GithubwfRootConcurrencyOneOf1GrammarAccess

	def dispatch void format(GithubwfRootConcurrencyOneOf1 githubwfRootConcurrencyOneOf1, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		githubwfRootConcurrencyOneOf1.concurrency.format
	}

	def dispatch void format(Concurrency concurrency, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (concurrencyPropertiesAbstract : concurrency.concurrency) {
			concurrencyPropertiesAbstract.format
		}
	}
	
	// TODO: implement for ConcurrencyCancel_45in_45progress, ConcurrencyCancel_45in_45progressTypeObject, ConcurrencyCancel_45in_45progressTypeArray, ConcurrencyCancel_45in_45progressTypeNull, ConcurrencyCancel_45in_45progressAdditionalProperties, JsonDocument, ArrayValue, ObjectValue, KeyValuePair, ConcurrencyCancel_45in_45progressItems
}