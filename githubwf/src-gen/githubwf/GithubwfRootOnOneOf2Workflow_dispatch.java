/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow dispatch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatch#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatch()
 * @model annotation="Description Description='You can now create workflows that are manually triggered with the new workflow_dispatch event. You will then see a \'Run workflow\' button on the Actions tab, enabling you to easily trigger a run.'"
 *        annotation="Comment Comment='https://github.blog/changelog/2020-07-06-github-actions-manual-triggers-with-workflow_dispatch/'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_dispatch extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow dispatch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow dispatch</em>' containment reference.
	 * @see #setWorkflow_dispatch(GithubwfRootOnOneOf2Workflow_dispatchAbstract)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatch_Workflow_dispatch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_dispatchAbstract getWorkflow_dispatch();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatch#getWorkflow_dispatch <em>Workflow dispatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow dispatch</em>' containment reference.
	 * @see #getWorkflow_dispatch()
	 * @generated
	 */
	void setWorkflow_dispatch(GithubwfRootOnOneOf2Workflow_dispatchAbstract value);

} // GithubwfRootOnOneOf2Workflow_dispatch
