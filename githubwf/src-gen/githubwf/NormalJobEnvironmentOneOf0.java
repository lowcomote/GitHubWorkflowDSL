/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Environment One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobEnvironmentOneOf0#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentOneOf0()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface NormalJobEnvironmentOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentOneOf0_Environment()
	 * @model required="true"
	 *        annotation="Keyword Keyword='environment'"
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobEnvironmentOneOf0#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

} // NormalJobEnvironmentOneOf0
