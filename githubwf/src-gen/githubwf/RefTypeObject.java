/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefTypeObject#getRef <em>Ref</em>}</li>
 *   <li>{@link githubwf.RefTypeObject#getBranches <em>Branches</em>}</li>
 *   <li>{@link githubwf.RefTypeObject#getBranches_45ignore <em>Branches 45ignore</em>}</li>
 *   <li>{@link githubwf.RefTypeObject#getTags <em>Tags</em>}</li>
 *   <li>{@link githubwf.RefTypeObject#getTags_45ignore <em>Tags 45ignore</em>}</li>
 *   <li>{@link githubwf.RefTypeObject#getPaths <em>Paths</em>}</li>
 *   <li>{@link githubwf.RefTypeObject#getPaths_45ignore <em>Paths 45ignore</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface RefTypeObject extends RefAbstract {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.RefPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getRefTypeObject_Ref()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefPropertiesAbstract> getRef();

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' reference.
	 * @see githubwf.GithubwfPackage#getRefTypeObject_Branches()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Branch getBranches();

	/**
	 * Returns the value of the '<em><b>Branches 45ignore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches 45ignore</em>' reference.
	 * @see githubwf.GithubwfPackage#getRefTypeObject_Branches_45ignore()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Branch getBranches_45ignore();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference.
	 * @see githubwf.GithubwfPackage#getRefTypeObject_Tags()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Branch getTags();

	/**
	 * Returns the value of the '<em><b>Tags 45ignore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags 45ignore</em>' reference.
	 * @see githubwf.GithubwfPackage#getRefTypeObject_Tags_45ignore()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Branch getTags_45ignore();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' reference.
	 * @see githubwf.GithubwfPackage#getRefTypeObject_Paths()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Path getPaths();

	/**
	 * Returns the value of the '<em><b>Paths 45ignore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths 45ignore</em>' reference.
	 * @see githubwf.GithubwfPackage#getRefTypeObject_Paths_45ignore()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Path getPaths_45ignore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // RefTypeObject
