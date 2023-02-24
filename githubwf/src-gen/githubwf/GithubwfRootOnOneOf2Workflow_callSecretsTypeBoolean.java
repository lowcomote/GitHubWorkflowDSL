/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Secrets Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean extends GithubwfRootOnOneOf2Workflow_callSecretsAbstract {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' attribute.
	 * @see #setSecrets(Boolean)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean_Secrets()
	 * @model required="true"
	 *        annotation="Keyword Keyword='secrets'"
	 * @generated
	 */
	Boolean getSecrets();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean#getSecrets <em>Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets</em>' attribute.
	 * @see #getSecrets()
	 * @generated
	 */
	void setSecrets(Boolean value);

} // GithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean
