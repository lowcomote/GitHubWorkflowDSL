/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Secrets Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobSecretsTypeArray#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface ReusableWorkflowCallJobSecretsTypeArray extends ReusableWorkflowCallJobSecretsAbstract {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ReusableWorkflowCallJobSecretsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeArray_Secrets()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='secrets'"
	 * @generated
	 */
	EList<ReusableWorkflowCallJobSecretsItems> getSecrets();

} // ReusableWorkflowCallJobSecretsTypeArray
