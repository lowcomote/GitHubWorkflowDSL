/**
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject;
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenGrammarAccess _githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenGrammarAccess;
  
  protected void _format(final GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then, @Extension final IFormattableDocument document) {
    document.<GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract>format(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then.getPatternProperties0());
  }
  
  protected void _format(final GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject, @Extension final IFormattableDocument document) {
    EList<GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract> _patternProperties0 = githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject.getPatternProperties0();
    for (final GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract : _patternProperties0) {
      document.<GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract>format(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract);
    }
  }
  
  public void format(final Object githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject, final IFormattableDocument document) {
    if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject instanceof XtextResource) {
      _format((XtextResource)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject instanceof GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject) {
      _format((GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject instanceof GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then) {
      _format((GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject instanceof EObject) {
      _format((EObject)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject == null) {
      _format((Void)null, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject != null) {
      _format(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject, document).toString());
    }
  }
}