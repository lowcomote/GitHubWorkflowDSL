/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Issues</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventIssues#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventIssues()
 * @model
 * @generated
 */
public interface Permissions_45eventIssues extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference.
	 * @see #setIssues(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventIssues_Issues()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='issues'"
	 * @generated
	 */
	Permissions_45level getIssues();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventIssues#getIssues <em>Issues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issues</em>' containment reference.
	 * @see #getIssues()
	 * @generated
	 */
	void setIssues(Permissions_45level value);

} // Permissions_45eventIssues
