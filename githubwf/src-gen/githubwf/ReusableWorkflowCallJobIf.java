/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobIf#getIf_ <em>If </em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobIf()
 * @model annotation="Description Description='You can use the if conditional to prevent a job from running unless a condition is met. You can use any supported context and expression to create a conditional.\nExpressions in an if conditional do not require the ${{ }} syntax. For more information, see https://help.github.com/en/articles/contexts-and-expression-syntax-for-github-actions.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idif'"
 * @generated
 */
public interface ReusableWorkflowCallJobIf extends ReusableWorkflowCallJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>If </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If </em>' containment reference.
	 * @see #setIf_(ReusableWorkflowCallJobIfAbstract)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobIf_If_()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReusableWorkflowCallJobIfAbstract getIf_();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobIf#getIf_ <em>If </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If </em>' containment reference.
	 * @see #getIf_()
	 * @generated
	 */
	void setIf_(ReusableWorkflowCallJobIfAbstract value);

} // ReusableWorkflowCallJobIf
