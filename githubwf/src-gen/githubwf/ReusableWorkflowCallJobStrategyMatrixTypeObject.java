/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeObject#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMatrixTypeObject extends ReusableWorkflowCallJobStrategyMatrixAbstract {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ReusableWorkflowCallJobStrategyMatrixPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeObject_Matrix()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='matrix'"
	 * @generated
	 */
	EList<ReusableWorkflowCallJobStrategyMatrixPropertiesAbstract> getMatrix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ReusableWorkflowCallJobStrategyMatrixTypeObject
