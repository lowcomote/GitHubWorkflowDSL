/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.EnvOneOf1RuntimeModule;
import githubwf.githubwf.EnvOneOf1StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class EnvOneOf1IdeSetup extends EnvOneOf1StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new EnvOneOf1RuntimeModule(), new EnvOneOf1IdeModule()));
	}
	
}
