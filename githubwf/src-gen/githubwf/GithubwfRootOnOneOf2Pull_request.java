/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Pull request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Pull_request#getPull_request <em>Pull request</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Pull_request()
 * @model annotation="Description Description='Runs your workflow anytime the pull_request event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/pulls.\nNote: Workflows do not run on private base repositories when you open a pull request from a forked repository.\nWhen you create a pull request from a forked repository to the base repository, GitHub sends the pull_request event to the base repository and no pull request events occur on the forked repository.\nWorkflows don\'t run on forked repositories by default. You must enable GitHub Actions in the Actions tab of the forked repository.\nThe permissions for the GITHUB_TOKEN in forked repositories is read-only. For more information about the GITHUB_TOKEN, see https://help.github.com/en/articles/virtual-environments-for-github-actions.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#pull-request-event-pull_request'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Pull_request extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Pull request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull request</em>' containment reference.
	 * @see #setPull_request(Ref)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Pull_request_Pull_request()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='pull_request'"
	 * @generated
	 */
	Ref getPull_request();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Pull_request#getPull_request <em>Pull request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pull request</em>' containment reference.
	 * @see #getPull_request()
	 * @generated
	 */
	void setPull_request(Ref value);

} // GithubwfRootOnOneOf2Pull_request
