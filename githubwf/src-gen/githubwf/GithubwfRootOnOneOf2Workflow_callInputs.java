/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputs#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputs()
 * @model annotation="Type Type='object'"
 *        annotation="Description Description='When using the workflow_call keyword, you can optionally specify inputs that are passed to the called workflow from the caller workflow.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#onworkflow_callinputs'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callInputs extends GithubwfRootOnOneOf2Workflow_callPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputs_Inputs()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='inputs'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2Workflow_callInputsPropertiesAbstract> getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRootOnOneOf2Workflow_callInputs
