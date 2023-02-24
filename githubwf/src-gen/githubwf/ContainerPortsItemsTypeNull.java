/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Ports Items Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ContainerPortsItemsTypeNull#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainerPortsItemsTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface ContainerPortsItemsTypeNull extends ContainerPortsItemsAbstract {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(NullValue)
	 * @see githubwf.GithubwfPackage#getContainerPortsItemsTypeNull_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NullValue getItems();

	/**
	 * Sets the value of the '{@link githubwf.ContainerPortsItemsTypeNull#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(NullValue value);

} // ContainerPortsItemsTypeNull
