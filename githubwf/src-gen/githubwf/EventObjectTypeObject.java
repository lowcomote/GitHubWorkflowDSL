/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Object Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EventObjectTypeObject#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEventObjectTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface EventObjectTypeObject extends EventObjectAbstract {
	/**
	 * Returns the value of the '<em><b>Event Object</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.EventObjectPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Object</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getEventObjectTypeObject_EventObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventObjectPropertiesAbstract> getEventObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // EventObjectTypeObject
