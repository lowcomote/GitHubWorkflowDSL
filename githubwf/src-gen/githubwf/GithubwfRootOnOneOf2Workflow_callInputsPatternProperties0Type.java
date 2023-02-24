/**
 */
package githubwf;

import jsonMM.JsonDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Inputs Pattern Properties0 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type()
 * @model annotation="Enum"
 *        annotation="Description Description='Required if input is defined for the on.workflow_call keyword. The value of this parameter is a string specifying the data type of the input. This must be one of: boolean, number, or string.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#onworkflow_callinput_idtype'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type extends GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(JsonDocument)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type_Type()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='type'"
	 * @generated
	 */
	JsonDocument getType();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JsonDocument value);

} // GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type
