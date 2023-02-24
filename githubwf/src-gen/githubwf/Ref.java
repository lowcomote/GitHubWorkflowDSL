/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Ref#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRef()
 * @model
 * @generated
 */
public interface Ref extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(RefAbstract)
	 * @see githubwf.GithubwfPackage#getRef_Ref()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RefAbstract getRef();

	/**
	 * Sets the value of the '{@link githubwf.Ref#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(RefAbstract value);

} // Ref
