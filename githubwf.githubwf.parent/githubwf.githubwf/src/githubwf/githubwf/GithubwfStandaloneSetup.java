/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class GithubwfStandaloneSetup extends GithubwfStandaloneSetupGenerated {

	public static void doSetup() {
		new GithubwfStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
