/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45event#getPermissions_45event <em>Permissions 45event</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getActions <em>Actions</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getChecks <em>Checks</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getContents <em>Contents</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getDiscussions <em>Discussions</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getId_45token <em>Id 45token</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getIssues <em>Issues</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getPackages <em>Packages</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getPages <em>Pages</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getPull_45requests <em>Pull 45requests</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getRepository_45projects <em>Repository 45projects</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getSecurity_45events <em>Security 45events</em>}</li>
 *   <li>{@link githubwf.Permissions_45event#getStatuses <em>Statuses</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45event()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface Permissions_45event extends EObject {
	/**
	 * Returns the value of the '<em><b>Permissions 45event</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.Permissions_45eventPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions 45event</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Permissions_45event()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permissions_45eventPropertiesAbstract> getPermissions_45event();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Actions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getActions();

	/**
	 * Returns the value of the '<em><b>Checks</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Checks()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getChecks();

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Contents()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getContents();

	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployments</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Deployments()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getDeployments();

	/**
	 * Returns the value of the '<em><b>Discussions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussions</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Discussions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getDiscussions();

	/**
	 * Returns the value of the '<em><b>Id 45token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id 45token</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Id_45token()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getId_45token();

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Issues()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getIssues();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Packages()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getPackages();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Pages()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getPages();

	/**
	 * Returns the value of the '<em><b>Pull 45requests</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull 45requests</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Pull_45requests()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getPull_45requests();

	/**
	 * Returns the value of the '<em><b>Repository 45projects</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository 45projects</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Repository_45projects()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getRepository_45projects();

	/**
	 * Returns the value of the '<em><b>Security 45events</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security 45events</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Security_45events()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getSecurity_45events();

	/**
	 * Returns the value of the '<em><b>Statuses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statuses</em>' reference.
	 * @see githubwf.GithubwfPackage#getPermissions_45event_Statuses()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Permissions_45level getStatuses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // Permissions_45event
