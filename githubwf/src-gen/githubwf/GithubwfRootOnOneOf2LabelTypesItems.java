/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Label Types Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2LabelTypesItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2LabelTypesItems()
 * @model annotation="Enum"
 * @generated
 */
public interface GithubwfRootOnOneOf2LabelTypesItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(JsonDocument)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2LabelTypesItems_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getItems();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2LabelTypesItems#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(JsonDocument value);

} // GithubwfRootOnOneOf2LabelTypesItems
