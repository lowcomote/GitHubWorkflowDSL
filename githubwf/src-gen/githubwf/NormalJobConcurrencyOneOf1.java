/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Concurrency One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobConcurrencyOneOf1#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobConcurrencyOneOf1()
 * @model
 * @generated
 */
public interface NormalJobConcurrencyOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference.
	 * @see #setConcurrency(Concurrency)
	 * @see githubwf.GithubwfPackage#getNormalJobConcurrencyOneOf1_Concurrency()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	Concurrency getConcurrency();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobConcurrencyOneOf1#getConcurrency <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' containment reference.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(Concurrency value);

} // NormalJobConcurrencyOneOf1
