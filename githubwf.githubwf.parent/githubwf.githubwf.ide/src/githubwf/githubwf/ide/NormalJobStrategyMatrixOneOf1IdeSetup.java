/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.NormalJobStrategyMatrixOneOf1RuntimeModule;
import githubwf.githubwf.NormalJobStrategyMatrixOneOf1StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class NormalJobStrategyMatrixOneOf1IdeSetup extends NormalJobStrategyMatrixOneOf1StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new NormalJobStrategyMatrixOneOf1RuntimeModule(), new NormalJobStrategyMatrixOneOf1IdeModule()));
	}
	
}
