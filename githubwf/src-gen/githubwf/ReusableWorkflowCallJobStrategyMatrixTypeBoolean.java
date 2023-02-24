/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeBoolean#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMatrixTypeBoolean extends ReusableWorkflowCallJobStrategyMatrixAbstract {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' attribute.
	 * @see #setMatrix(Boolean)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeBoolean_Matrix()
	 * @model required="true"
	 *        annotation="Keyword Keyword='matrix'"
	 * @generated
	 */
	Boolean getMatrix();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeBoolean#getMatrix <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' attribute.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(Boolean value);

} // ReusableWorkflowCallJobStrategyMatrixTypeBoolean
