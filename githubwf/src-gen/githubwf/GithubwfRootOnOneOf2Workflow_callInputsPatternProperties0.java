/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Inputs Pattern Properties0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0#getKey <em>Key</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0#getDescription <em>Description</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0#getDeprecationMessage <em>Deprecation Message</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0#getRequired <em>Required</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0#getType <em>Type</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0#getDefault_ <em>Default </em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0()
 * @model annotation="PatternProperties PatternProperties='true' pattern='^[_a-zA-Z][a-zA-Z0-9_-]*$'"
 *        annotation="Type Type='object'"
 *        annotation="Description Description='A string identifier to associate with the input. The value of &lt;input_id&gt; is a map of the input\'s metadata. The &lt;input_id&gt; must be a unique identifier within the inputs object. The &lt;input_id&gt; must start with a letter or _ and contain only alphanumeric characters, -, or _.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/creating-actions/metadata-syntax-for-github-actions#inputsinput_id'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0 extends GithubwfRootOnOneOf2Workflow_callInputsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Pattern Properties0</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Properties0</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_PatternProperties0()
	 * @model containment="true"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstract> getPatternProperties0();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_Description()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Deprecation Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecation Message</em>' attribute.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_DeprecationMessage()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getDeprecationMessage();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_Required()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_Type()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	JsonDocument getType();

	/**
	 * Returns the value of the '<em><b>Default </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default </em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_Default_()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract getDefault_();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" toBeEvaluatedRequired="true"
	 * @generated
	 */
	boolean find(String toBeEvaluated);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean find();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String validateKeyOnDefinedPatternProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String validateKeyOnDefinedProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0
