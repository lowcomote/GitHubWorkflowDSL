/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Env#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnv()
 * @model annotation="Description Description='To set custom environment variables, you need to specify the variables in the workflow file. You can define environment variables for a step, job, or entire workflow using the jobs.&lt;job_id&gt;.steps[*].env, jobs.&lt;job_id&gt;.env, and env keywords. For more information, see https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepsenv'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/learn-github-actions/environment-variables'"
 * @generated
 */
public interface Env extends EObject {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference.
	 * @see #setEnv(EnvAbstract)
	 * @see githubwf.GithubwfPackage#getEnv_Env()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EnvAbstract getEnv();

	/**
	 * Sets the value of the '{@link githubwf.Env#getEnv <em>Env</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' containment reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(EnvAbstract value);

} // Env
