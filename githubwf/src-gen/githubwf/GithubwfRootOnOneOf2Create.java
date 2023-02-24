/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Create#getCreate <em>Create</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Create()
 * @model annotation="Description Description='Runs your workflow anytime someone creates a branch or tag, which triggers the create event. For information about the REST API, see https://developer.github.com/v3/git/refs/#create-a-reference.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#create-event-create'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Create extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' containment reference.
	 * @see #setCreate(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Create_Create()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='create'"
	 * @generated
	 */
	EventObject getCreate();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Create#getCreate <em>Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' containment reference.
	 * @see #getCreate()
	 * @generated
	 */
	void setCreate(EventObject value);

} // GithubwfRootOnOneOf2Create
