/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefTypeBoolean#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface RefTypeBoolean extends RefAbstract {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(Boolean)
	 * @see githubwf.GithubwfPackage#getRefTypeBoolean_Ref()
	 * @model required="true"
	 * @generated
	 */
	Boolean getRef();

	/**
	 * Sets the value of the '{@link githubwf.RefTypeBoolean#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Boolean value);

} // RefTypeBoolean
