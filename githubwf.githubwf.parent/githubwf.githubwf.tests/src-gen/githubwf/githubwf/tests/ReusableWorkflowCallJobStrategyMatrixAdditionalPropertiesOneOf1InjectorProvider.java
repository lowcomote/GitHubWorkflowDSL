/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.tests;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1RuntimeModule;
import githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1StandaloneSetup;
import org.eclipse.xtext.testing.GlobalRegistries;
import org.eclipse.xtext.testing.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.eclipse.xtext.testing.IRegistryConfigurator;

public class ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1InjectorProvider implements IInjectorProvider, IRegistryConfigurator {

	protected GlobalStateMemento stateBeforeInjectorCreation;
	protected GlobalStateMemento stateAfterInjectorCreation;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}

	@Override
	public Injector getInjector() {
		if (injector == null) {
			this.injector = internalCreateInjector();
			stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		}
		return injector;
	}

	protected Injector internalCreateInjector() {
		return new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1StandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(createRuntimeModule());
			}
		}.createInjectorAndDoEMFRegistration();
	}

	protected ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1RuntimeModule createRuntimeModule() {
		// make it work also with Maven/Tycho and OSGI
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=493672
		return new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1RuntimeModule() {
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1InjectorProvider.class
						.getClassLoader();
			}
		};
	}

	@Override
	public void restoreRegistry() {
		stateBeforeInjectorCreation.restoreGlobalState();
		stateBeforeInjectorCreation = null;
	}

	@Override
	public void setupRegistry() {
		stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		if (injector == null) {
			getInjector();
		}
		stateAfterInjectorCreation.restoreGlobalState();
	}
}
