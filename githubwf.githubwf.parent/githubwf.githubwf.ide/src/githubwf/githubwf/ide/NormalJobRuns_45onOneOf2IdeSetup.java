/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.NormalJobRuns_45onOneOf2RuntimeModule;
import githubwf.githubwf.NormalJobRuns_45onOneOf2StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class NormalJobRuns_45onOneOf2IdeSetup extends NormalJobRuns_45onOneOf2StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new NormalJobRuns_45onOneOf2RuntimeModule(), new NormalJobRuns_45onOneOf2IdeModule()));
	}
	
}
