/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.NormalJobStepsItemsAllOf0RuntimeModule;
import githubwf.githubwf.NormalJobStepsItemsAllOf0StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class NormalJobStepsItemsAllOf0IdeSetup extends NormalJobStepsItemsAllOf0StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new NormalJobStepsItemsAllOf0RuntimeModule(), new NormalJobStepsItemsAllOf0IdeModule()));
	}
	
}