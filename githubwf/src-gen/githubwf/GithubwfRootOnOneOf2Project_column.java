/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Project column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Project_column#getProject_column <em>Project column</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Project_column()
 * @model annotation="Description Description='Runs your workflow anytime the project_column event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/projects/columns.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#project-column-event-project_column'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Project_column extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Project column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project column</em>' containment reference.
	 * @see #setProject_column(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Project_column_Project_column()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='project_column'"
	 * @generated
	 */
	EventObject getProject_column();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Project_column#getProject_column <em>Project column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project column</em>' containment reference.
	 * @see #getProject_column()
	 * @generated
	 */
	void setProject_column(EventObject value);

} // GithubwfRootOnOneOf2Project_column
