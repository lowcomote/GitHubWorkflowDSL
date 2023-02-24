/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Container Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContainerTypeArray#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContainerTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface NormalJobContainerTypeArray extends NormalJobContainerAbstract {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobContainerItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobContainerTypeArray_Container()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='container'"
	 * @generated
	 */
	EList<NormalJobContainerItems> getContainer();

} // NormalJobContainerTypeArray
