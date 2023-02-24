/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJob#getReusableWorkflowCallJob <em>Reusable Workflow Call Job</em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJob#getName <em>Name</em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJob#getNeeds <em>Needs</em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJob#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJob#getIf_ <em>If </em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJob#getUses <em>Uses</em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJob#getWith <em>With</em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJob#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJob#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJob#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob()
 * @model annotation="Type Type='object'"
 *        annotation="Description Description='Each job must have an id to associate with the job. The key job_id is a string and its value is a map of the job\'s configuration data. You must replace &lt;job_id&gt; with a string that is unique to the jobs object. The &lt;job_id&gt; must start with a letter or _ and contain only alphanumeric characters, -, or _.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/learn-github-actions/reusing-workflows#calling-a-reusable-workflow'"
 * @generated
 */
public interface ReusableWorkflowCallJob extends EObject {
	/**
	 * Returns the value of the '<em><b>Reusable Workflow Call Job</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ReusableWorkflowCallJobPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reusable Workflow Call Job</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob_ReusableWorkflowCallJob()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReusableWorkflowCallJobPropertiesAbstract> getReusableWorkflowCallJob();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Needs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' reference.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob_Needs()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	JobNeeds getNeeds();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob_Permissions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45event getPermissions();

	/**
	 * Returns the value of the '<em><b>If </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If </em>' reference.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob_If_()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ReusableWorkflowCallJobIfAbstract getIf_();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' attribute.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob_Uses()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getUses();

	/**
	 * Returns the value of the '<em><b>With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' reference.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob_With()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Env getWith();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' reference.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob_Secrets()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ReusableWorkflowCallJobSecretsAbstract getSecrets();

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' reference.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob_Strategy()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ReusableWorkflowCallJobStrategy getStrategy();

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' reference.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJob_Concurrency()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ReusableWorkflowCallJobConcurrencyAbstract getConcurrency();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ReusableWorkflowCallJob
