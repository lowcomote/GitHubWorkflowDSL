/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ConfigurationOneOf0StandaloneSetup extends ConfigurationOneOf0StandaloneSetupGenerated {

	public static void doSetup() {
		new ConfigurationOneOf0StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
