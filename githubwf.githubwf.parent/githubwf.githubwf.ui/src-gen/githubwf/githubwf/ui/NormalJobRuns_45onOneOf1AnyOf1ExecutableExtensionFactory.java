/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ui;

import com.google.inject.Injector;
import githubwf.githubwf.ui.internal.GithubwfActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class NormalJobRuns_45onOneOf1AnyOf1ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(GithubwfActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		GithubwfActivator activator = GithubwfActivator.getInstance();
		return activator != null ? activator.getInjector(GithubwfActivator.GITHUBWF_GITHUBWF_NORMALJOBRUNS_45ONONEOF1ANYOF1) : null;
	}

}
