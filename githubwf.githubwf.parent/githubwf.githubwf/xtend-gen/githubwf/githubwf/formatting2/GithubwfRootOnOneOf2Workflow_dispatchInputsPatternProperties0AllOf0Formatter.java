/**
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Abstract;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject;
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0GrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0GrammarAccess _githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0GrammarAccess;
  
  protected void _format(final GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0 githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0, @Extension final IFormattableDocument document) {
    document.<GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Abstract>format(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0.getPatternProperties0());
  }
  
  protected void _format(final GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject, @Extension final IFormattableDocument document) {
    EList<GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract> _patternProperties0 = githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject.getPatternProperties0();
    for (final GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract : _patternProperties0) {
      document.<GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract>format(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract);
    }
  }
  
  public void format(final Object githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject, final IFormattableDocument document) {
    if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject instanceof XtextResource) {
      _format((XtextResource)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject instanceof GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject) {
      _format((GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject instanceof GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0) {
      _format((GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject instanceof EObject) {
      _format((EObject)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject == null) {
      _format((Void)null, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject != null) {
      _format(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject, document).toString());
    }
  }
}
