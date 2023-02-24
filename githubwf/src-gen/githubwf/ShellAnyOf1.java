/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell Any Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ShellAnyOf1#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getShellAnyOf1()
 * @model annotation="Enum"
 *        annotation="Comment Comment='https://help.github.com/en/actions/reference/workflow-syntax-for-github-actions#custom-shell'"
 * @generated
 */
public interface ShellAnyOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' containment reference.
	 * @see #setShell(JsonDocument)
	 * @see githubwf.GithubwfPackage#getShellAnyOf1_Shell()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getShell();

	/**
	 * Sets the value of the '{@link githubwf.ShellAnyOf1#getShell <em>Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' containment reference.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(JsonDocument value);

} // ShellAnyOf1
