/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Env</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobEnv#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobEnv()
 * @model annotation="Description Description='A map of environment variables that are available to all steps in the job.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idenv'"
 * @generated
 */
public interface NormalJobEnv extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference.
	 * @see #setEnv(Env)
	 * @see githubwf.GithubwfPackage#getNormalJobEnv_Env()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='env'"
	 * @generated
	 */
	Env getEnv();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobEnv#getEnv <em>Env</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' containment reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Env value);

} // NormalJobEnv
