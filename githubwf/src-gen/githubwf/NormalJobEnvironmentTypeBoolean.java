/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Environment Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobEnvironmentTypeBoolean#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface NormalJobEnvironmentTypeBoolean extends NormalJobEnvironmentAbstract {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(Boolean)
	 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentTypeBoolean_Environment()
	 * @model required="true"
	 *        annotation="Keyword Keyword='environment'"
	 * @generated
	 */
	Boolean getEnvironment();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobEnvironmentTypeBoolean#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Boolean value);

} // NormalJobEnvironmentTypeBoolean
