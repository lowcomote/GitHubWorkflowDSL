/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow dispatch Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeArray#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_dispatchTypeArray extends GithubwfRootOnOneOf2Workflow_dispatchAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow dispatch</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow dispatch</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchTypeArray_Workflow_dispatch()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='workflow_dispatch'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2Workflow_dispatchItems> getWorkflow_dispatch();

} // GithubwfRootOnOneOf2Workflow_dispatchTypeArray
