/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsTypeBoolean#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface NormalJobStepsItemsTypeBoolean extends NormalJobStepsItemsAbstract {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute.
	 * @see #setItems(Boolean)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsTypeBoolean_Items()
	 * @model required="true"
	 * @generated
	 */
	Boolean getItems();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsTypeBoolean#getItems <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' attribute.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Boolean value);

} // NormalJobStepsItemsTypeBoolean
