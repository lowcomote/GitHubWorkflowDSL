/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Gollum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Gollum#getGollum <em>Gollum</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Gollum()
 * @model annotation="Description Description='Runs your workflow when someone creates or updates a Wiki page, which triggers the gollum event.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#gollum-event-gollum'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Gollum extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Gollum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gollum</em>' containment reference.
	 * @see #setGollum(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Gollum_Gollum()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='gollum'"
	 * @generated
	 */
	EventObject getGollum();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Gollum#getGollum <em>Gollum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gollum</em>' containment reference.
	 * @see #getGollum()
	 * @generated
	 */
	void setGollum(EventObject value);

} // GithubwfRootOnOneOf2Gollum
