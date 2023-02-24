/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow dispatch Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeObject#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeObject#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_dispatchTypeObject extends GithubwfRootOnOneOf2Workflow_dispatchAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow dispatch</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow dispatch</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchTypeObject_Workflow_dispatch()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='workflow_dispatch'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract> getWorkflow_dispatch();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchTypeObject_Inputs()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_dispatchInputs getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRootOnOneOf2Workflow_dispatchTypeObject
