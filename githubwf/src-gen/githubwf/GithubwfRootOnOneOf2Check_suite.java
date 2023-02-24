/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Check suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Check_suite#getCheck_suite <em>Check suite</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Check_suite()
 * @model annotation="Description Description='Runs your workflow anytime the check_suite event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/checks/suites/.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#check-suite-event-check_suite'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Check_suite extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Check suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check suite</em>' containment reference.
	 * @see #setCheck_suite(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Check_suite_Check_suite()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='check_suite'"
	 * @generated
	 */
	EventObject getCheck_suite();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Check_suite#getCheck_suite <em>Check suite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check suite</em>' containment reference.
	 * @see #getCheck_suite()
	 * @generated
	 */
	void setCheck_suite(EventObject value);

} // GithubwfRootOnOneOf2Check_suite
