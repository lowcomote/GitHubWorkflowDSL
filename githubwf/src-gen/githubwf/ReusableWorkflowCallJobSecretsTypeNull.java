/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Secrets Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobSecretsTypeNull#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface ReusableWorkflowCallJobSecretsTypeNull extends ReusableWorkflowCallJobSecretsAbstract {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference.
	 * @see #setSecrets(NullValue)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeNull_Secrets()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='secrets'"
	 * @generated
	 */
	NullValue getSecrets();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobSecretsTypeNull#getSecrets <em>Secrets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets</em>' containment reference.
	 * @see #getSecrets()
	 * @generated
	 */
	void setSecrets(NullValue value);

} // ReusableWorkflowCallJobSecretsTypeNull
