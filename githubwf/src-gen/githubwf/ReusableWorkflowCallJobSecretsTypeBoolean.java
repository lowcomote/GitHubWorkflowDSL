/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Secrets Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobSecretsTypeBoolean#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface ReusableWorkflowCallJobSecretsTypeBoolean extends ReusableWorkflowCallJobSecretsAbstract {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' attribute.
	 * @see #setSecrets(Boolean)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeBoolean_Secrets()
	 * @model required="true"
	 *        annotation="Keyword Keyword='secrets'"
	 * @generated
	 */
	Boolean getSecrets();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobSecretsTypeBoolean#getSecrets <em>Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets</em>' attribute.
	 * @see #getSecrets()
	 * @generated
	 */
	void setSecrets(Boolean value);

} // ReusableWorkflowCallJobSecretsTypeBoolean
