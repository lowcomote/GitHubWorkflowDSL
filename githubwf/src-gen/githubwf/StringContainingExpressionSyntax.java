/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Containing Expression Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.StringContainingExpressionSyntax#getStringContainingExpressionSyntax <em>String Containing Expression Syntax</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getStringContainingExpressionSyntax()
 * @model annotation="Type Type='string'"
 *        annotation="Comment Comment='escape `{` and `}` in pattern to be unicode compatible (#1360)'"
 * @generated
 */
public interface StringContainingExpressionSyntax extends EObject {
	/**
	 * Returns the value of the '<em><b>String Containing Expression Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Containing Expression Syntax</em>' attribute.
	 * @see #setStringContainingExpressionSyntax(String)
	 * @see githubwf.GithubwfPackage#getStringContainingExpressionSyntax_StringContainingExpressionSyntax()
	 * @model required="true"
	 * @generated
	 */
	String getStringContainingExpressionSyntax();

	/**
	 * Sets the value of the '{@link githubwf.StringContainingExpressionSyntax#getStringContainingExpressionSyntax <em>String Containing Expression Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Containing Expression Syntax</em>' attribute.
	 * @see #getStringContainingExpressionSyntax()
	 * @generated
	 */
	void setStringContainingExpressionSyntax(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean regexMatch();

} // StringContainingExpressionSyntax
