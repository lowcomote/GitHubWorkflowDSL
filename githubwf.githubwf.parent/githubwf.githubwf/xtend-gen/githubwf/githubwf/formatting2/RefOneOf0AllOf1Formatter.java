/**
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.RefOneOf0AllOf1;
import githubwf.RefOneOf0AllOf1Abstract;
import githubwf.RefOneOf0AllOf1PropertiesAbstract;
import githubwf.RefOneOf0AllOf1TypeObject;
import githubwf.githubwf.services.RefOneOf0AllOf1GrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class RefOneOf0AllOf1Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RefOneOf0AllOf1GrammarAccess _refOneOf0AllOf1GrammarAccess;

  protected void _format(final RefOneOf0AllOf1 refOneOf0AllOf1, @Extension final IFormattableDocument document) {
    document.<RefOneOf0AllOf1Abstract>format(refOneOf0AllOf1.getRef());
  }

  protected void _format(final RefOneOf0AllOf1TypeObject refOneOf0AllOf1TypeObject, @Extension final IFormattableDocument document) {
    EList<RefOneOf0AllOf1PropertiesAbstract> _ref = refOneOf0AllOf1TypeObject.getRef();
    for (final RefOneOf0AllOf1PropertiesAbstract refOneOf0AllOf1PropertiesAbstract : _ref) {
      document.<RefOneOf0AllOf1PropertiesAbstract>format(refOneOf0AllOf1PropertiesAbstract);
    }
  }

  public void format(final Object refOneOf0AllOf1TypeObject, final IFormattableDocument document) {
    if (refOneOf0AllOf1TypeObject instanceof XtextResource) {
      _format((XtextResource)refOneOf0AllOf1TypeObject, document);
      return;
    } else if (refOneOf0AllOf1TypeObject instanceof RefOneOf0AllOf1TypeObject) {
      _format((RefOneOf0AllOf1TypeObject)refOneOf0AllOf1TypeObject, document);
      return;
    } else if (refOneOf0AllOf1TypeObject instanceof RefOneOf0AllOf1) {
      _format((RefOneOf0AllOf1)refOneOf0AllOf1TypeObject, document);
      return;
    } else if (refOneOf0AllOf1TypeObject instanceof EObject) {
      _format((EObject)refOneOf0AllOf1TypeObject, document);
      return;
    } else if (refOneOf0AllOf1TypeObject == null) {
      _format((Void)null, document);
      return;
    } else if (refOneOf0AllOf1TypeObject != null) {
      _format(refOneOf0AllOf1TypeObject, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(refOneOf0AllOf1TypeObject, document).toString());
    }
  }
}
