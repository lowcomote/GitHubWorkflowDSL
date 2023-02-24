/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeArray#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMatrixTypeArray extends ReusableWorkflowCallJobStrategyMatrixAbstract {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ReusableWorkflowCallJobStrategyMatrixItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeArray_Matrix()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='matrix'"
	 * @generated
	 */
	EList<ReusableWorkflowCallJobStrategyMatrixItems> getMatrix();

} // ReusableWorkflowCallJobStrategyMatrixTypeArray
