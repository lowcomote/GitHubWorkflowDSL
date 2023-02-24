/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_run#getWorkflow_run <em>Workflow run</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_run()
 * @model annotation="Description Description='This event occurs when a workflow run is requested or completed, and allows you to execute a workflow based on the finished result of another workflow. For example, if your pull_request workflow generates build artifacts, you can create a new workflow that uses workflow_run to analyze the results and add a comment to the original pull request.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/reference/events-that-trigger-workflows#workflow_run'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_run extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow run</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow run</em>' containment reference.
	 * @see #setWorkflow_run(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_run_Workflow_run()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='workflow_run'"
	 * @generated
	 */
	EventObject getWorkflow_run();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_run#getWorkflow_run <em>Workflow run</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow run</em>' containment reference.
	 * @see #getWorkflow_run()
	 * @generated
	 */
	void setWorkflow_run(EventObject value);

} // GithubwfRootOnOneOf2Workflow_run
