/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Object One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EventObjectOneOf0#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEventObjectOneOf0()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface EventObjectOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Object</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.EventObjectOneOf0PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Object</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getEventObjectOneOf0_EventObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventObjectOneOf0PropertiesAbstract> getEventObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // EventObjectOneOf0
