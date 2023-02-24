/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Object Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EventObjectTypeBoolean#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEventObjectTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface EventObjectTypeBoolean extends EventObjectAbstract {
	/**
	 * Returns the value of the '<em><b>Event Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Object</em>' attribute.
	 * @see #setEventObject(Boolean)
	 * @see githubwf.GithubwfPackage#getEventObjectTypeBoolean_EventObject()
	 * @model required="true"
	 * @generated
	 */
	Boolean getEventObject();

	/**
	 * Sets the value of the '{@link githubwf.EventObjectTypeBoolean#getEventObject <em>Event Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Object</em>' attribute.
	 * @see #getEventObject()
	 * @generated
	 */
	void setEventObject(Boolean value);

} // EventObjectTypeBoolean
