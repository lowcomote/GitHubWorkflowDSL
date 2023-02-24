/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Schedule Items Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeNull#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ScheduleItemsTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface GithubwfRootOnOneOf2ScheduleItemsTypeNull extends GithubwfRootOnOneOf2ScheduleItemsAbstract {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(NullValue)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ScheduleItemsTypeNull_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NullValue getItems();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeNull#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(NullValue value);

} // GithubwfRootOnOneOf2ScheduleItemsTypeNull
