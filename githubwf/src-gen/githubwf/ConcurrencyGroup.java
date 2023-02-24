/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConcurrencyGroup#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConcurrencyGroup()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='When a concurrent job or workflow is queued, if another job or workflow using the same concurrency group in the repository is in progress, the queued job or workflow will be pending. Any previously pending job or workflow in the concurrency group will be canceled.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#example-using-concurrency-to-cancel-any-in-progress-job-or-run-1'"
 * @generated
 */
public interface ConcurrencyGroup extends ConcurrencyPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see githubwf.GithubwfPackage#getConcurrencyGroup_Group()
	 * @model required="true"
	 *        annotation="Keyword Keyword='group'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link githubwf.ConcurrencyGroup#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

} // ConcurrencyGroup
