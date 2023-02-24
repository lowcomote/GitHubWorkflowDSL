/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Deployments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventDeployments#getDeployments <em>Deployments</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventDeployments()
 * @model
 * @generated
 */
public interface Permissions_45eventDeployments extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployments</em>' containment reference.
	 * @see #setDeployments(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventDeployments_Deployments()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='deployments'"
	 * @generated
	 */
	Permissions_45level getDeployments();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventDeployments#getDeployments <em>Deployments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployments</em>' containment reference.
	 * @see #getDeployments()
	 * @generated
	 */
	void setDeployments(Permissions_45level value);

} // Permissions_45eventDeployments
