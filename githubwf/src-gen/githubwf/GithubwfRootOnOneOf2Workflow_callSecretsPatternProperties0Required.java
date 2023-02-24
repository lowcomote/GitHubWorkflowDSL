/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Secrets Pattern Properties0 Required</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required()
 * @model annotation="Description Description='A boolean specifying whether the secret must be supplied.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#onworkflow_callsecretssecret_idrequired'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required extends GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required_Required()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract getRequired();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract value);

} // GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required
