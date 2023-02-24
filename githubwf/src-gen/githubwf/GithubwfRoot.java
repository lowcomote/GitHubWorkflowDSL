/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRoot#getGithubwfRoot <em>Githubwf Root</em>}</li>
 *   <li>{@link githubwf.GithubwfRoot#getName <em>Name</em>}</li>
 *   <li>{@link githubwf.GithubwfRoot#getOn <em>On</em>}</li>
 *   <li>{@link githubwf.GithubwfRoot#getEnv <em>Env</em>}</li>
 *   <li>{@link githubwf.GithubwfRoot#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link githubwf.GithubwfRoot#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link githubwf.GithubwfRoot#getJobs <em>Jobs</em>}</li>
 *   <li>{@link githubwf.GithubwfRoot#getRun_45name <em>Run 45name</em>}</li>
 *   <li>{@link githubwf.GithubwfRoot#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRoot()
 * @model annotation="Type Type='object'"
 *        annotation="Schema Title='http://json-schema.org/draft-07/schema'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions'"
 * @generated
 */
public interface GithubwfRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Githubwf Root</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Githubwf Root</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRoot_GithubwfRoot()
	 * @model containment="true"
	 * @generated
	 */
	EList<GithubwfRootPropertiesAbstract> getGithubwfRoot();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see githubwf.GithubwfPackage#getGithubwfRoot_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRoot_On()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootOnAbstract getOn();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRoot_Env()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Env getEnv();

	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaults</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRoot_Defaults()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Defaults getDefaults();

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRoot_Concurrency()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootConcurrencyAbstract getConcurrency();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRoot_Jobs()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootJobs getJobs();

	/**
	 * Returns the value of the '<em><b>Run 45name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run 45name</em>' attribute.
	 * @see githubwf.GithubwfPackage#getGithubwfRoot_Run_45name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getRun_45name();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRoot_Permissions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions getPermissions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRoot
