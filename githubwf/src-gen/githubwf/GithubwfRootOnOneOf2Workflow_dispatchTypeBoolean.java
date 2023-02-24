/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow dispatch Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeBoolean#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_dispatchTypeBoolean extends GithubwfRootOnOneOf2Workflow_dispatchAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow dispatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow dispatch</em>' attribute.
	 * @see #setWorkflow_dispatch(Boolean)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchTypeBoolean_Workflow_dispatch()
	 * @model required="true"
	 *        annotation="Keyword Keyword='workflow_dispatch'"
	 * @generated
	 */
	Boolean getWorkflow_dispatch();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeBoolean#getWorkflow_dispatch <em>Workflow dispatch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow dispatch</em>' attribute.
	 * @see #getWorkflow_dispatch()
	 * @generated
	 */
	void setWorkflow_dispatch(Boolean value);

} // GithubwfRootOnOneOf2Workflow_dispatchTypeBoolean
