/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.NormalJobEnvironmentOneOf0RuntimeModule;
import githubwf.githubwf.NormalJobEnvironmentOneOf0StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class NormalJobEnvironmentOneOf0IdeSetup extends NormalJobEnvironmentOneOf0StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new NormalJobEnvironmentOneOf0RuntimeModule(), new NormalJobEnvironmentOneOf0IdeModule()));
	}
	
}
