/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Object Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EventObjectTypeArray#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEventObjectTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface EventObjectTypeArray extends EventObjectAbstract {
	/**
	 * Returns the value of the '<em><b>Event Object</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.EventObjectItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Object</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getEventObjectTypeArray_EventObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventObjectItems> getEventObject();

} // EventObjectTypeArray
