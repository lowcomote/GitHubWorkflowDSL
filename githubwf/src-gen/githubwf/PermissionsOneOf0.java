/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.PermissionsOneOf0#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissionsOneOf0()
 * @model annotation="Enum"
 * @generated
 */
public interface PermissionsOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(JsonDocument)
	 * @see githubwf.GithubwfPackage#getPermissionsOneOf0_Permissions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getPermissions();

	/**
	 * Sets the value of the '{@link githubwf.PermissionsOneOf0#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(JsonDocument value);

} // PermissionsOneOf0
