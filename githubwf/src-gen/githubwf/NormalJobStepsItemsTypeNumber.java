/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsTypeNumber#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface NormalJobStepsItemsTypeNumber extends NormalJobStepsItemsAbstract {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute.
	 * @see #setItems(Double)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsTypeNumber_Items()
	 * @model required="true"
	 * @generated
	 */
	Double getItems();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsTypeNumber#getItems <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' attribute.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Double value);

} // NormalJobStepsItemsTypeNumber
