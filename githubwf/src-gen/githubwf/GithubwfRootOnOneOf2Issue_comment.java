/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Issue comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Issue_comment#getIssue_comment <em>Issue comment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Issue_comment()
 * @model annotation="Description Description='Runs your workflow anytime the issue_comment event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/issues/comments/.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#issue-comment-event-issue_comment'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Issue_comment extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Issue comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue comment</em>' containment reference.
	 * @see #setIssue_comment(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Issue_comment_Issue_comment()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='issue_comment'"
	 * @generated
	 */
	EventObject getIssue_comment();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Issue_comment#getIssue_comment <em>Issue comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue comment</em>' containment reference.
	 * @see #getIssue_comment()
	 * @generated
	 */
	void setIssue_comment(EventObject value);

} // GithubwfRootOnOneOf2Issue_comment
