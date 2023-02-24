/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobWith#getWith <em>With</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobWith()
 * @model annotation="Description Description='A map of inputs that are passed to the called workflow. Any inputs that you pass must match the input specifications defined in the called workflow. Unlike \'jobs.&lt;job_id&gt;.steps[*].with\', the inputs you pass with \'jobs.&lt;job_id&gt;.with\' are not be available as environment variables in the called workflow. Instead, you can reference the inputs by using the inputs context.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#jobsjob_idwith'"
 * @generated
 */
public interface ReusableWorkflowCallJobWith extends ReusableWorkflowCallJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' containment reference.
	 * @see #setWith(Env)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobWith_With()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='with'"
	 * @generated
	 */
	Env getWith();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobWith#getWith <em>With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With</em>' containment reference.
	 * @see #getWith()
	 * @generated
	 */
	void setWith(Env value);

} // ReusableWorkflowCallJobWith
