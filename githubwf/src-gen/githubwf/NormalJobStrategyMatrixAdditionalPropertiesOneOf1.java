/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Strategy Matrix Additional Properties One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf1#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixAdditionalPropertiesOneOf1()
 * @model
 * @generated
 */
public interface NormalJobStrategyMatrixAdditionalPropertiesOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference.
	 * @see #setAdditionalProperties(ExpressionSyntax)
	 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixAdditionalPropertiesOneOf1_AdditionalProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionSyntax getAdditionalProperties();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf1#getAdditionalProperties <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' containment reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(ExpressionSyntax value);

} // NormalJobStrategyMatrixAdditionalPropertiesOneOf1
