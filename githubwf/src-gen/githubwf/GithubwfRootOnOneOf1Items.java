/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of1 Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf1Items#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf1Items()
 * @model
 * @generated
 */
public interface GithubwfRootOnOneOf1Items extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Event)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf1Items_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getItems();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf1Items#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Event value);

} // GithubwfRootOnOneOf1Items
