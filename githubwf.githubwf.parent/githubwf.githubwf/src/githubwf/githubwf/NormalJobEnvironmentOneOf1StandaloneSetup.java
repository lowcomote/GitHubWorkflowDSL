/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class NormalJobEnvironmentOneOf1StandaloneSetup extends NormalJobEnvironmentOneOf1StandaloneSetupGenerated {

	public static void doSetup() {
		new NormalJobEnvironmentOneOf1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
