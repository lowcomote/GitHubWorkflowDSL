/*
 * generated by Xtext 2.23.0
 */
package githubwf.githubwf;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ConfigurationOneOf4StandaloneSetup extends ConfigurationOneOf4StandaloneSetupGenerated {

	public static void doSetup() {
		new ConfigurationOneOf4StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
