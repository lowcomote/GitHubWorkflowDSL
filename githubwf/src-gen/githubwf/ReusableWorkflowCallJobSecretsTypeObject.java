/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Secrets Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobSecretsTypeObject#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface ReusableWorkflowCallJobSecretsTypeObject extends ReusableWorkflowCallJobSecretsAbstract {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ReusableWorkflowCallJobSecretsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsTypeObject_Secrets()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='secrets'"
	 * @generated
	 */
	EList<ReusableWorkflowCallJobSecretsPropertiesAbstract> getSecrets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ReusableWorkflowCallJobSecretsTypeObject
