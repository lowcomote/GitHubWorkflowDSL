/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On Type Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnTypeInteger#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeInteger()
 * @model annotation="ArrayOfTypes ArrayOfTypes='integer'"
 * @generated
 */
public interface GithubwfRootOnTypeInteger extends GithubwfRootOnAbstract {
	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see #setOn(Double)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeInteger_On()
	 * @model required="true"
	 *        annotation="Keyword Keyword='on'"
	 * @generated
	 */
	Double getOn();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnTypeInteger#getOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(Double value);

} // GithubwfRootOnTypeInteger
