/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Merge group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Merge_group#getMerge_group <em>Merge group</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Merge_group()
 * @model annotation="Description Description='Runs your workflow when a pull request is added to a merge queue, which adds the pull request to a merge group. For information about the merge queue, see https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/incorporating-changes-from-a-pull-request/merging-a-pull-request-with-a-merge-queue .'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#merge_group'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Merge_group extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Merge group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge group</em>' containment reference.
	 * @see #setMerge_group(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Merge_group_Merge_group()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='merge_group'"
	 * @generated
	 */
	EventObject getMerge_group();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Merge_group#getMerge_group <em>Merge group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge group</em>' containment reference.
	 * @see #getMerge_group()
	 * @generated
	 */
	void setMerge_group(EventObject value);

} // GithubwfRootOnOneOf2Merge_group
