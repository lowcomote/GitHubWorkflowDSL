/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Environment Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobEnvironmentTypeString#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface NormalJobEnvironmentTypeString extends NormalJobEnvironmentAbstract {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentTypeString_Environment()
	 * @model required="true"
	 *        annotation="Keyword Keyword='environment'"
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobEnvironmentTypeString#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

} // NormalJobEnvironmentTypeString
