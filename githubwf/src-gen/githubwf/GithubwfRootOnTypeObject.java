/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnTypeObject#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface GithubwfRootOnTypeObject extends GithubwfRootOnAbstract {
	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeObject_On()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='on'"
	 * @generated
	 */
	EList<GithubwfRootOnPropertiesAbstract> getOn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRootOnTypeObject
