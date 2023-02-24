/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefTypeNumber#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface RefTypeNumber extends RefAbstract {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(Double)
	 * @see githubwf.GithubwfPackage#getRefTypeNumber_Ref()
	 * @model required="true"
	 * @generated
	 */
	Double getRef();

	/**
	 * Sets the value of the '{@link githubwf.RefTypeNumber#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Double value);

} // RefTypeNumber
