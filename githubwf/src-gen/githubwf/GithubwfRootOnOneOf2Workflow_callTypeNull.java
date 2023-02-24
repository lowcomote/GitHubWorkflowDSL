/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeNull#getWorkflow_call <em>Workflow call</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callTypeNull extends GithubwfRootOnOneOf2Workflow_callAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow call</em>' containment reference.
	 * @see #setWorkflow_call(NullValue)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callTypeNull_Workflow_call()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='workflow_call'"
	 * @generated
	 */
	NullValue getWorkflow_call();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeNull#getWorkflow_call <em>Workflow call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow call</em>' containment reference.
	 * @see #getWorkflow_call()
	 * @generated
	 */
	void setWorkflow_call(NullValue value);

} // GithubwfRootOnOneOf2Workflow_callTypeNull
