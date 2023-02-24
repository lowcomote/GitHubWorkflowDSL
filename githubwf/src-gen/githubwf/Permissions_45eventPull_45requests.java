/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Pull 45requests</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventPull_45requests#getPull_45requests <em>Pull 45requests</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventPull_45requests()
 * @model
 * @generated
 */
public interface Permissions_45eventPull_45requests extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Pull 45requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull 45requests</em>' containment reference.
	 * @see #setPull_45requests(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventPull_45requests_Pull_45requests()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='pull-requests'"
	 * @generated
	 */
	Permissions_45level getPull_45requests();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventPull_45requests#getPull_45requests <em>Pull 45requests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pull 45requests</em>' containment reference.
	 * @see #getPull_45requests()
	 * @generated
	 */
	void setPull_45requests(Permissions_45level value);

} // Permissions_45eventPull_45requests
