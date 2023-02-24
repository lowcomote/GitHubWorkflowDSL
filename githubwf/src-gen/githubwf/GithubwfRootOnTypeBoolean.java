/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnTypeBoolean#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface GithubwfRootOnTypeBoolean extends GithubwfRootOnAbstract {
	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see #setOn(Boolean)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeBoolean_On()
	 * @model required="true"
	 *        annotation="Keyword Keyword='on'"
	 * @generated
	 */
	Boolean getOn();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnTypeBoolean#getOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(Boolean value);

} // GithubwfRootOnTypeBoolean
