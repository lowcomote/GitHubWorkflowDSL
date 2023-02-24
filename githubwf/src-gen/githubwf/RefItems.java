/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefItems()
 * @model
 * @generated
 */
public interface RefItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(JsonDocument)
	 * @see githubwf.GithubwfPackage#getRefItems_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getItems();

	/**
	 * Sets the value of the '{@link githubwf.RefItems#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(JsonDocument value);

} // RefItems
