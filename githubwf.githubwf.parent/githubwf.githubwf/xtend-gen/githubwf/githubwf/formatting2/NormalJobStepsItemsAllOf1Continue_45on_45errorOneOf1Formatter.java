/**
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.ExpressionSyntax;
import githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1;
import githubwf.githubwf.services.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess _normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1GrammarAccess;

  protected void _format(final NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1, @Extension final IFormattableDocument document) {
    document.<ExpressionSyntax>format(normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1.getContinue_45on_45error());
  }

  public void format(final Object normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1, final IFormattableDocument document) {
    if (normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 instanceof XtextResource) {
      _format((XtextResource)normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1, document);
      return;
    } else if (normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 instanceof NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1) {
      _format((NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1)normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1, document);
      return;
    } else if (normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 instanceof EObject) {
      _format((EObject)normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1, document);
      return;
    } else if (normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 == null) {
      _format((Void)null, document);
      return;
    } else if (normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 != null) {
      _format(normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1, document).toString());
    }
  }
}
