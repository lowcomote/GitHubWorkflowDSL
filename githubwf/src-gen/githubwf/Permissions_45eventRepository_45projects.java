/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Repository 45projects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventRepository_45projects#getRepository_45projects <em>Repository 45projects</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventRepository_45projects()
 * @model
 * @generated
 */
public interface Permissions_45eventRepository_45projects extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Repository 45projects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository 45projects</em>' containment reference.
	 * @see #setRepository_45projects(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventRepository_45projects_Repository_45projects()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='repository-projects'"
	 * @generated
	 */
	Permissions_45level getRepository_45projects();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventRepository_45projects#getRepository_45projects <em>Repository 45projects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository 45projects</em>' containment reference.
	 * @see #getRepository_45projects()
	 * @generated
	 */
	void setRepository_45projects(Permissions_45level value);

} // Permissions_45eventRepository_45projects
