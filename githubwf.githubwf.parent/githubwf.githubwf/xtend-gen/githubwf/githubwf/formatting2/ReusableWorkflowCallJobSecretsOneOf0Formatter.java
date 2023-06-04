/**
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.Env;
import githubwf.EnvAbstract;
import githubwf.ReusableWorkflowCallJobSecretsOneOf0;
import githubwf.githubwf.services.ReusableWorkflowCallJobSecretsOneOf0GrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ReusableWorkflowCallJobSecretsOneOf0Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ReusableWorkflowCallJobSecretsOneOf0GrammarAccess _reusableWorkflowCallJobSecretsOneOf0GrammarAccess;

  protected void _format(final ReusableWorkflowCallJobSecretsOneOf0 reusableWorkflowCallJobSecretsOneOf0, @Extension final IFormattableDocument document) {
    document.<Env>format(reusableWorkflowCallJobSecretsOneOf0.getSecrets());
  }

  protected void _format(final Env env, @Extension final IFormattableDocument document) {
    document.<EnvAbstract>format(env.getEnv());
  }

  public void format(final Object env, final IFormattableDocument document) {
    if (env instanceof XtextResource) {
      _format((XtextResource)env, document);
      return;
    } else if (env instanceof Env) {
      _format((Env)env, document);
      return;
    } else if (env instanceof ReusableWorkflowCallJobSecretsOneOf0) {
      _format((ReusableWorkflowCallJobSecretsOneOf0)env, document);
      return;
    } else if (env instanceof EObject) {
      _format((EObject)env, document);
      return;
    } else if (env == null) {
      _format((Void)null, document);
      return;
    } else if (env != null) {
      _format(env, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(env, document).toString());
    }
  }
}
