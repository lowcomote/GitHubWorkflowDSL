/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0RuntimeModule;
import githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0IdeSetup extends ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0RuntimeModule(), new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0IdeModule()));
	}
	
}
