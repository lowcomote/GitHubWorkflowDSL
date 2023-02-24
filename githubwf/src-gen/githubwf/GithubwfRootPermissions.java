/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Permissions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootPermissions#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootPermissions()
 * @model
 * @generated
 */
public interface GithubwfRootPermissions extends GithubwfRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(Permissions)
	 * @see githubwf.GithubwfPackage#getGithubwfRootPermissions_Permissions()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='permissions'"
	 * @generated
	 */
	Permissions getPermissions();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootPermissions#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(Permissions value);

} // GithubwfRootPermissions
