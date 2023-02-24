/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Concurrency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobConcurrency#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobConcurrency()
 * @model annotation="Description Description='Concurrency ensures that only a single job or workflow using the same concurrency group will run at a time. A concurrency group can be any string or expression. The expression can use any context except for the secrets context. \nYou can also specify concurrency at the workflow level. \nWhen a concurrent job or workflow is queued, if another job or workflow using the same concurrency group in the repository is in progress, the queued job or workflow will be pending. Any previously pending job or workflow in the concurrency group will be canceled. To also cancel any currently running job or workflow in the same concurrency group, specify cancel-in-progress: true.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idconcurrency'"
 * @generated
 */
public interface NormalJobConcurrency extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference.
	 * @see #setConcurrency(NormalJobConcurrencyAbstract)
	 * @see githubwf.GithubwfPackage#getNormalJobConcurrency_Concurrency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NormalJobConcurrencyAbstract getConcurrency();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobConcurrency#getConcurrency <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' containment reference.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(NormalJobConcurrencyAbstract value);

} // NormalJobConcurrency
