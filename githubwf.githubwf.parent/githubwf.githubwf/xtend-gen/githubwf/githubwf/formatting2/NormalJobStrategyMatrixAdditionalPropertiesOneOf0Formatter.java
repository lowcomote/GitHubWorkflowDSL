/**
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.Configuration;
import githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0;
import githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items;
import githubwf.githubwf.services.NormalJobStrategyMatrixAdditionalPropertiesOneOf0GrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class NormalJobStrategyMatrixAdditionalPropertiesOneOf0Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private NormalJobStrategyMatrixAdditionalPropertiesOneOf0GrammarAccess _normalJobStrategyMatrixAdditionalPropertiesOneOf0GrammarAccess;
  
  protected void _format(final NormalJobStrategyMatrixAdditionalPropertiesOneOf0 normalJobStrategyMatrixAdditionalPropertiesOneOf0, @Extension final IFormattableDocument document) {
    EList<NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items> _additionalProperties = normalJobStrategyMatrixAdditionalPropertiesOneOf0.getAdditionalProperties();
    for (final NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items normalJobStrategyMatrixAdditionalPropertiesOneOf0Items : _additionalProperties) {
      document.<NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items>format(normalJobStrategyMatrixAdditionalPropertiesOneOf0Items);
    }
  }
  
  protected void _format(final NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items normalJobStrategyMatrixAdditionalPropertiesOneOf0Items, @Extension final IFormattableDocument document) {
    document.<Configuration>format(normalJobStrategyMatrixAdditionalPropertiesOneOf0Items.getItems());
  }
  
  public void format(final Object normalJobStrategyMatrixAdditionalPropertiesOneOf0, final IFormattableDocument document) {
    if (normalJobStrategyMatrixAdditionalPropertiesOneOf0 instanceof XtextResource) {
      _format((XtextResource)normalJobStrategyMatrixAdditionalPropertiesOneOf0, document);
      return;
    } else if (normalJobStrategyMatrixAdditionalPropertiesOneOf0 instanceof NormalJobStrategyMatrixAdditionalPropertiesOneOf0) {
      _format((NormalJobStrategyMatrixAdditionalPropertiesOneOf0)normalJobStrategyMatrixAdditionalPropertiesOneOf0, document);
      return;
    } else if (normalJobStrategyMatrixAdditionalPropertiesOneOf0 instanceof NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items) {
      _format((NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items)normalJobStrategyMatrixAdditionalPropertiesOneOf0, document);
      return;
    } else if (normalJobStrategyMatrixAdditionalPropertiesOneOf0 instanceof EObject) {
      _format((EObject)normalJobStrategyMatrixAdditionalPropertiesOneOf0, document);
      return;
    } else if (normalJobStrategyMatrixAdditionalPropertiesOneOf0 == null) {
      _format((Void)null, document);
      return;
    } else if (normalJobStrategyMatrixAdditionalPropertiesOneOf0 != null) {
      _format(normalJobStrategyMatrixAdditionalPropertiesOneOf0, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(normalJobStrategyMatrixAdditionalPropertiesOneOf0, document).toString());
    }
  }
}
