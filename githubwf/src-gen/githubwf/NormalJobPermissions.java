/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Permissions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobPermissions#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobPermissions()
 * @model
 * @generated
 */
public interface NormalJobPermissions extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(Permissions)
	 * @see githubwf.GithubwfPackage#getNormalJobPermissions_Permissions()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='permissions'"
	 * @generated
	 */
	Permissions getPermissions();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobPermissions#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(Permissions value);

} // NormalJobPermissions
