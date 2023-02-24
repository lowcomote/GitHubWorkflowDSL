/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Label#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Label()
 * @model annotation="Description Description='Runs your workflow anytime the label event occurs. More than one activity type triggers this event. For information about the REST API, see https://developer.github.com/v3/issues/labels/.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#label-event-label'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Label extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Label_Label()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='label'"
	 * @generated
	 */
	EventObject getLabel();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Label#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(EventObject value);

} // GithubwfRootOnOneOf2Label
