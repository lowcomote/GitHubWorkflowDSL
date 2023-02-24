/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Project#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Project()
 * @model annotation="Description Description='Runs your workflow anytime the project event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/projects/.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#project-event-project'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Project extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference.
	 * @see #setProject(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Project_Project()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='project'"
	 * @generated
	 */
	EventObject getProject();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Project#getProject <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' containment reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(EventObject value);

} // GithubwfRootOnOneOf2Project
