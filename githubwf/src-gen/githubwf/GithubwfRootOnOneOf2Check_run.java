/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Check run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Check_run#getCheck_run <em>Check run</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Check_run()
 * @model annotation="Description Description='Runs your workflow anytime the check_run event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/checks/runs.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#check-run-event-check_run'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Check_run extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Check run</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check run</em>' containment reference.
	 * @see #setCheck_run(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Check_run_Check_run()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='check_run'"
	 * @generated
	 */
	EventObject getCheck_run();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Check_run#getCheck_run <em>Check run</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check run</em>' containment reference.
	 * @see #getCheck_run()
	 * @generated
	 */
	void setCheck_run(EventObject value);

} // GithubwfRootOnOneOf2Check_run
