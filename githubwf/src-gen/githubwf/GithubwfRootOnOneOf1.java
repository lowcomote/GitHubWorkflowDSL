/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf1#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf1()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface GithubwfRootOnOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf1Items}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf1_On()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='on'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf1Items> getOn();

} // GithubwfRootOnOneOf1
