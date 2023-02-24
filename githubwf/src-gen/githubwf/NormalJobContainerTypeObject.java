/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Container Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContainerTypeObject#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContainerTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface NormalJobContainerTypeObject extends NormalJobContainerAbstract {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobContainerPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobContainerTypeObject_Container()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='container'"
	 * @generated
	 */
	EList<NormalJobContainerPropertiesAbstract> getContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobContainerTypeObject
