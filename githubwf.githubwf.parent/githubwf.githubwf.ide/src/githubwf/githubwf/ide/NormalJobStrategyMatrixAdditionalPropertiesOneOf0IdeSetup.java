/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0RuntimeModule;
import githubwf.githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class NormalJobStrategyMatrixAdditionalPropertiesOneOf0IdeSetup extends NormalJobStrategyMatrixAdditionalPropertiesOneOf0StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new NormalJobStrategyMatrixAdditionalPropertiesOneOf0RuntimeModule(), new NormalJobStrategyMatrixAdditionalPropertiesOneOf0IdeModule()));
	}
	
}
