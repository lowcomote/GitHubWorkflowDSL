/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2

import com.google.inject.Inject
import githubwf.JobNeedsOneOf0
import githubwf.JobNeedsOneOf0Items
import githubwf.githubwf.services.JobNeedsOneOf0GrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class JobNeedsOneOf0Formatter extends AbstractFormatter2 {
	
	@Inject extension JobNeedsOneOf0GrammarAccess

	def dispatch void format(JobNeedsOneOf0 jobNeedsOneOf0, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (jobNeedsOneOf0Items : jobNeedsOneOf0.jobNeeds) {
			jobNeedsOneOf0Items.format
		}
	}

	def dispatch void format(JobNeedsOneOf0Items jobNeedsOneOf0Items, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		jobNeedsOneOf0Items.items.format
	}
	
}
