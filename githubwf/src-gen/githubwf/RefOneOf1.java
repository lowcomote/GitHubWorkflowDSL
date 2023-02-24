/**
 */
package githubwf;

import jsonMM.NullValue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefOneOf1#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefOneOf1()
 * @model annotation="Type Type='null'"
 * @generated
 */
public interface RefOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(NullValue)
	 * @see githubwf.GithubwfPackage#getRefOneOf1_Ref()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NullValue getRef();

	/**
	 * Sets the value of the '{@link githubwf.RefOneOf1#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(NullValue value);

} // RefOneOf1
