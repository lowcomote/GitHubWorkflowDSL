/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.ReusableWorkflowCallJobConcurrencyOneOf0RuntimeModule;
import githubwf.githubwf.ReusableWorkflowCallJobConcurrencyOneOf0StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ReusableWorkflowCallJobConcurrencyOneOf0IdeSetup extends ReusableWorkflowCallJobConcurrencyOneOf0StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ReusableWorkflowCallJobConcurrencyOneOf0RuntimeModule(), new ReusableWorkflowCallJobConcurrencyOneOf0IdeModule()));
	}
	
}
