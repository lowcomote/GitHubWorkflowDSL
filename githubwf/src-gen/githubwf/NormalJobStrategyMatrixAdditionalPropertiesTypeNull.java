/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Strategy Matrix Additional Properties Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeNull#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixAdditionalPropertiesTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface NormalJobStrategyMatrixAdditionalPropertiesTypeNull extends NormalJobStrategyMatrixAdditionalPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference.
	 * @see #setAdditionalProperties(NullValue)
	 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixAdditionalPropertiesTypeNull_AdditionalProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NullValue getAdditionalProperties();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeNull#getAdditionalProperties <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' containment reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(NullValue value);

} // NormalJobStrategyMatrixAdditionalPropertiesTypeNull
