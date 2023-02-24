/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeString#getWorkflow_call <em>Workflow call</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callTypeString extends GithubwfRootOnOneOf2Workflow_callAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow call</em>' attribute.
	 * @see #setWorkflow_call(String)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callTypeString_Workflow_call()
	 * @model required="true"
	 *        annotation="Keyword Keyword='workflow_call'"
	 * @generated
	 */
	String getWorkflow_call();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeString#getWorkflow_call <em>Workflow call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow call</em>' attribute.
	 * @see #getWorkflow_call()
	 * @generated
	 */
	void setWorkflow_call(String value);

} // GithubwfRootOnOneOf2Workflow_callTypeString
