/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env One Of0 Additional Properties Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EnvOneOf0AdditionalPropertiesTypeObject#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvOneOf0AdditionalPropertiesTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface EnvOneOf0AdditionalPropertiesTypeObject extends EnvOneOf0AdditionalPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.EnvOneOf0AdditionalPropertiesPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getEnvOneOf0AdditionalPropertiesTypeObject_AdditionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvOneOf0AdditionalPropertiesPropertiesAbstract> getAdditionalProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // EnvOneOf0AdditionalPropertiesTypeObject
