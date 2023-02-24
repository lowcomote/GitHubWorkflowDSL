/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions 45level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Permissions_45level#getPermissions_45level <em>Permissions 45level</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissions_45level()
 * @model annotation="Enum"
 * @generated
 */
public interface Permissions_45level extends EObject {
	/**
	 * Returns the value of the '<em><b>Permissions 45level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions 45level</em>' containment reference.
	 * @see #setPermissions_45level(JsonDocument)
	 * @see githubwf.GithubwfPackage#getPermissions_45level_Permissions_45level()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getPermissions_45level();

	/**
	 * Sets the value of the '{@link githubwf.Permissions_45level#getPermissions_45level <em>Permissions 45level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions 45level</em>' containment reference.
	 * @see #getPermissions_45level()
	 * @generated
	 */
	void setPermissions_45level(JsonDocument value);

} // Permissions_45level
