/**
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.GithubwfRoot;
import githubwf.GithubwfRootOn;
import githubwf.GithubwfRootOnAbstract;
import githubwf.GithubwfRootPropertiesAbstract;
import githubwf.githubwf.services.GithubwfGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GithubwfFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GithubwfGrammarAccess _githubwfGrammarAccess;

  protected void _format(final GithubwfRoot githubwfRoot, @Extension final IFormattableDocument document) {
    EList<GithubwfRootPropertiesAbstract> _githubwfRoot = githubwfRoot.getGithubwfRoot();
    for (final GithubwfRootPropertiesAbstract githubwfRootPropertiesAbstract : _githubwfRoot) {
      document.<GithubwfRootPropertiesAbstract>format(githubwfRootPropertiesAbstract);
    }
  }

  protected void _format(final GithubwfRootOn githubwfRootOn, @Extension final IFormattableDocument document) {
    document.<GithubwfRootOnAbstract>format(githubwfRootOn.getOn());
  }

  public void format(final Object githubwfRootOn, final IFormattableDocument document) {
    if (githubwfRootOn instanceof XtextResource) {
      _format((XtextResource)githubwfRootOn, document);
      return;
    } else if (githubwfRootOn instanceof GithubwfRootOn) {
      _format((GithubwfRootOn)githubwfRootOn, document);
      return;
    } else if (githubwfRootOn instanceof GithubwfRoot) {
      _format((GithubwfRoot)githubwfRootOn, document);
      return;
    } else if (githubwfRootOn instanceof EObject) {
      _format((EObject)githubwfRootOn, document);
      return;
    } else if (githubwfRootOn == null) {
      _format((Void)null, document);
      return;
    } else if (githubwfRootOn != null) {
      _format(githubwfRootOn, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(githubwfRootOn, document).toString());
    }
  }
}
