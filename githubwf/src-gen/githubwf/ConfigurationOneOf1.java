/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConfigurationOneOf1#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConfigurationOneOf1()
 * @model annotation="Type Type='number'"
 * @generated
 */
public interface ConfigurationOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(Double)
	 * @see githubwf.GithubwfPackage#getConfigurationOneOf1_Configuration()
	 * @model required="true"
	 * @generated
	 */
	Double getConfiguration();

	/**
	 * Sets the value of the '{@link githubwf.ConfigurationOneOf1#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Double value);

} // ConfigurationOneOf1
