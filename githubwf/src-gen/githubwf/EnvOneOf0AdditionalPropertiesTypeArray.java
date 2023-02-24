/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env One Of0 Additional Properties Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EnvOneOf0AdditionalPropertiesTypeArray#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvOneOf0AdditionalPropertiesTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface EnvOneOf0AdditionalPropertiesTypeArray extends EnvOneOf0AdditionalPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.EnvOneOf0AdditionalPropertiesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getEnvOneOf0AdditionalPropertiesTypeArray_AdditionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvOneOf0AdditionalPropertiesItems> getAdditionalProperties();

} // EnvOneOf0AdditionalPropertiesTypeArray
