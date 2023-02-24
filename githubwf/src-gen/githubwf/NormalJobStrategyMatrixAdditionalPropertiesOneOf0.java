/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Strategy Matrix Additional Properties One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixAdditionalPropertiesOneOf0()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface NormalJobStrategyMatrixAdditionalPropertiesOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixAdditionalPropertiesOneOf0_AdditionalProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items> getAdditionalProperties();

} // NormalJobStrategyMatrixAdditionalPropertiesOneOf0
