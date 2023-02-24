/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Contents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventContents#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventContents()
 * @model
 * @generated
 */
public interface Permissions_45eventContents extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference.
	 * @see #setContents(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventContents_Contents()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='contents'"
	 * @generated
	 */
	Permissions_45level getContents();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventContents#getContents <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' containment reference.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(Permissions_45level value);

} // Permissions_45eventContents
