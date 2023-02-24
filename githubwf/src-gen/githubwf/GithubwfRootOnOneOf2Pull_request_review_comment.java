/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Pull request review comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Pull_request_review_comment#getPull_request_review_comment <em>Pull request review comment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Pull_request_review_comment()
 * @model annotation="Description Description='Runs your workflow anytime a comment on a pull request\'s unified diff is modified, which triggers the pull_request_review_comment event. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/pulls/comments.\nNote: Workflows do not run on private base repositories when you open a pull request from a forked repository.\nWhen you create a pull request from a forked repository to the base repository, GitHub sends the pull_request event to the base repository and no pull request events occur on the forked repository.\nWorkflows don\'t run on forked repositories by default. You must enable GitHub Actions in the Actions tab of the forked repository.\nThe permissions for the GITHUB_TOKEN in forked repositories is read-only. For more information about the GITHUB_TOKEN, see https://help.github.com/en/articles/virtual-environments-for-github-actions.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#pull-request-review-comment-event-pull_request_review_comment'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Pull_request_review_comment extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Pull request review comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull request review comment</em>' containment reference.
	 * @see #setPull_request_review_comment(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Pull_request_review_comment_Pull_request_review_comment()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='pull_request_review_comment'"
	 * @generated
	 */
	EventObject getPull_request_review_comment();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Pull_request_review_comment#getPull_request_review_comment <em>Pull request review comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pull request review comment</em>' containment reference.
	 * @see #getPull_request_review_comment()
	 * @generated
	 */
	void setPull_request_review_comment(EventObject value);

} // GithubwfRootOnOneOf2Pull_request_review_comment
