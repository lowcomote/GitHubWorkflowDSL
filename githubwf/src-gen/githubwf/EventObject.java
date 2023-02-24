/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EventObject#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEventObject()
 * @model
 * @generated
 */
public interface EventObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Object</em>' containment reference.
	 * @see #setEventObject(EventObjectAbstract)
	 * @see githubwf.GithubwfPackage#getEventObject_EventObject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventObjectAbstract getEventObject();

	/**
	 * Sets the value of the '{@link githubwf.EventObject#getEventObject <em>Event Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Object</em>' containment reference.
	 * @see #getEventObject()
	 * @generated
	 */
	void setEventObject(EventObjectAbstract value);

} // EventObject
