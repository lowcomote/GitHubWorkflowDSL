/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class PermissionsOneOf1StandaloneSetup extends PermissionsOneOf1StandaloneSetupGenerated {

	public static void doSetup() {
		new PermissionsOneOf1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}