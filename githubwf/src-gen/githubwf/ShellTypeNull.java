/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ShellTypeNull#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getShellTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface ShellTypeNull extends ShellAbstract {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' containment reference.
	 * @see #setShell(NullValue)
	 * @see githubwf.GithubwfPackage#getShellTypeNull_Shell()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NullValue getShell();

	/**
	 * Sets the value of the '{@link githubwf.ShellTypeNull#getShell <em>Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' containment reference.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(NullValue value);

} // ShellTypeNull
