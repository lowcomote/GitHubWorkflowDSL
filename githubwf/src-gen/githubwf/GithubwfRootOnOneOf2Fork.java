/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Fork#getFork <em>Fork</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Fork()
 * @model annotation="Description Description='Runs your workflow anytime when someone forks a repository, which triggers the fork event. For information about the REST API, see https://developer.github.com/v3/repos/forks/#create-a-fork.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#fork-event-fork'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Fork extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Fork</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' containment reference.
	 * @see #setFork(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Fork_Fork()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='fork'"
	 * @generated
	 */
	EventObject getFork();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Fork#getFork <em>Fork</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork</em>' containment reference.
	 * @see #getFork()
	 * @generated
	 */
	void setFork(EventObject value);

} // GithubwfRootOnOneOf2Fork
