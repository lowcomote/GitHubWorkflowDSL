/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EnvTypeArray#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface EnvTypeArray extends EnvAbstract {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.EnvItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getEnvTypeArray_Env()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvItems> getEnv();

} // EnvTypeArray
