/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Release#getRelease <em>Release</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Release()
 * @model annotation="Description Description='Runs your workflow anytime the release event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/repos/releases/ in the GitHub Developer documentation.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#release-event-release'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Release extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Release</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' containment reference.
	 * @see #setRelease(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Release_Release()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='release'"
	 * @generated
	 */
	EventObject getRelease();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Release#getRelease <em>Release</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' containment reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(EventObject value);

} // GithubwfRootOnOneOf2Release
