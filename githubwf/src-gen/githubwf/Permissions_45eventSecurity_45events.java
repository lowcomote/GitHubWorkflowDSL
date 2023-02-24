/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Security 45events</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventSecurity_45events#getSecurity_45events <em>Security 45events</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventSecurity_45events()
 * @model
 * @generated
 */
public interface Permissions_45eventSecurity_45events extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Security 45events</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security 45events</em>' containment reference.
	 * @see #setSecurity_45events(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventSecurity_45events_Security_45events()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='security-events'"
	 * @generated
	 */
	Permissions_45level getSecurity_45events();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventSecurity_45events#getSecurity_45events <em>Security 45events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security 45events</em>' containment reference.
	 * @see #getSecurity_45events()
	 * @generated
	 */
	void setSecurity_45events(Permissions_45level value);

} // Permissions_45eventSecurity_45events
