/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Type Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeInteger#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeInteger()
 * @model annotation="ArrayOfTypes ArrayOfTypes='integer'"
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMatrixTypeInteger extends ReusableWorkflowCallJobStrategyMatrixAbstract {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' attribute.
	 * @see #setMatrix(Double)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeInteger_Matrix()
	 * @model required="true"
	 *        annotation="Keyword Keyword='matrix'"
	 * @generated
	 */
	Double getMatrix();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeInteger#getMatrix <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' attribute.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(Double value);

} // ReusableWorkflowCallJobStrategyMatrixTypeInteger
