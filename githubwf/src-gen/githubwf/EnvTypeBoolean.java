/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EnvTypeBoolean#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface EnvTypeBoolean extends EnvAbstract {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' attribute.
	 * @see #setEnv(Boolean)
	 * @see githubwf.GithubwfPackage#getEnvTypeBoolean_Env()
	 * @model required="true"
	 * @generated
	 */
	Boolean getEnv();

	/**
	 * Sets the value of the '{@link githubwf.EnvTypeBoolean#getEnv <em>Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' attribute.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Boolean value);

} // EnvTypeBoolean
