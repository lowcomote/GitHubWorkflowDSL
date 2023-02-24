/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Outputs Additional Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobOutputsAdditionalProperties#getKey <em>Key</em>}</li>
 *   <li>{@link githubwf.NormalJobOutputsAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobOutputsAdditionalProperties()
 * @model annotation="AdditionalProperties AdditionalProperties='true'"
 *        annotation="Type Type='string'"
 * @generated
 */
public interface NormalJobOutputsAdditionalProperties extends NormalJobOutputsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see githubwf.GithubwfPackage#getNormalJobOutputsAdditionalProperties_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobOutputsAdditionalProperties#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' attribute.
	 * @see #setAdditionalProperties(String)
	 * @see githubwf.GithubwfPackage#getNormalJobOutputsAdditionalProperties_AdditionalProperties()
	 * @model required="true"
	 * @generated
	 */
	String getAdditionalProperties();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobOutputsAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' attribute.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(String value);

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

} // NormalJobOutputsAdditionalProperties
