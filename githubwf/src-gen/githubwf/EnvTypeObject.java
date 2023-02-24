/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EnvTypeObject#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface EnvTypeObject extends EnvAbstract {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.EnvPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getEnvTypeObject_Env()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvPropertiesAbstract> getEnv();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // EnvTypeObject
