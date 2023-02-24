/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Secrets Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobSecretsTypeNumber#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface ReusableWorkflowCallJobSecretsTypeNumber extends ReusableWorkflowCallJobSecretsAbstract {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' attribute.
	 * @see #setSecrets(Double)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeNumber_Secrets()
	 * @model required="true"
	 *        annotation="Keyword Keyword='secrets'"
	 * @generated
	 */
	Double getSecrets();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobSecretsTypeNumber#getSecrets <em>Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets</em>' attribute.
	 * @see #getSecrets()
	 * @generated
	 */
	void setSecrets(Double value);

} // ReusableWorkflowCallJobSecretsTypeNumber
