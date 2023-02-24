/**
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0;
import githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties;
import githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract;
import githubwf.githubwf.services.ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess;
import java.util.Arrays;
import jsonMM.JsonDocument;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ReusableWorkflowCallJobStrategyMatrixOneOf0Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess _reusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess;
  
  protected void _format(final ReusableWorkflowCallJobStrategyMatrixOneOf0 reusableWorkflowCallJobStrategyMatrixOneOf0, @Extension final IFormattableDocument document) {
    EList<ReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract> _matrix = reusableWorkflowCallJobStrategyMatrixOneOf0.getMatrix();
    for (final ReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract reusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract : _matrix) {
      document.<ReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract>format(reusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract);
    }
  }
  
  protected void _format(final ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties, @Extension final IFormattableDocument document) {
    document.<JsonDocument>format(reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties.getAdditionalProperties());
  }
  
  public void format(final Object reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties, final IFormattableDocument document) {
    if (reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties instanceof XtextResource) {
      _format((XtextResource)reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties, document);
      return;
    } else if (reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties instanceof ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties) {
      _format((ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties)reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties, document);
      return;
    } else if (reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties instanceof ReusableWorkflowCallJobStrategyMatrixOneOf0) {
      _format((ReusableWorkflowCallJobStrategyMatrixOneOf0)reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties, document);
      return;
    } else if (reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties instanceof EObject) {
      _format((EObject)reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties, document);
      return;
    } else if (reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties == null) {
      _format((Void)null, document);
      return;
    } else if (reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties != null) {
      _format(reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties, document).toString());
    }
  }
}