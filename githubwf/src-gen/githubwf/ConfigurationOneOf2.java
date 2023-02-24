/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration One Of2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConfigurationOneOf2#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConfigurationOneOf2()
 * @model annotation="Type Type='boolean'"
 * @generated
 */
public interface ConfigurationOneOf2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(Boolean)
	 * @see githubwf.GithubwfPackage#getConfigurationOneOf2_Configuration()
	 * @model required="true"
	 * @generated
	 */
	Boolean getConfiguration();

	/**
	 * Sets the value of the '{@link githubwf.ConfigurationOneOf2#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Boolean value);

} // ConfigurationOneOf2
