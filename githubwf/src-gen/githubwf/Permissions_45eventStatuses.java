/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Statuses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventStatuses#getStatuses <em>Statuses</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventStatuses()
 * @model
 * @generated
 */
public interface Permissions_45eventStatuses extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Statuses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statuses</em>' containment reference.
	 * @see #setStatuses(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventStatuses_Statuses()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='statuses'"
	 * @generated
	 */
	Permissions_45level getStatuses();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventStatuses#getStatuses <em>Statuses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statuses</em>' containment reference.
	 * @see #getStatuses()
	 * @generated
	 */
	void setStatuses(Permissions_45level value);

} // Permissions_45eventStatuses
