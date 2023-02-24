/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency Cancel 45in 45progress One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConcurrencyCancel_45in_45progressOneOf1#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConcurrencyCancel_45in_45progressOneOf1()
 * @model
 * @generated
 */
public interface ConcurrencyCancel_45in_45progressOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Cancel 45in 45progress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel 45in 45progress</em>' containment reference.
	 * @see #setCancel_45in_45progress(ExpressionSyntax)
	 * @see githubwf.GithubwfPackage#getConcurrencyCancel_45in_45progressOneOf1_Cancel_45in_45progress()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='cancel-in-progress'"
	 * @generated
	 */
	ExpressionSyntax getCancel_45in_45progress();

	/**
	 * Sets the value of the '{@link githubwf.ConcurrencyCancel_45in_45progressOneOf1#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel 45in 45progress</em>' containment reference.
	 * @see #getCancel_45in_45progress()
	 * @generated
	 */
	void setCancel_45in_45progress(ExpressionSyntax value);

} // ConcurrencyCancel_45in_45progressOneOf1
