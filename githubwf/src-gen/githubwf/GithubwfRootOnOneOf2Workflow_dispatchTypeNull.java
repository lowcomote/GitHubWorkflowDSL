/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow dispatch Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeNull#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_dispatchTypeNull extends GithubwfRootOnOneOf2Workflow_dispatchAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow dispatch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow dispatch</em>' containment reference.
	 * @see #setWorkflow_dispatch(NullValue)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchTypeNull_Workflow_dispatch()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='workflow_dispatch'"
	 * @generated
	 */
	NullValue getWorkflow_dispatch();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeNull#getWorkflow_dispatch <em>Workflow dispatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow dispatch</em>' containment reference.
	 * @see #getWorkflow_dispatch()
	 * @generated
	 */
	void setWorkflow_dispatch(NullValue value);

} // GithubwfRootOnOneOf2Workflow_dispatchTypeNull
