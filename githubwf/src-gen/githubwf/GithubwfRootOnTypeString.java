/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnTypeString#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface GithubwfRootOnTypeString extends GithubwfRootOnAbstract {
	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see #setOn(String)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeString_On()
	 * @model required="true"
	 *        annotation="Keyword Keyword='on'"
	 * @generated
	 */
	String getOn();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnTypeString#getOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(String value);

} // GithubwfRootOnTypeString
