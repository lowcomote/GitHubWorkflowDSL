/**
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.JobNeedsOneOf1;
import githubwf.Name;
import githubwf.githubwf.services.JobNeedsOneOf1GrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class JobNeedsOneOf1Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private JobNeedsOneOf1GrammarAccess _jobNeedsOneOf1GrammarAccess;
  
  protected void _format(final JobNeedsOneOf1 jobNeedsOneOf1, @Extension final IFormattableDocument document) {
    document.<Name>format(jobNeedsOneOf1.getJobNeeds());
  }
  
  public void format(final Object jobNeedsOneOf1, final IFormattableDocument document) {
    if (jobNeedsOneOf1 instanceof XtextResource) {
      _format((XtextResource)jobNeedsOneOf1, document);
      return;
    } else if (jobNeedsOneOf1 instanceof JobNeedsOneOf1) {
      _format((JobNeedsOneOf1)jobNeedsOneOf1, document);
      return;
    } else if (jobNeedsOneOf1 instanceof EObject) {
      _format((EObject)jobNeedsOneOf1, document);
      return;
    } else if (jobNeedsOneOf1 == null) {
      _format((Void)null, document);
      return;
    } else if (jobNeedsOneOf1 != null) {
      _format(jobNeedsOneOf1, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(jobNeedsOneOf1, document).toString());
    }
  }
}
