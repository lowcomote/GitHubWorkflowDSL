/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ui.tests;

import com.google.inject.Injector;
import githubwf.githubwf.ui.internal.GithubwfActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ConfigurationOneOf2UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GithubwfActivator.getInstance().getInjector("githubwf.githubwf.ConfigurationOneOf2");
	}

}
