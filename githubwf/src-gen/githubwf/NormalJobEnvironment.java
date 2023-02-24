/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobEnvironment#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobEnvironment()
 * @model annotation="Description Description='The environment that the job references.'"
 *        annotation="Comment Comment='https://docs.github.com/en/free-pro-team@latest/actions/reference/workflow-syntax-for-github-actions#jobsjob_idenvironment'"
 * @generated
 */
public interface NormalJobEnvironment extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(NormalJobEnvironmentAbstract)
	 * @see githubwf.GithubwfPackage#getNormalJobEnvironment_Environment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NormalJobEnvironmentAbstract getEnvironment();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobEnvironment#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(NormalJobEnvironmentAbstract value);

} // NormalJobEnvironment
