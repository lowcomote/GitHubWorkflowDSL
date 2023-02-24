/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Milestone#getMilestone <em>Milestone</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Milestone()
 * @model annotation="Description Description='Runs your workflow anytime the milestone event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/issues/milestones/.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#milestone-event-milestone'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Milestone extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestone</em>' containment reference.
	 * @see #setMilestone(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Milestone_Milestone()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='milestone'"
	 * @generated
	 */
	EventObject getMilestone();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Milestone#getMilestone <em>Milestone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milestone</em>' containment reference.
	 * @see #getMilestone()
	 * @generated
	 */
	void setMilestone(EventObject value);

} // GithubwfRootOnOneOf2Milestone
