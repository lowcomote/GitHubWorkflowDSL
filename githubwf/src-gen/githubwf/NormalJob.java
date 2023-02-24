/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJob#getNormalJob <em>Normal Job</em>}</li>
 *   <li>{@link githubwf.NormalJob#getName <em>Name</em>}</li>
 *   <li>{@link githubwf.NormalJob#getNeeds <em>Needs</em>}</li>
 *   <li>{@link githubwf.NormalJob#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link githubwf.NormalJob#getRuns_45on <em>Runs 45on</em>}</li>
 *   <li>{@link githubwf.NormalJob#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link githubwf.NormalJob#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link githubwf.NormalJob#getEnv <em>Env</em>}</li>
 *   <li>{@link githubwf.NormalJob#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link githubwf.NormalJob#getIf_ <em>If </em>}</li>
 *   <li>{@link githubwf.NormalJob#getSteps <em>Steps</em>}</li>
 *   <li>{@link githubwf.NormalJob#getTimeout_45minutes <em>Timeout 45minutes</em>}</li>
 *   <li>{@link githubwf.NormalJob#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link githubwf.NormalJob#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 *   <li>{@link githubwf.NormalJob#getContainer <em>Container</em>}</li>
 *   <li>{@link githubwf.NormalJob#getServices <em>Services</em>}</li>
 *   <li>{@link githubwf.NormalJob#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJob()
 * @model annotation="Type Type='object'"
 *        annotation="Description Description='Each job must have an id to associate with the job. The key job_id is a string and its value is a map of the job\'s configuration data. You must replace &lt;job_id&gt; with a string that is unique to the jobs object. The &lt;job_id&gt; must start with a letter or _ and contain only alphanumeric characters, -, or _.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_id'"
 * @generated
 */
public interface NormalJob extends EObject {
	/**
	 * Returns the value of the '<em><b>Normal Job</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Job</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJob_NormalJob()
	 * @model containment="true"
	 * @generated
	 */
	EList<NormalJobPropertiesAbstract> getNormalJob();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see githubwf.GithubwfPackage#getNormalJob_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Needs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Needs()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	JobNeeds getNeeds();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Permissions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions getPermissions();

	/**
	 * Returns the value of the '<em><b>Runs 45on</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs 45on</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Runs_45on()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobRuns_45onAbstract getRuns_45on();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Environment()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobEnvironmentAbstract getEnvironment();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Outputs()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobOutputs getOutputs();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Env()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Env getEnv();

	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaults</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Defaults()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Defaults getDefaults();

	/**
	 * Returns the value of the '<em><b>If </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If </em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_If_()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobIfAbstract getIf_();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Steps()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobSteps getSteps();

	/**
	 * Returns the value of the '<em><b>Timeout 45minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout 45minutes</em>' attribute.
	 * @see githubwf.GithubwfPackage#getNormalJob_Timeout_45minutes()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Double getTimeout_45minutes();

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Strategy()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobStrategy getStrategy();

	/**
	 * Returns the value of the '<em><b>Continue 45on 45error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue 45on 45error</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Continue_45on_45error()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobContinue_45on_45errorAbstract getContinue_45on_45error();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Container()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobContainerAbstract getContainer();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Services()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobServices getServices();

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJob_Concurrency()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobConcurrencyAbstract getConcurrency();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJob
