/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Environment Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobEnvironmentTypeObject#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface NormalJobEnvironmentTypeObject extends NormalJobEnvironmentAbstract {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobEnvironmentPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentTypeObject_Environment()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='environment'"
	 * @generated
	 */
	EList<NormalJobEnvironmentPropertiesAbstract> getEnvironment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobEnvironmentTypeObject
