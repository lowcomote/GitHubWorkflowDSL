/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.RefOneOf0AllOf2NotRuntimeModule;
import githubwf.githubwf.RefOneOf0AllOf2NotStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class RefOneOf0AllOf2NotIdeSetup extends RefOneOf0AllOf2NotStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new RefOneOf0AllOf2NotRuntimeModule(), new RefOneOf0AllOf2NotIdeModule()));
	}
	
}
