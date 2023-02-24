/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref One Of0 All Of2 Not Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefOneOf0AllOf2NotTypeArray#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefOneOf0AllOf2NotTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface RefOneOf0AllOf2NotTypeArray extends RefOneOf0AllOf2NotAbstract {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.RefOneOf0AllOf2NotItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getRefOneOf0AllOf2NotTypeArray_Ref()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefOneOf0AllOf2NotItems> getRef();

} // RefOneOf0AllOf2NotTypeArray
