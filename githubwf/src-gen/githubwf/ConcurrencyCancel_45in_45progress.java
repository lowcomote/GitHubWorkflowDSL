/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency Cancel 45in 45progress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConcurrencyCancel_45in_45progress#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConcurrencyCancel_45in_45progress()
 * @model annotation="Description Description='To cancel any currently running job or workflow in the same concurrency group, specify cancel-in-progress: true.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#example-using-concurrency-to-cancel-any-in-progress-job-or-run-1'"
 * @generated
 */
public interface ConcurrencyCancel_45in_45progress extends ConcurrencyPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Cancel 45in 45progress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel 45in 45progress</em>' containment reference.
	 * @see #setCancel_45in_45progress(ConcurrencyCancel_45in_45progressAbstract)
	 * @see githubwf.GithubwfPackage#getConcurrencyCancel_45in_45progress_Cancel_45in_45progress()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConcurrencyCancel_45in_45progressAbstract getCancel_45in_45progress();

	/**
	 * Sets the value of the '{@link githubwf.ConcurrencyCancel_45in_45progress#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel 45in 45progress</em>' containment reference.
	 * @see #getCancel_45in_45progress()
	 * @generated
	 */
	void setCancel_45in_45progress(ConcurrencyCancel_45in_45progressAbstract value);

} // ConcurrencyCancel_45in_45progress
