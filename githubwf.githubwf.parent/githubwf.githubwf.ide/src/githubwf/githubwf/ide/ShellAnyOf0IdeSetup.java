/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.ShellAnyOf0RuntimeModule;
import githubwf.githubwf.ShellAnyOf0StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ShellAnyOf0IdeSetup extends ShellAnyOf0StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ShellAnyOf0RuntimeModule(), new ShellAnyOf0IdeModule()));
	}
	
}
