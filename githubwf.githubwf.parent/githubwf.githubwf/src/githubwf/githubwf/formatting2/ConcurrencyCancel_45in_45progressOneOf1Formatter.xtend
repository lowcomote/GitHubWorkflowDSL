/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.ConcurrencyCancel_45in_45progressOneOf1
import githubwf.githubwf.services.ConcurrencyCancel_45in_45progressOneOf1GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ConcurrencyCancel_45in_45progressOneOf1Formatter extends AbstractFormatter2 {
	
	@Inject extension ConcurrencyCancel_45in_45progressOneOf1GrammarAccess

	def dispatch void format(ConcurrencyCancel_45in_45progressOneOf1 concurrencyCancel_45in_45progressOneOf1, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		concurrencyCancel_45in_45progressOneOf1.cancel_45in_45progress.format
	}
	
}
