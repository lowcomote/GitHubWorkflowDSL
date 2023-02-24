/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Secrets Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobSecretsTypeString#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface ReusableWorkflowCallJobSecretsTypeString extends ReusableWorkflowCallJobSecretsAbstract {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' attribute.
	 * @see #setSecrets(String)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeString_Secrets()
	 * @model required="true"
	 *        annotation="Keyword Keyword='secrets'"
	 * @generated
	 */
	String getSecrets();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobSecretsTypeString#getSecrets <em>Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets</em>' attribute.
	 * @see #getSecrets()
	 * @generated
	 */
	void setSecrets(String value);

} // ReusableWorkflowCallJobSecretsTypeString
