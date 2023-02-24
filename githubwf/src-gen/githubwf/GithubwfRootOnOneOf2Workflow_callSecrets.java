/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Secrets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecrets#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecrets()
 * @model annotation="Description Description='A map of the secrets that can be used in the called workflow. Within the called workflow, you can use the secrets context to refer to a secret.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#onworkflow_callsecrets'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callSecrets extends GithubwfRootOnOneOf2Workflow_callPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference.
	 * @see #setSecrets(GithubwfRootOnOneOf2Workflow_callSecretsAbstract)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecrets_Secrets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_callSecretsAbstract getSecrets();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecrets#getSecrets <em>Secrets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets</em>' containment reference.
	 * @see #getSecrets()
	 * @generated
	 */
	void setSecrets(GithubwfRootOnOneOf2Workflow_callSecretsAbstract value);

} // GithubwfRootOnOneOf2Workflow_callSecrets
