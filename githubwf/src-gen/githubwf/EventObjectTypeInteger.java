/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Object Type Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EventObjectTypeInteger#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEventObjectTypeInteger()
 * @model annotation="ArrayOfTypes ArrayOfTypes='integer'"
 * @generated
 */
public interface EventObjectTypeInteger extends EventObjectAbstract {
	/**
	 * Returns the value of the '<em><b>Event Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Object</em>' attribute.
	 * @see #setEventObject(Double)
	 * @see githubwf.GithubwfPackage#getEventObjectTypeInteger_EventObject()
	 * @model required="true"
	 * @generated
	 */
	Double getEventObject();

	/**
	 * Sets the value of the '{@link githubwf.EventObjectTypeInteger#getEventObject <em>Event Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Object</em>' attribute.
	 * @see #getEventObject()
	 * @generated
	 */
	void setEventObject(Double value);

} // EventObjectTypeInteger
