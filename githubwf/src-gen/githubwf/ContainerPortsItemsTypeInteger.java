/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Ports Items Type Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ContainerPortsItemsTypeInteger#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainerPortsItemsTypeInteger()
 * @model annotation="ArrayOfTypes ArrayOfTypes='integer'"
 * @generated
 */
public interface ContainerPortsItemsTypeInteger extends ContainerPortsItemsAbstract {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute.
	 * @see #setItems(Double)
	 * @see githubwf.GithubwfPackage#getContainerPortsItemsTypeInteger_Items()
	 * @model required="true"
	 * @generated
	 */
	Double getItems();

	/**
	 * Sets the value of the '{@link githubwf.ContainerPortsItemsTypeInteger#getItems <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' attribute.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Double value);

} // ContainerPortsItemsTypeInteger
