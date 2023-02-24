/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Run 45name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootRun_45name#getRun_45name <em>Run 45name</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootRun_45name()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='The name for workflow runs generated from the workflow. GitHub displays the workflow run name in the list of workflow runs on your repository\'s \'Actions\' tab.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#run-name'"
 * @generated
 */
public interface GithubwfRootRun_45name extends GithubwfRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Run 45name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run 45name</em>' attribute.
	 * @see #setRun_45name(String)
	 * @see githubwf.GithubwfPackage#getGithubwfRootRun_45name_Run_45name()
	 * @model required="true"
	 *        annotation="Keyword Keyword='run-name'"
	 * @generated
	 */
	String getRun_45name();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootRun_45name#getRun_45name <em>Run 45name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run 45name</em>' attribute.
	 * @see #getRun_45name()
	 * @generated
	 */
	void setRun_45name(String value);

} // GithubwfRootRun_45name
