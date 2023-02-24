/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Issues</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Issues#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Issues()
 * @model annotation="Description Description='Runs your workflow anytime the issues event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/issues.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#issues-event-issues'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Issues extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference.
	 * @see #setIssues(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Issues_Issues()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='issues'"
	 * @generated
	 */
	EventObject getIssues();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Issues#getIssues <em>Issues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issues</em>' containment reference.
	 * @see #getIssues()
	 * @generated
	 */
	void setIssues(EventObject value);

} // GithubwfRootOnOneOf2Issues
