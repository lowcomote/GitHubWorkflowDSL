/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Environment One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobEnvironmentOneOf1#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentOneOf1()
 * @model
 * @generated
 */
public interface NormalJobEnvironmentOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentOneOf1_Environment()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='environment'"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobEnvironmentOneOf1#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

} // NormalJobEnvironmentOneOf1
