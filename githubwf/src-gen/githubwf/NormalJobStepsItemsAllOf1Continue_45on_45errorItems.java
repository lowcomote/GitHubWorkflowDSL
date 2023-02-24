/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 Continue 45on 45error Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Continue_45on_45errorItems()
 * @model
 * @generated
 */
public interface NormalJobStepsItemsAllOf1Continue_45on_45errorItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(JsonDocument)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Continue_45on_45errorItems_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getItems();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorItems#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(JsonDocument value);

} // NormalJobStepsItemsAllOf1Continue_45on_45errorItems
