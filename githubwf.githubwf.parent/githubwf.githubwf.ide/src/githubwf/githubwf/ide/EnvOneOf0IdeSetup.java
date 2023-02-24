/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.EnvOneOf0RuntimeModule;
import githubwf.githubwf.EnvOneOf0StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class EnvOneOf0IdeSetup extends EnvOneOf0StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new EnvOneOf0RuntimeModule(), new EnvOneOf0IdeModule()));
	}
	
}
