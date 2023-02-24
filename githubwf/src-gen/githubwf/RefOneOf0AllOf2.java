/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref One Of0 All Of2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefOneOf0AllOf2#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefOneOf0AllOf2()
 * @model
 * @generated
 */
public interface RefOneOf0AllOf2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(RefOneOf0AllOf2Abstract)
	 * @see githubwf.GithubwfPackage#getRefOneOf0AllOf2_Ref()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RefOneOf0AllOf2Abstract getRef();

	/**
	 * Sets the value of the '{@link githubwf.RefOneOf0AllOf2#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(RefOneOf0AllOf2Abstract value);

} // RefOneOf0AllOf2
