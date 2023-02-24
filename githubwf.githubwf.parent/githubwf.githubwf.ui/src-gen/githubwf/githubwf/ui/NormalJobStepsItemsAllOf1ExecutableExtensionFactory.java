/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf.ui;

import com.google.inject.Injector;
import githubwf.githubwf.ui.internal.GithubwfActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class NormalJobStepsItemsAllOf1ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(GithubwfActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		GithubwfActivator activator = GithubwfActivator.getInstance();
		return activator != null ? activator.getInjector(GithubwfActivator.GITHUBWF_GITHUBWF_NORMALJOBSTEPSITEMSALLOF1) : null;
	}

}
