/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConfigurationTypeObject#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConfigurationTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface ConfigurationTypeObject extends ConfigurationAbstract {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ConfigurationPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getConfigurationTypeObject_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationPropertiesAbstract> getConfiguration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ConfigurationTypeObject
