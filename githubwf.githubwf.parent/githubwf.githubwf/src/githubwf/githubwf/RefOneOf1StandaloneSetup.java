/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class RefOneOf1StandaloneSetup extends RefOneOf1StandaloneSetupGenerated {

	public static void doSetup() {
		new RefOneOf1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
