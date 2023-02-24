/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Discussion comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Discussion_comment#getDiscussion_comment <em>Discussion comment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Discussion_comment()
 * @model annotation="Description Description='Runs your workflow anytime the discussion_comment event occurs. More than one activity type triggers this event. For information about the GraphQL API, see https://docs.github.com/en/graphql/guides/using-the-graphql-api-for-discussions'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/reference/events-that-trigger-workflows#discussion_comment'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Discussion_comment extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Discussion comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion comment</em>' containment reference.
	 * @see #setDiscussion_comment(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Discussion_comment_Discussion_comment()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='discussion_comment'"
	 * @generated
	 */
	EventObject getDiscussion_comment();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Discussion_comment#getDiscussion_comment <em>Discussion comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discussion comment</em>' containment reference.
	 * @see #getDiscussion_comment()
	 * @generated
	 */
	void setDiscussion_comment(EventObject value);

} // GithubwfRootOnOneOf2Discussion_comment
