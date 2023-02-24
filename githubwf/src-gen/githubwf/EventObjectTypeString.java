/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Object Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EventObjectTypeString#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEventObjectTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface EventObjectTypeString extends EventObjectAbstract {
	/**
	 * Returns the value of the '<em><b>Event Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Object</em>' attribute.
	 * @see #setEventObject(String)
	 * @see githubwf.GithubwfPackage#getEventObjectTypeString_EventObject()
	 * @model required="true"
	 * @generated
	 */
	String getEventObject();

	/**
	 * Sets the value of the '{@link githubwf.EventObjectTypeString#getEventObject <em>Event Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Object</em>' attribute.
	 * @see #getEventObject()
	 * @generated
	 */
	void setEventObject(String value);

} // EventObjectTypeString
