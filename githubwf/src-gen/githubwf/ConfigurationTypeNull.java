/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConfigurationTypeNull#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConfigurationTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface ConfigurationTypeNull extends ConfigurationAbstract {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(NullValue)
	 * @see githubwf.GithubwfPackage#getConfigurationTypeNull_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NullValue getConfiguration();

	/**
	 * Sets the value of the '{@link githubwf.ConfigurationTypeNull#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(NullValue value);

} // ConfigurationTypeNull
