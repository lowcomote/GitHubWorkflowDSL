/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref One Of0 All Of0 Not Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefOneOf0AllOf0NotItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefOneOf0AllOf0NotItems()
 * @model
 * @generated
 */
public interface RefOneOf0AllOf0NotItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(JsonDocument)
	 * @see githubwf.GithubwfPackage#getRefOneOf0AllOf0NotItems_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getItems();

	/**
	 * Sets the value of the '{@link githubwf.RefOneOf0AllOf0NotItems#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(JsonDocument value);

} // RefOneOf0AllOf0NotItems
