/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Additional Properties Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray extends ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_AdditionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems> getAdditionalProperties();

} // ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray
