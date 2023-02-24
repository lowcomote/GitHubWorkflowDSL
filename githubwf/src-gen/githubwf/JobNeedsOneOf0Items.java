/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Needs One Of0 Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.JobNeedsOneOf0Items#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getJobNeedsOneOf0Items()
 * @model
 * @generated
 */
public interface JobNeedsOneOf0Items extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Name)
	 * @see githubwf.GithubwfPackage#getJobNeedsOneOf0Items_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Name getItems();

	/**
	 * Sets the value of the '{@link githubwf.JobNeedsOneOf0Items#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Name value);

} // JobNeedsOneOf0Items
