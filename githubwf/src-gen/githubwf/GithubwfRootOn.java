/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOn#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOn()
 * @model annotation="Description Description='The name of the GitHub event that triggers the workflow. You can provide a single event string, array of events, array of event types, or an event configuration map that schedules a workflow or restricts the execution of a workflow to specific files, tags, or branch changes. For a list of available events, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#on'"
 * @generated
 */
public interface GithubwfRootOn extends GithubwfRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference.
	 * @see #setOn(GithubwfRootOnAbstract)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOn_On()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GithubwfRootOnAbstract getOn();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOn#getOn <em>On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' containment reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(GithubwfRootOnAbstract value);

} // GithubwfRootOn
