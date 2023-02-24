/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf1#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixOneOf1()
 * @model
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMatrixOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference.
	 * @see #setMatrix(ExpressionSyntax)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixOneOf1_Matrix()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='matrix'"
	 * @generated
	 */
	ExpressionSyntax getMatrix();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf1#getMatrix <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' containment reference.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(ExpressionSyntax value);

} // ReusableWorkflowCallJobStrategyMatrixOneOf1
