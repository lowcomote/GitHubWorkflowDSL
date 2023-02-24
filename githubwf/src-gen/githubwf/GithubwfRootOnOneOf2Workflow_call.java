/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_call#getWorkflow_call <em>Workflow call</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_call()
 * @model annotation="Description Description='Allows workflows to be reused by other workflows.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/learn-github-actions/events-that-trigger-workflows#workflow_call'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_call extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow call</em>' containment reference.
	 * @see #setWorkflow_call(GithubwfRootOnOneOf2Workflow_callAbstract)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_call_Workflow_call()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_callAbstract getWorkflow_call();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_call#getWorkflow_call <em>Workflow call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow call</em>' containment reference.
	 * @see #getWorkflow_call()
	 * @generated
	 */
	void setWorkflow_call(GithubwfRootOnOneOf2Workflow_callAbstract value);

} // GithubwfRootOnOneOf2Workflow_call
