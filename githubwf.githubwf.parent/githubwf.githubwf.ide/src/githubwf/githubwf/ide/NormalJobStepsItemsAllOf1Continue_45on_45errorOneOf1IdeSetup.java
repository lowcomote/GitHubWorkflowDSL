/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1RuntimeModule;
import githubwf.githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1IdeSetup extends NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1RuntimeModule(), new NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1IdeModule()));
	}
	
}
