/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeNull#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMatrixTypeNull extends ReusableWorkflowCallJobStrategyMatrixAbstract {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference.
	 * @see #setMatrix(NullValue)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeNull_Matrix()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='matrix'"
	 * @generated
	 */
	NullValue getMatrix();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeNull#getMatrix <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' containment reference.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(NullValue value);

} // ReusableWorkflowCallJobStrategyMatrixTypeNull
