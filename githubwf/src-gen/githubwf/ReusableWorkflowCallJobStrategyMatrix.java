/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrix#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrix()
 * @model annotation="Description Description='A build matrix is a set of different configurations of the virtual environment. For example you might run a job against more than one supported version of a language, operating system, or tool. Each configuration is a copy of the job that runs and reports a status.\nYou can specify a matrix by supplying an array for the configuration options. For example, if the GitHub virtual environment supports Node.js versions 6, 8, and 10 you could specify an array of those versions in the matrix.\nWhen you define a matrix of operating systems, you must set the required runs-on keyword to the operating system of the current job, rather than hard-coding the operating system name. To access the operating system name, you can use the matrix.os context parameter to set runs-on. For more information, see https://help.github.com/en/articles/contexts-and-expression-syntax-for-github-actions.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstrategymatrix'"
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMatrix extends ReusableWorkflowCallJobStrategyPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference.
	 * @see #setMatrix(ReusableWorkflowCallJobStrategyMatrixAbstract)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrix_Matrix()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReusableWorkflowCallJobStrategyMatrixAbstract getMatrix();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobStrategyMatrix#getMatrix <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' containment reference.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(ReusableWorkflowCallJobStrategyMatrixAbstract value);

} // ReusableWorkflowCallJobStrategyMatrix
