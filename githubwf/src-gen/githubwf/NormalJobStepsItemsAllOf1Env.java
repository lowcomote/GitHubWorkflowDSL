/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 Env</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1Env#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Env()
 * @model annotation="Description Description='Sets environment variables for steps to use in the virtual environment. You can also set environment variables for the entire workflow or a job.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepsenv'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1Env extends NormalJobStepsItemsAllOf1PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference.
	 * @see #setEnv(Env)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Env_Env()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='env'"
	 * @generated
	 */
	Env getEnv();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1Env#getEnv <em>Env</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' containment reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Env value);

} // NormalJobStepsItemsAllOf1Env
