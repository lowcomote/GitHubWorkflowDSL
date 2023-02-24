/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Ports Items Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ContainerPortsItemsTypeArray#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainerPortsItemsTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface ContainerPortsItemsTypeArray extends ContainerPortsItemsAbstract {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ContainerPortsItemsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getContainerPortsItemsTypeArray_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerPortsItemsItems> getItems();

} // ContainerPortsItemsTypeArray
