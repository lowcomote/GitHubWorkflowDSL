/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Delete#getDelete <em>Delete</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Delete()
 * @model annotation="Description Description='Runs your workflow anytime someone deletes a branch or tag, which triggers the delete event. For information about the REST API, see https://developer.github.com/v3/git/refs/#delete-a-reference.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#delete-event-delete'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Delete extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Delete_Delete()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='delete'"
	 * @generated
	 */
	EventObject getDelete();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Delete#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(EventObject value);

} // GithubwfRootOnOneOf2Delete
