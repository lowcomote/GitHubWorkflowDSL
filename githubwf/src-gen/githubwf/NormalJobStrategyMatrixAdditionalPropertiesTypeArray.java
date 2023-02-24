/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Strategy Matrix Additional Properties Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeArray#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixAdditionalPropertiesTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface NormalJobStrategyMatrixAdditionalPropertiesTypeArray extends NormalJobStrategyMatrixAdditionalPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixAdditionalPropertiesTypeArray_AdditionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<NormalJobStrategyMatrixAdditionalPropertiesItems> getAdditionalProperties();

} // NormalJobStrategyMatrixAdditionalPropertiesTypeArray
