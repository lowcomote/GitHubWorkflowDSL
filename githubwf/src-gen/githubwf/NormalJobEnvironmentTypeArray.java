/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Environment Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobEnvironmentTypeArray#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface NormalJobEnvironmentTypeArray extends NormalJobEnvironmentAbstract {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobEnvironmentItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentTypeArray_Environment()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='environment'"
	 * @generated
	 */
	EList<NormalJobEnvironmentItems> getEnvironment();

} // NormalJobEnvironmentTypeArray
