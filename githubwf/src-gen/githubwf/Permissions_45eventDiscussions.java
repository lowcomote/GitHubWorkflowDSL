/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Discussions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventDiscussions#getDiscussions <em>Discussions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventDiscussions()
 * @model
 * @generated
 */
public interface Permissions_45eventDiscussions extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Discussions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussions</em>' containment reference.
	 * @see #setDiscussions(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventDiscussions_Discussions()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='discussions'"
	 * @generated
	 */
	Permissions_45level getDiscussions();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventDiscussions#getDiscussions <em>Discussions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discussions</em>' containment reference.
	 * @see #getDiscussions()
	 * @generated
	 */
	void setDiscussions(Permissions_45level value);

} // Permissions_45eventDiscussions
