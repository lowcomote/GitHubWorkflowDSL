/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Push</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Push#getPush <em>Push</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Push()
 * @model annotation="Description Description='Runs your workflow when someone pushes to a repository branch, which triggers the push event.\nNote: The webhook payload available to GitHub Actions does not include the added, removed, and modified attributes in the commit object. You can retrieve the full commit object using the REST API. For more information, see https://developer.github.com/v3/repos/commits/#get-a-single-commit.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#push-event-push'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Push extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Push</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Push</em>' containment reference.
	 * @see #setPush(Ref)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Push_Push()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='push'"
	 * @generated
	 */
	Ref getPush();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Push#getPush <em>Push</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Push</em>' containment reference.
	 * @see #getPush()
	 * @generated
	 */
	void setPush(Ref value);

} // GithubwfRootOnOneOf2Push
