/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnTypeNumber#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface GithubwfRootOnTypeNumber extends GithubwfRootOnAbstract {
	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see #setOn(Double)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnTypeNumber_On()
	 * @model required="true"
	 *        annotation="Keyword Keyword='on'"
	 * @generated
	 */
	Double getOn();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnTypeNumber#getOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(Double value);

} // GithubwfRootOnTypeNumber
