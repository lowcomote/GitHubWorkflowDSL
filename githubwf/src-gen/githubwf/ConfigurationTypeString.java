/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConfigurationTypeString#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConfigurationTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface ConfigurationTypeString extends ConfigurationAbstract {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(String)
	 * @see githubwf.GithubwfPackage#getConfigurationTypeString_Configuration()
	 * @model required="true"
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link githubwf.ConfigurationTypeString#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(String value);

} // ConfigurationTypeString
