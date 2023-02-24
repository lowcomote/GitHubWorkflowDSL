/**
 */
package githubwf;

import jsonMM.JsonDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Secrets Additional Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobSecretsAdditionalProperties#getKey <em>Key</em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJobSecretsAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsAdditionalProperties()
 * @model annotation="AdditionalProperties AdditionalProperties='true'"
 * @generated
 */
public interface ReusableWorkflowCallJobSecretsAdditionalProperties extends ReusableWorkflowCallJobSecretsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsAdditionalProperties_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobSecretsAdditionalProperties#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference.
	 * @see #setAdditionalProperties(JsonDocument)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobSecretsAdditionalProperties_AdditionalProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getAdditionalProperties();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobSecretsAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' containment reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(JsonDocument value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String validateKeyOnDefinedPatternProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String validateKeyOnDefinedProperties();

} // ReusableWorkflowCallJobSecretsAdditionalProperties
