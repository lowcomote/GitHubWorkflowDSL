/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45event Packages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45eventPackages#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45eventPackages()
 * @model
 * @generated
 */
public interface Permissions_45eventPackages extends Permissions_45eventPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference.
	 * @see #setPackages(Permissions_45level)
	 * @see githubwf.GithubwfPackage#getPermissions_45eventPackages_Packages()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='packages'"
	 * @generated
	 */
	Permissions_45level getPackages();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45eventPackages#getPackages <em>Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packages</em>' containment reference.
	 * @see #getPackages()
	 * @generated
	 */
	void setPackages(Permissions_45level value);

} // Permissions_45eventPackages
