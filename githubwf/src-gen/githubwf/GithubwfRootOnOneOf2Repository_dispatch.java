/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Repository dispatch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Repository_dispatch#getRepository_dispatch <em>Repository dispatch</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Repository_dispatch()
 * @model annotation="Description Description='You can use the GitHub API to trigger a webhook event called repository_dispatch when you want to trigger a workflow for activity that happens outside of GitHub. For more information, see https://developer.github.com/v3/repos/#create-a-repository-dispatch-event.\nTo trigger the custom repository_dispatch webhook event, you must send a POST request to a GitHub API endpoint and provide an event_type name to describe the activity type. To trigger a workflow run, you must also configure your workflow to use the repository_dispatch event.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#external-events-repository_dispatch'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Repository_dispatch extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Repository dispatch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository dispatch</em>' containment reference.
	 * @see #setRepository_dispatch(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Repository_dispatch_Repository_dispatch()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='repository_dispatch'"
	 * @generated
	 */
	EventObject getRepository_dispatch();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Repository_dispatch#getRepository_dispatch <em>Repository dispatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository dispatch</em>' containment reference.
	 * @see #getRepository_dispatch()
	 * @generated
	 */
	void setRepository_dispatch(EventObject value);

} // GithubwfRootOnOneOf2Repository_dispatch
