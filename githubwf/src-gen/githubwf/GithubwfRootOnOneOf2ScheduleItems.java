/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Schedule Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2ScheduleItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ScheduleItems()
 * @model
 * @generated
 */
public interface GithubwfRootOnOneOf2ScheduleItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(GithubwfRootOnOneOf2ScheduleItemsAbstract)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ScheduleItems_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2ScheduleItemsAbstract getItems();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2ScheduleItems#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(GithubwfRootOnOneOf2ScheduleItemsAbstract value);

} // GithubwfRootOnOneOf2ScheduleItems
