/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf0#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf0()
 * @model
 * @generated
 */
public interface GithubwfRootOnOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference.
	 * @see #setOn(Event)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf0_On()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='on'"
	 * @generated
	 */
	Event getOn();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf0#getOn <em>On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' containment reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(Event value);

} // GithubwfRootOnOneOf0
