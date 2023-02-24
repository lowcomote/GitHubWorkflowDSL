/**
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.RefOneOf0AllOf0;
import githubwf.RefOneOf0AllOf0Abstract;
import githubwf.RefOneOf0AllOf0PropertiesAbstract;
import githubwf.RefOneOf0AllOf0TypeObject;
import githubwf.githubwf.services.RefOneOf0AllOf0GrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class RefOneOf0AllOf0Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RefOneOf0AllOf0GrammarAccess _refOneOf0AllOf0GrammarAccess;
  
  protected void _format(final RefOneOf0AllOf0 refOneOf0AllOf0, @Extension final IFormattableDocument document) {
    document.<RefOneOf0AllOf0Abstract>format(refOneOf0AllOf0.getRef());
  }
  
  protected void _format(final RefOneOf0AllOf0TypeObject refOneOf0AllOf0TypeObject, @Extension final IFormattableDocument document) {
    EList<RefOneOf0AllOf0PropertiesAbstract> _ref = refOneOf0AllOf0TypeObject.getRef();
    for (final RefOneOf0AllOf0PropertiesAbstract refOneOf0AllOf0PropertiesAbstract : _ref) {
      document.<RefOneOf0AllOf0PropertiesAbstract>format(refOneOf0AllOf0PropertiesAbstract);
    }
  }
  
  public void format(final Object refOneOf0AllOf0TypeObject, final IFormattableDocument document) {
    if (refOneOf0AllOf0TypeObject instanceof XtextResource) {
      _format((XtextResource)refOneOf0AllOf0TypeObject, document);
      return;
    } else if (refOneOf0AllOf0TypeObject instanceof RefOneOf0AllOf0TypeObject) {
      _format((RefOneOf0AllOf0TypeObject)refOneOf0AllOf0TypeObject, document);
      return;
    } else if (refOneOf0AllOf0TypeObject instanceof RefOneOf0AllOf0) {
      _format((RefOneOf0AllOf0)refOneOf0AllOf0TypeObject, document);
      return;
    } else if (refOneOf0AllOf0TypeObject instanceof EObject) {
      _format((EObject)refOneOf0AllOf0TypeObject, document);
      return;
    } else if (refOneOf0AllOf0TypeObject == null) {
      _format((Void)null, document);
      return;
    } else if (refOneOf0AllOf0TypeObject != null) {
      _format(refOneOf0AllOf0TypeObject, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(refOneOf0AllOf0TypeObject, document).toString());
    }
  }
}
