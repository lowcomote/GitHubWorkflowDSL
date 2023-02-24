/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Id 45token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventId_45token#getId_45token <em>Id 45token</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventId_45token()
 * @model
 * @generated
 */
public interface Permissions_45eventId_45token extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Id 45token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id 45token</em>' containment reference.
	 * @see #setId_45token(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventId_45token_Id_45token()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='id-token'"
	 * @generated
	 */
	Permissions_45level getId_45token();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventId_45token#getId_45token <em>Id 45token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id 45token</em>' containment reference.
	 * @see #getId_45token()
	 * @generated
	 */
	void setId_45token(Permissions_45level value);

} // Permissions_45eventId_45token
