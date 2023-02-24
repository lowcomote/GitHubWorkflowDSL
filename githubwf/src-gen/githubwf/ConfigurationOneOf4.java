/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration One Of4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConfigurationOneOf4#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConfigurationOneOf4()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface ConfigurationOneOf4 extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ConfigurationOneOf4Items}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getConfigurationOneOf4_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationOneOf4Items> getConfiguration();

} // ConfigurationOneOf4
