/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Checks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventChecks#getChecks <em>Checks</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventChecks()
 * @model
 * @generated
 */
public interface Permissions_45eventChecks extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Checks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks</em>' containment reference.
	 * @see #setChecks(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventChecks_Checks()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='checks'"
	 * @generated
	 */
	Permissions_45level getChecks();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventChecks#getChecks <em>Checks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checks</em>' containment reference.
	 * @see #getChecks()
	 * @generated
	 */
	void setChecks(Permissions_45level value);

} // Permissions_45eventChecks
