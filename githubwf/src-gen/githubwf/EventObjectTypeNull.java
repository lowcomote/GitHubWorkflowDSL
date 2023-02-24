/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Object Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EventObjectTypeNull#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEventObjectTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface EventObjectTypeNull extends EventObjectAbstract {
	/**
	 * Returns the value of the '<em><b>Event Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Object</em>' containment reference.
	 * @see #setEventObject(NullValue)
	 * @see githubwf.GithubwfPackage#getEventObjectTypeNull_EventObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NullValue getEventObject();

	/**
	 * Sets the value of the '{@link githubwf.EventObjectTypeNull#getEventObject <em>Event Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Object</em>' containment reference.
	 * @see #getEventObject()
	 * @generated
	 */
	void setEventObject(NullValue value);

} // EventObjectTypeNull
