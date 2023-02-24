/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref One Of0 All Of2 Not Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefOneOf0AllOf2NotTypeNull#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefOneOf0AllOf2NotTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface RefOneOf0AllOf2NotTypeNull extends RefOneOf0AllOf2NotAbstract {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(NullValue)
	 * @see githubwf.GithubwfPackage#getRefOneOf0AllOf2NotTypeNull_Ref()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NullValue getRef();

	/**
	 * Sets the value of the '{@link githubwf.RefOneOf0AllOf2NotTypeNull#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(NullValue value);

} // RefOneOf0AllOf2NotTypeNull
