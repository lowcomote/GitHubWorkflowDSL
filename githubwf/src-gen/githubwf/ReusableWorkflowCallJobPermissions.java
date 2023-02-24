/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Permissions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobPermissions#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobPermissions()
 * @model
 * @generated
 */
public interface ReusableWorkflowCallJobPermissions extends ReusableWorkflowCallJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(Permissions_45event)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobPermissions_Permissions()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='permissions'"
	 * @generated
	 */
	Permissions_45event getPermissions();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobPermissions#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(Permissions_45event value);

} // ReusableWorkflowCallJobPermissions
