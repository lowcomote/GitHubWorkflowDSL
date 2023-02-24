/**
 */
package githubwf;

import jsonMM.JsonDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type()
 * @model annotation="Enum"
 *        annotation="Description Description='A string representing the type of the input.'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type extends GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(JsonDocument)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type_Type()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='type'"
	 * @generated
	 */
	JsonDocument getType();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JsonDocument value);

} // GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type
