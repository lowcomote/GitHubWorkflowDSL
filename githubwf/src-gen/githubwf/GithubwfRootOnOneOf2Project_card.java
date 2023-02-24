/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Project card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Project_card#getProject_card <em>Project card</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Project_card()
 * @model annotation="Description Description='Runs your workflow anytime the project_card event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/projects/cards.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#project-card-event-project_card'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Project_card extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Project card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project card</em>' containment reference.
	 * @see #setProject_card(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Project_card_Project_card()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='project_card'"
	 * @generated
	 */
	EventObject getProject_card();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Project_card#getProject_card <em>Project card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project card</em>' containment reference.
	 * @see #getProject_card()
	 * @generated
	 */
	void setProject_card(EventObject value);

} // GithubwfRootOnOneOf2Project_card
