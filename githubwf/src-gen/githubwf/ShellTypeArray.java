/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ShellTypeArray#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getShellTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface ShellTypeArray extends ShellAbstract {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ShellItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getShellTypeArray_Shell()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShellItems> getShell();

} // ShellTypeArray
