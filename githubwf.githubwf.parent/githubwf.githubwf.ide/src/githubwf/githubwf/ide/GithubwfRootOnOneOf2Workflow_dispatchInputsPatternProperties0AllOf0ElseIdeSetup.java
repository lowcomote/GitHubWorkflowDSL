/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseRuntimeModule;
import githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseIdeSetup extends GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseRuntimeModule(), new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseIdeModule()));
	}
	
}
