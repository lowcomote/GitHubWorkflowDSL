/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.RefOneOf0AllOf1RuntimeModule;
import githubwf.githubwf.RefOneOf0AllOf1StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class RefOneOf0AllOf1IdeSetup extends RefOneOf0AllOf1StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new RefOneOf0AllOf1RuntimeModule(), new RefOneOf0AllOf1IdeModule()));
	}
	
}
