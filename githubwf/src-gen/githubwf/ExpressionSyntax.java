/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ExpressionSyntax#getExpressionSyntax <em>Expression Syntax</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getExpressionSyntax()
 * @model annotation="Type Type='string'"
 *        annotation="Comment Comment='escape `{` and `}` in pattern to be unicode compatible (#1360)'"
 * @generated
 */
public interface ExpressionSyntax extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Syntax</em>' attribute.
	 * @see #setExpressionSyntax(String)
	 * @see githubwf.GithubwfPackage#getExpressionSyntax_ExpressionSyntax()
	 * @model required="true"
	 * @generated
	 */
	String getExpressionSyntax();

	/**
	 * Sets the value of the '{@link githubwf.ExpressionSyntax#getExpressionSyntax <em>Expression Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Syntax</em>' attribute.
	 * @see #getExpressionSyntax()
	 * @generated
	 */
	void setExpressionSyntax(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean regexMatch();

} // ExpressionSyntax
