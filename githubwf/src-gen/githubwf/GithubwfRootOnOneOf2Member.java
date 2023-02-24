/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Member#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Member()
 * @model annotation="Description Description='Runs your workflow anytime the member event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/repos/collaborators/.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#member-event-member'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Member extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference.
	 * @see #setMember(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Member_Member()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='member'"
	 * @generated
	 */
	EventObject getMember();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Member#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(EventObject value);

} // GithubwfRootOnOneOf2Member
