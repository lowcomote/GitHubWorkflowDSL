/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.PermissionsTypeString#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissionsTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface PermissionsTypeString extends PermissionsAbstract {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute.
	 * @see #setPermissions(String)
	 * @see githubwf.GithubwfPackage#getPermissionsTypeString_Permissions()
	 * @model required="true"
	 * @generated
	 */
	String getPermissions();

	/**
	 * Sets the value of the '{@link githubwf.PermissionsTypeString#getPermissions <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' attribute.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(String value);

} // PermissionsTypeString
