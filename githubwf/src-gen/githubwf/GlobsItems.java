/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Globs Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GlobsItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGlobsItems()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface GlobsItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute.
	 * @see #setItems(String)
	 * @see githubwf.GithubwfPackage#getGlobsItems_Items()
	 * @model required="true"
	 * @generated
	 */
	String getItems();

	/**
	 * Sets the value of the '{@link githubwf.GlobsItems#getItems <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' attribute.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(String value);

} // GlobsItems
