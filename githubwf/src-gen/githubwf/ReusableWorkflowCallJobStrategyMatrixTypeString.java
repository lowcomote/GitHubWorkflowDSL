/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeString#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMatrixTypeString extends ReusableWorkflowCallJobStrategyMatrixAbstract {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' attribute.
	 * @see #setMatrix(String)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixTypeString_Matrix()
	 * @model required="true"
	 *        annotation="Keyword Keyword='matrix'"
	 * @generated
	 */
	String getMatrix();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeString#getMatrix <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' attribute.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(String value);

} // ReusableWorkflowCallJobStrategyMatrixTypeString
