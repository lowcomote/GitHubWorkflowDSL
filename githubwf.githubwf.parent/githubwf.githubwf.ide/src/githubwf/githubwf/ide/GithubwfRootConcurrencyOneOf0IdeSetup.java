/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.GithubwfRootConcurrencyOneOf0RuntimeModule;
import githubwf.githubwf.GithubwfRootConcurrencyOneOf0StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class GithubwfRootConcurrencyOneOf0IdeSetup extends GithubwfRootConcurrencyOneOf0StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GithubwfRootConcurrencyOneOf0RuntimeModule(), new GithubwfRootConcurrencyOneOf0IdeModule()));
	}
	
}
