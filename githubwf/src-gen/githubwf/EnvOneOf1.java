/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EnvOneOf1#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvOneOf1()
 * @model
 * @generated
 */
public interface EnvOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference.
	 * @see #setEnv(StringContainingExpressionSyntax)
	 * @see githubwf.GithubwfPackage#getEnvOneOf1_Env()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringContainingExpressionSyntax getEnv();

	/**
	 * Sets the value of the '{@link githubwf.EnvOneOf1#getEnv <em>Env</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' containment reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(StringContainingExpressionSyntax value);

} // EnvOneOf1
