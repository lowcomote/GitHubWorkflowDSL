/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Pages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventPages#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventPages()
 * @model
 * @generated
 */
public interface Permissions_45eventPages extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference.
	 * @see #setPages(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventPages_Pages()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='pages'"
	 * @generated
	 */
	Permissions_45level getPages();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventPages#getPages <em>Pages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' containment reference.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(Permissions_45level value);

} // Permissions_45eventPages
