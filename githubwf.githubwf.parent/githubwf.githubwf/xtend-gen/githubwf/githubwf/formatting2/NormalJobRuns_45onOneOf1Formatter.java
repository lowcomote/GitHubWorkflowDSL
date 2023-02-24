/**
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.NormalJobRuns_45onOneOf1;
import githubwf.NormalJobRuns_45onOneOf1Items;
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1GrammarAccess;
import java.util.Arrays;
import jsonMM.JsonDocument;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class NormalJobRuns_45onOneOf1Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private NormalJobRuns_45onOneOf1GrammarAccess _normalJobRuns_45onOneOf1GrammarAccess;
  
  protected void _format(final NormalJobRuns_45onOneOf1 normalJobRuns_45onOneOf1, @Extension final IFormattableDocument document) {
    EList<NormalJobRuns_45onOneOf1Items> _runs_45on = normalJobRuns_45onOneOf1.getRuns_45on();
    for (final NormalJobRuns_45onOneOf1Items normalJobRuns_45onOneOf1Items : _runs_45on) {
      document.<NormalJobRuns_45onOneOf1Items>format(normalJobRuns_45onOneOf1Items);
    }
  }
  
  protected void _format(final NormalJobRuns_45onOneOf1Items normalJobRuns_45onOneOf1Items, @Extension final IFormattableDocument document) {
    document.<JsonDocument>format(normalJobRuns_45onOneOf1Items.getItems());
  }
  
  public void format(final Object normalJobRuns_45onOneOf1, final IFormattableDocument document) {
    if (normalJobRuns_45onOneOf1 instanceof XtextResource) {
      _format((XtextResource)normalJobRuns_45onOneOf1, document);
      return;
    } else if (normalJobRuns_45onOneOf1 instanceof NormalJobRuns_45onOneOf1) {
      _format((NormalJobRuns_45onOneOf1)normalJobRuns_45onOneOf1, document);
      return;
    } else if (normalJobRuns_45onOneOf1 instanceof NormalJobRuns_45onOneOf1Items) {
      _format((NormalJobRuns_45onOneOf1Items)normalJobRuns_45onOneOf1, document);
      return;
    } else if (normalJobRuns_45onOneOf1 instanceof EObject) {
      _format((EObject)normalJobRuns_45onOneOf1, document);
      return;
    } else if (normalJobRuns_45onOneOf1 == null) {
      _format((Void)null, document);
      return;
    } else if (normalJobRuns_45onOneOf1 != null) {
      _format(normalJobRuns_45onOneOf1, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(normalJobRuns_45onOneOf1, document).toString());
    }
  }
}
