/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.ShellAnyOf1RuntimeModule;
import githubwf.githubwf.ShellAnyOf1StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ShellAnyOf1IdeSetup extends ShellAnyOf1StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ShellAnyOf1RuntimeModule(), new ShellAnyOf1IdeModule()));
	}
	
}