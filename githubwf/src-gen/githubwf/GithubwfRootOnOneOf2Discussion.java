/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Discussion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Discussion#getDiscussion <em>Discussion</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Discussion()
 * @model annotation="Description Description='Runs your workflow anytime the discussion event occurs. More than one activity type triggers this event. For information about the GraphQL API, see https://docs.github.com/en/graphql/guides/using-the-graphql-api-for-discussions'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/reference/events-that-trigger-workflows#discussion'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Discussion extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Discussion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion</em>' containment reference.
	 * @see #setDiscussion(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Discussion_Discussion()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='discussion'"
	 * @generated
	 */
	EventObject getDiscussion();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Discussion#getDiscussion <em>Discussion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discussion</em>' containment reference.
	 * @see #getDiscussion()
	 * @generated
	 */
	void setDiscussion(EventObject value);

} // GithubwfRootOnOneOf2Discussion
