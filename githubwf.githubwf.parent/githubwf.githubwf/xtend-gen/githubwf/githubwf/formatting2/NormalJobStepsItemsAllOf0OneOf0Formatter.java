/**
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.NormalJobStepsItemsAllOf0OneOf0;
import githubwf.NormalJobStepsItemsAllOf0OneOf0AdditionalProperties;
import githubwf.NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract;
import githubwf.githubwf.services.NormalJobStepsItemsAllOf0OneOf0GrammarAccess;
import java.util.Arrays;
import jsonMM.JsonDocument;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class NormalJobStepsItemsAllOf0OneOf0Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private NormalJobStepsItemsAllOf0OneOf0GrammarAccess _normalJobStepsItemsAllOf0OneOf0GrammarAccess;
  
  protected void _format(final NormalJobStepsItemsAllOf0OneOf0 normalJobStepsItemsAllOf0OneOf0, @Extension final IFormattableDocument document) {
    EList<NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract> _items = normalJobStepsItemsAllOf0OneOf0.getItems();
    for (final NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract normalJobStepsItemsAllOf0OneOf0PropertiesAbstract : _items) {
      document.<NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract>format(normalJobStepsItemsAllOf0OneOf0PropertiesAbstract);
    }
  }
  
  protected void _format(final NormalJobStepsItemsAllOf0OneOf0AdditionalProperties normalJobStepsItemsAllOf0OneOf0AdditionalProperties, @Extension final IFormattableDocument document) {
    document.<JsonDocument>format(normalJobStepsItemsAllOf0OneOf0AdditionalProperties.getAdditionalProperties());
  }
  
  public void format(final Object normalJobStepsItemsAllOf0OneOf0AdditionalProperties, final IFormattableDocument document) {
    if (normalJobStepsItemsAllOf0OneOf0AdditionalProperties instanceof XtextResource) {
      _format((XtextResource)normalJobStepsItemsAllOf0OneOf0AdditionalProperties, document);
      return;
    } else if (normalJobStepsItemsAllOf0OneOf0AdditionalProperties instanceof NormalJobStepsItemsAllOf0OneOf0AdditionalProperties) {
      _format((NormalJobStepsItemsAllOf0OneOf0AdditionalProperties)normalJobStepsItemsAllOf0OneOf0AdditionalProperties, document);
      return;
    } else if (normalJobStepsItemsAllOf0OneOf0AdditionalProperties instanceof NormalJobStepsItemsAllOf0OneOf0) {
      _format((NormalJobStepsItemsAllOf0OneOf0)normalJobStepsItemsAllOf0OneOf0AdditionalProperties, document);
      return;
    } else if (normalJobStepsItemsAllOf0OneOf0AdditionalProperties instanceof EObject) {
      _format((EObject)normalJobStepsItemsAllOf0OneOf0AdditionalProperties, document);
      return;
    } else if (normalJobStepsItemsAllOf0OneOf0AdditionalProperties == null) {
      _format((Void)null, document);
      return;
    } else if (normalJobStepsItemsAllOf0OneOf0AdditionalProperties != null) {
      _format(normalJobStepsItemsAllOf0OneOf0AdditionalProperties, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(normalJobStepsItemsAllOf0OneOf0AdditionalProperties, document).toString());
    }
  }
}