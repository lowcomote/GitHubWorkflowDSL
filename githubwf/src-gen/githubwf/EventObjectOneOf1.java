/**
 */
package githubwf;

import jsonMM.NullValue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Object One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EventObjectOneOf1#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEventObjectOneOf1()
 * @model annotation="Type Type='null'"
 * @generated
 */
public interface EventObjectOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Object</em>' containment reference.
	 * @see #setEventObject(NullValue)
	 * @see githubwf.GithubwfPackage#getEventObjectOneOf1_EventObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NullValue getEventObject();

	/**
	 * Sets the value of the '{@link githubwf.EventObjectOneOf1#getEventObject <em>Event Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Object</em>' containment reference.
	 * @see #getEventObject()
	 * @generated
	 */
	void setEventObject(NullValue value);

} // EventObjectOneOf1
