/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EnvOneOf0#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvOneOf0()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface EnvOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.EnvOneOf0PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getEnvOneOf0_Env()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvOneOf0PropertiesAbstract> getEnv();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // EnvOneOf0
