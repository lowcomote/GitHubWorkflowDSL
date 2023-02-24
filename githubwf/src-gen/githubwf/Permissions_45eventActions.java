/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventActions#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventActions()
 * @model
 * @generated
 */
public interface Permissions_45eventActions extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventActions_Actions()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='actions'"
	 * @generated
	 */
	Permissions_45level getActions();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventActions#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(Permissions_45level value);

} // Permissions_45eventActions
