/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Strategy Matrix Additional Properties One Of0 Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixAdditionalPropertiesOneOf0Items()
 * @model
 * @generated
 */
public interface NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Configuration)
	 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixAdditionalPropertiesOneOf0Items_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Configuration getItems();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Configuration value);

} // NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items
