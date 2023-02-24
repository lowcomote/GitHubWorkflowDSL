/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Type Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EnvTypeInteger#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvTypeInteger()
 * @model annotation="ArrayOfTypes ArrayOfTypes='integer'"
 * @generated
 */
public interface EnvTypeInteger extends EnvAbstract {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' attribute.
	 * @see #setEnv(Double)
	 * @see githubwf.GithubwfPackage#getEnvTypeInteger_Env()
	 * @model required="true"
	 * @generated
	 */
	Double getEnv();

	/**
	 * Sets the value of the '{@link githubwf.EnvTypeInteger#getEnv <em>Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' attribute.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Double value);

} // EnvTypeInteger
