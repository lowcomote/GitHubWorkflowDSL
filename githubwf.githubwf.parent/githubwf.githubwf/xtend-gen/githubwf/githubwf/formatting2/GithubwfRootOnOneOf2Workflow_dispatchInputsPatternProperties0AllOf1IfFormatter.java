/**
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject;
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess _githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess;
  
  protected void _format(final GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If, @Extension final IFormattableDocument document) {
    document.<GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract>format(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.getPatternProperties0());
  }
  
  protected void _format(final GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject, @Extension final IFormattableDocument document) {
    EList<GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract> _patternProperties0 = githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject.getPatternProperties0();
    for (final GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract : _patternProperties0) {
      document.<GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract>format(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract);
    }
  }
  
  public void format(final Object githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject, final IFormattableDocument document) {
    if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject instanceof XtextResource) {
      _format((XtextResource)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject instanceof GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject) {
      _format((GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject instanceof GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If) {
      _format((GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject instanceof EObject) {
      _format((EObject)githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject == null) {
      _format((Void)null, document);
      return;
    } else if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject != null) {
      _format(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject, document).toString());
    }
  }
}