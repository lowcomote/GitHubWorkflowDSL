/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Shell#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getShell()
 * @model annotation="Description Description='You can override the default shell settings in the runner\'s operating system using the shell keyword. You can use built-in shell keywords, or you can define a custom set of shell options.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#jobsjob_idstepsshell'"
 * @generated
 */
public interface Shell extends EObject {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' containment reference.
	 * @see #setShell(ShellAbstract)
	 * @see githubwf.GithubwfPackage#getShell_Shell()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ShellAbstract getShell();

	/**
	 * Sets the value of the '{@link githubwf.Shell#getShell <em>Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' containment reference.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(ShellAbstract value);

} // Shell
