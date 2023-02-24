/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Secrets One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobSecretsOneOf0#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsOneOf0()
 * @model
 * @generated
 */
public interface ReusableWorkflowCallJobSecretsOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference.
	 * @see #setSecrets(Env)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsOneOf0_Secrets()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='secrets'"
	 * @generated
	 */
	Env getSecrets();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobSecretsOneOf0#getSecrets <em>Secrets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets</em>' containment reference.
	 * @see #getSecrets()
	 * @generated
	 */
	void setSecrets(Env value);

} // ReusableWorkflowCallJobSecretsOneOf0
