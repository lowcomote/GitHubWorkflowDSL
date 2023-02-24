/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Env</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootEnv#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootEnv()
 * @model annotation="Description Description='A map of environment variables that are available to all jobs and steps in the workflow.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#env'"
 * @generated
 */
public interface GithubwfRootEnv extends GithubwfRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference.
	 * @see #setEnv(Env)
	 * @see githubwf.GithubwfPackage#getGithubwfRootEnv_Env()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='env'"
	 * @generated
	 */
	Env getEnv();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootEnv#getEnv <em>Env</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' containment reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Env value);

} // GithubwfRootEnv
