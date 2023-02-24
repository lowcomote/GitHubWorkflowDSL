/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Inputs Pattern Properties0 Required</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required()
 * @model annotation="Type Type='boolean'"
 *        annotation="Description Description='A boolean to indicate whether the action requires the input parameter. Set to true when the parameter is required.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/metadata-syntax-for-github-actions#inputsinput_idrequired'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required extends GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(Boolean)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required_Required()
	 * @model required="true"
	 *        annotation="Keyword Keyword='required'"
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

} // GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required
