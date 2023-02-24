/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.PermissionsOneOf1#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissionsOneOf1()
 * @model
 * @generated
 */
public interface PermissionsOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(Permissions_45event)
	 * @see githubwf.GithubwfPackage#getPermissionsOneOf1_Permissions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Permissions_45event getPermissions();

	/**
	 * Sets the value of the '{@link githubwf.PermissionsOneOf1#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(Permissions_45event value);

} // PermissionsOneOf1
