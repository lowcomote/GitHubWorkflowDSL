/**
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.ExpressionSyntax;
import githubwf.NormalJobContinue_45on_45errorOneOf1;
import githubwf.githubwf.services.NormalJobContinue_45on_45errorOneOf1GrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class NormalJobContinue_45on_45errorOneOf1Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private NormalJobContinue_45on_45errorOneOf1GrammarAccess _normalJobContinue_45on_45errorOneOf1GrammarAccess;

  protected void _format(final NormalJobContinue_45on_45errorOneOf1 normalJobContinue_45on_45errorOneOf1, @Extension final IFormattableDocument document) {
    document.<ExpressionSyntax>format(normalJobContinue_45on_45errorOneOf1.getContinue_45on_45error());
  }

  public void format(final Object normalJobContinue_45on_45errorOneOf1, final IFormattableDocument document) {
    if (normalJobContinue_45on_45errorOneOf1 instanceof XtextResource) {
      _format((XtextResource)normalJobContinue_45on_45errorOneOf1, document);
      return;
    } else if (normalJobContinue_45on_45errorOneOf1 instanceof NormalJobContinue_45on_45errorOneOf1) {
      _format((NormalJobContinue_45on_45errorOneOf1)normalJobContinue_45on_45errorOneOf1, document);
      return;
    } else if (normalJobContinue_45on_45errorOneOf1 instanceof EObject) {
      _format((EObject)normalJobContinue_45on_45errorOneOf1, document);
      return;
    } else if (normalJobContinue_45on_45errorOneOf1 == null) {
      _format((Void)null, document);
      return;
    } else if (normalJobContinue_45on_45errorOneOf1 != null) {
      _format(normalJobContinue_45on_45errorOneOf1, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(normalJobContinue_45on_45errorOneOf1, document).toString());
    }
  }
}
