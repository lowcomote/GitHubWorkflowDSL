/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow run Workflows</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_runWorkflows#getWorkflows <em>Workflows</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_runWorkflows()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_runWorkflows extends EObject {
	/**
	 * Returns the value of the '<em><b>Workflows</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2Workflow_runWorkflowsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflows</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_runWorkflows_Workflows()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='workflows'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2Workflow_runWorkflowsItems> getWorkflows();

} // GithubwfRootOnOneOf2Workflow_runWorkflows
