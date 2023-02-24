/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnTypeNull#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface GithubwfRootOnTypeNull extends GithubwfRootOnAbstract {
	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference.
	 * @see #setOn(NullValue)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeNull_On()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='on'"
	 * @generated
	 */
	NullValue getOn();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnTypeNull#getOn <em>On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' containment reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(NullValue value);

} // GithubwfRootOnTypeNull
