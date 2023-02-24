/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Public</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Public#getPublic_ <em>Public </em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Public()
 * @model annotation="Description Description='Runs your workflow anytime someone makes a private repository public, which triggers the public event. For information about the REST API, see https://developer.github.com/v3/repos/#edit.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#public-event-public'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Public extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Public </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public </em>' containment reference.
	 * @see #setPublic_(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Public_Public_()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='public'"
	 * @generated
	 */
	EventObject getPublic_();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Public#getPublic_ <em>Public </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public </em>' containment reference.
	 * @see #getPublic_()
	 * @generated
	 */
	void setPublic_(EventObject value);

} // GithubwfRootOnOneOf2Public
