/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default#getDefault_ <em>Default </em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default()
 * @model annotation="Description Description='A string representing the default value. The default value is used when an input parameter isn\'t specified in a workflow file.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/metadata-syntax-for-github-actions#inputsinput_iddefault'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default extends GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Default </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default </em>' containment reference.
	 * @see #setDefault_(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstract)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default_Default_()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstract getDefault_();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default#getDefault_ <em>Default </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default </em>' containment reference.
	 * @see #getDefault_()
	 * @generated
	 */
	void setDefault_(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstract value);

} // GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default
