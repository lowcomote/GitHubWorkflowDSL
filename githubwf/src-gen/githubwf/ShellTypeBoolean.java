/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ShellTypeBoolean#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getShellTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface ShellTypeBoolean extends ShellAbstract {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see #setShell(Boolean)
	 * @see githubwf.GithubwfPackage#getShellTypeBoolean_Shell()
	 * @model required="true"
	 * @generated
	 */
	Boolean getShell();

	/**
	 * Sets the value of the '{@link githubwf.ShellTypeBoolean#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(Boolean value);

} // ShellTypeBoolean
