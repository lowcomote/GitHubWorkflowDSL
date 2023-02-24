/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.PermissionsTypeArray#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPermissionsTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface PermissionsTypeArray extends PermissionsAbstract {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.PermissionsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getPermissionsTypeArray_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PermissionsItems> getPermissions();

} // PermissionsTypeArray
