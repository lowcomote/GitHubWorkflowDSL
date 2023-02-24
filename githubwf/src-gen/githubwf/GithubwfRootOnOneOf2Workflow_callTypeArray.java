/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeArray#getWorkflow_call <em>Workflow call</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callTypeArray extends GithubwfRootOnOneOf2Workflow_callAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow call</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2Workflow_callItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow call</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callTypeArray_Workflow_call()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='workflow_call'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2Workflow_callItems> getWorkflow_call();

} // GithubwfRootOnOneOf2Workflow_callTypeArray
