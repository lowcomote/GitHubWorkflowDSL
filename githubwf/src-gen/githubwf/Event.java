/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Event#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEvent()
 * @model annotation="Enum"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows'"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(JsonDocument)
	 * @see githubwf.GithubwfPackage#getEvent_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getEvent();

	/**
	 * Sets the value of the '{@link githubwf.Event#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(JsonDocument value);

} // Event
