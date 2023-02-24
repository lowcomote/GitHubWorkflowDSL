/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref One Of0 All Of2 Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefOneOf0AllOf2TypeObject#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefOneOf0AllOf2TypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface RefOneOf0AllOf2TypeObject extends RefOneOf0AllOf2Abstract {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.RefOneOf0AllOf2PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getRefOneOf0AllOf2TypeObject_Ref()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefOneOf0AllOf2PropertiesAbstract> getRef();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // RefOneOf0AllOf2TypeObject
