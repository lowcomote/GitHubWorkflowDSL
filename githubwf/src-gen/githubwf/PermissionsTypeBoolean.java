/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.PermissionsTypeBoolean#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissionsTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface PermissionsTypeBoolean extends PermissionsAbstract {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute.
	 * @see #setPermissions(Boolean)
	 * @see githubwf.GithubwfPackage#getPermissionsTypeBoolean_Permissions()
	 * @model required="true"
	 * @generated
	 */
	Boolean getPermissions();

	/**
	 * Sets the value of the '{@link githubwf.PermissionsTypeBoolean#getPermissions <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' attribute.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(Boolean value);

} // PermissionsTypeBoolean
