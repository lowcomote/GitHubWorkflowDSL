/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConfigurationOneOf0#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConfigurationOneOf0()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface ConfigurationOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(String)
	 * @see githubwf.GithubwfPackage#getConfigurationOneOf0_Configuration()
	 * @model required="true"
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link githubwf.ConfigurationOneOf0#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(String value);

} // ConfigurationOneOf0
