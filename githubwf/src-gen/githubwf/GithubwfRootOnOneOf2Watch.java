/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Watch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Watch#getWatch <em>Watch</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Watch()
 * @model annotation="Description Description='Runs your workflow anytime the watch event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/activity/starring/.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#watch-event-watch'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Watch extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Watch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watch</em>' containment reference.
	 * @see #setWatch(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Watch_Watch()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='watch'"
	 * @generated
	 */
	EventObject getWatch();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Watch#getWatch <em>Watch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watch</em>' containment reference.
	 * @see #getWatch()
	 * @generated
	 */
	void setWatch(EventObject value);

} // GithubwfRootOnOneOf2Watch
