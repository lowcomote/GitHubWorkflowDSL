/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Page build</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Page_build#getPage_build <em>Page build</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Page_build()
 * @model annotation="Description Description='Runs your workflow anytime someone pushes to a GitHub Pages-enabled branch, which triggers the page_build event. For information about the REST API, see https://developer.github.com/v3/repos/pages/.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#page-build-event-page_build'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Page_build extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Page build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page build</em>' containment reference.
	 * @see #setPage_build(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Page_build_Page_build()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='page_build'"
	 * @generated
	 */
	EventObject getPage_build();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Page_build#getPage_build <em>Page build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page build</em>' containment reference.
	 * @see #getPage_build()
	 * @generated
	 */
	void setPage_build(EventObject value);

} // GithubwfRootOnOneOf2Page_build
