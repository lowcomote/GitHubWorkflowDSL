/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ShellTypeString#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getShellTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface ShellTypeString extends ShellAbstract {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see #setShell(String)
	 * @see githubwf.GithubwfPackage#getShellTypeString_Shell()
	 * @model required="true"
	 * @generated
	 */
	String getShell();

	/**
	 * Sets the value of the '{@link githubwf.ShellTypeString#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(String value);

} // ShellTypeString
