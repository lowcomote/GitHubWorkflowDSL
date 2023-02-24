/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Status#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Status()
 * @model annotation="Description Description='Runs your workflow anytime the status of a Git commit changes, which triggers the status event. For information about the REST API, see https://developer.github.com/v3/repos/statuses/.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#status-event-status'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Status extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Status_Status()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='status'"
	 * @generated
	 */
	EventObject getStatus();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Status#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EventObject value);

} // GithubwfRootOnOneOf2Status
