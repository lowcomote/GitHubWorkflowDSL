/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Pull request target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Pull_request_target#getPull_request_target <em>Pull request target</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Pull_request_target()
 * @model annotation="Description Description='This event is similar to pull_request, except that it runs in the context of the base repository of the pull request, rather than in the merge commit. This means that you can more safely make your secrets available to the workflows triggered by the pull request, because only workflows defined in the commit on the base repository are run. For example, this event allows you to create workflows that label and comment on pull requests, based on the contents of the event payload.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/reference/events-that-trigger-workflows#pull_request_target'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Pull_request_target extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Pull request target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull request target</em>' containment reference.
	 * @see #setPull_request_target(Ref)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Pull_request_target_Pull_request_target()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='pull_request_target'"
	 * @generated
	 */
	Ref getPull_request_target();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Pull_request_target#getPull_request_target <em>Pull request target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pull request target</em>' containment reference.
	 * @see #getPull_request_target()
	 * @generated
	 */
	void setPull_request_target(Ref value);

} // GithubwfRootOnOneOf2Pull_request_target
