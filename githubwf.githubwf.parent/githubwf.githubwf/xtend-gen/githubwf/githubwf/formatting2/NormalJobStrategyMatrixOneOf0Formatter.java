/**
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.NormalJobStrategyMatrixOneOf0;
import githubwf.NormalJobStrategyMatrixOneOf0AdditionalProperties;
import githubwf.NormalJobStrategyMatrixOneOf0PropertiesAbstract;
import githubwf.githubwf.services.NormalJobStrategyMatrixOneOf0GrammarAccess;
import java.util.Arrays;
import jsonMM.JsonDocument;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class NormalJobStrategyMatrixOneOf0Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private NormalJobStrategyMatrixOneOf0GrammarAccess _normalJobStrategyMatrixOneOf0GrammarAccess;

  protected void _format(final NormalJobStrategyMatrixOneOf0 normalJobStrategyMatrixOneOf0, @Extension final IFormattableDocument document) {
    EList<NormalJobStrategyMatrixOneOf0PropertiesAbstract> _matrix = normalJobStrategyMatrixOneOf0.getMatrix();
    for (final NormalJobStrategyMatrixOneOf0PropertiesAbstract normalJobStrategyMatrixOneOf0PropertiesAbstract : _matrix) {
      document.<NormalJobStrategyMatrixOneOf0PropertiesAbstract>format(normalJobStrategyMatrixOneOf0PropertiesAbstract);
    }
  }

  protected void _format(final NormalJobStrategyMatrixOneOf0AdditionalProperties normalJobStrategyMatrixOneOf0AdditionalProperties, @Extension final IFormattableDocument document) {
    document.<JsonDocument>format(normalJobStrategyMatrixOneOf0AdditionalProperties.getAdditionalProperties());
  }

  public void format(final Object normalJobStrategyMatrixOneOf0AdditionalProperties, final IFormattableDocument document) {
    if (normalJobStrategyMatrixOneOf0AdditionalProperties instanceof XtextResource) {
      _format((XtextResource)normalJobStrategyMatrixOneOf0AdditionalProperties, document);
      return;
    } else if (normalJobStrategyMatrixOneOf0AdditionalProperties instanceof NormalJobStrategyMatrixOneOf0AdditionalProperties) {
      _format((NormalJobStrategyMatrixOneOf0AdditionalProperties)normalJobStrategyMatrixOneOf0AdditionalProperties, document);
      return;
    } else if (normalJobStrategyMatrixOneOf0AdditionalProperties instanceof NormalJobStrategyMatrixOneOf0) {
      _format((NormalJobStrategyMatrixOneOf0)normalJobStrategyMatrixOneOf0AdditionalProperties, document);
      return;
    } else if (normalJobStrategyMatrixOneOf0AdditionalProperties instanceof EObject) {
      _format((EObject)normalJobStrategyMatrixOneOf0AdditionalProperties, document);
      return;
    } else if (normalJobStrategyMatrixOneOf0AdditionalProperties == null) {
      _format((Void)null, document);
      return;
    } else if (normalJobStrategyMatrixOneOf0AdditionalProperties != null) {
      _format(normalJobStrategyMatrixOneOf0AdditionalProperties, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(normalJobStrategyMatrixOneOf0AdditionalProperties, document).toString());
    }
  }
}
