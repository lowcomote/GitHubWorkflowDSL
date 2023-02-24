/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnTypeArray#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface GithubwfRootOnTypeArray extends GithubwfRootOnAbstract {
	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeArray_On()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='on'"
	 * @generated
	 */
	EList<GithubwfRootOnItems> getOn();

} // GithubwfRootOnTypeArray
