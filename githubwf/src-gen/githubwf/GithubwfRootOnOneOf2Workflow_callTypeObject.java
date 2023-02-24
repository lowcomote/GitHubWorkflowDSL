/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeObject#getWorkflow_call <em>Workflow call</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeObject#getInputs <em>Inputs</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeObject#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callTypeObject extends GithubwfRootOnOneOf2Workflow_callAbstract {
	/**
	 * Returns the value of the '<em><b>Workflow call</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2Workflow_callPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow call</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callTypeObject_Workflow_call()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='workflow_call'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2Workflow_callPropertiesAbstract> getWorkflow_call();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callTypeObject_Inputs()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_callInputs getInputs();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callTypeObject_Secrets()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_callSecretsAbstract getSecrets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRootOnOneOf2Workflow_callTypeObject
