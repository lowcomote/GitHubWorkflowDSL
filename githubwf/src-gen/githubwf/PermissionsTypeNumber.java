/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.PermissionsTypeNumber#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissionsTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface PermissionsTypeNumber extends PermissionsAbstract {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute.
	 * @see #setPermissions(Double)
	 * @see githubwf.GithubwfPackage#getPermissionsTypeNumber_Permissions()
	 * @model required="true"
	 * @generated
	 */
	Double getPermissions();

	/**
	 * Sets the value of the '{@link githubwf.PermissionsTypeNumber#getPermissions <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' attribute.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(Double value);

} // PermissionsTypeNumber
