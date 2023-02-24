/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Secrets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobSecrets#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecrets()
 * @model annotation="Description Description='When a job is used to call a reusable workflow, you can use \'secrets\' to provide a map of secrets that are passed to the called workflow. Any secrets that you pass must match the names defined in the called workflow.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#jobsjob_idsecrets'"
 * @generated
 */
public interface ReusableWorkflowCallJobSecrets extends ReusableWorkflowCallJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference.
	 * @see #setSecrets(ReusableWorkflowCallJobSecretsAbstract)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecrets_Secrets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReusableWorkflowCallJobSecretsAbstract getSecrets();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobSecrets#getSecrets <em>Secrets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets</em>' containment reference.
	 * @see #getSecrets()
	 * @generated
	 */
	void setSecrets(ReusableWorkflowCallJobSecretsAbstract value);

} // ReusableWorkflowCallJobSecrets
