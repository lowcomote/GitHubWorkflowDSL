/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf0#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf0()
 * @model
 * @generated
 */
public interface NormalJobStepsItemsAllOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(NormalJobStepsItemsAllOf0Abstract)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf0_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NormalJobStepsItemsAllOf0Abstract getItems();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf0#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(NormalJobStepsItemsAllOf0Abstract value);

} // NormalJobStepsItemsAllOf0
