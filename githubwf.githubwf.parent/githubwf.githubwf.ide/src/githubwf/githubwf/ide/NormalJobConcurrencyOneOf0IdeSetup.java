/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.NormalJobConcurrencyOneOf0RuntimeModule;
import githubwf.githubwf.NormalJobConcurrencyOneOf0StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class NormalJobConcurrencyOneOf0IdeSetup extends NormalJobConcurrencyOneOf0StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new NormalJobConcurrencyOneOf0RuntimeModule(), new NormalJobConcurrencyOneOf0IdeModule()));
	}
	
}