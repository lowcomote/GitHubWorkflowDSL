/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Max 45parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMax_45parallel#getMax_45parallel <em>Max 45parallel</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMax_45parallel()
 * @model annotation="Type Type='number'"
 *        annotation="Description Description='The maximum number of jobs that can run simultaneously when using a matrix job strategy. By default, GitHub will maximize the number of jobs run in parallel depending on the available runners on GitHub-hosted virtual machines.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstrategymax-parallel'"
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMax_45parallel extends ReusableWorkflowCallJobStrategyPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Max 45parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max 45parallel</em>' attribute.
	 * @see #setMax_45parallel(Double)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMax_45parallel_Max_45parallel()
	 * @model required="true"
	 *        annotation="Keyword Keyword='max-parallel'"
	 * @generated
	 */
	Double getMax_45parallel();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobStrategyMax_45parallel#getMax_45parallel <em>Max 45parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max 45parallel</em>' attribute.
	 * @see #getMax_45parallel()
	 * @generated
	 */
	void setMax_45parallel(Double value);

} // ReusableWorkflowCallJobStrategyMax_45parallel
