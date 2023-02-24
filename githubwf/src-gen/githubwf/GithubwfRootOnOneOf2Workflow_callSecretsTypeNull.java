/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Secrets Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeNull#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callSecretsTypeNull extends GithubwfRootOnOneOf2Workflow_callSecretsAbstract {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference.
	 * @see #setSecrets(NullValue)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsTypeNull_Secrets()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='secrets'"
	 * @generated
	 */
	NullValue getSecrets();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeNull#getSecrets <em>Secrets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets</em>' containment reference.
	 * @see #getSecrets()
	 * @generated
	 */
	void setSecrets(NullValue value);

} // GithubwfRootOnOneOf2Workflow_callSecretsTypeNull
