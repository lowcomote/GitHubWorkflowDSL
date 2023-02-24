/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Concurrency Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobConcurrencyTypeNull#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobConcurrencyTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface NormalJobConcurrencyTypeNull extends NormalJobConcurrencyAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference.
	 * @see #setConcurrency(NullValue)
	 * @see githubwf.GithubwfPackage#getNormalJobConcurrencyTypeNull_Concurrency()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	NullValue getConcurrency();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobConcurrencyTypeNull#getConcurrency <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' containment reference.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(NullValue value);

} // NormalJobConcurrencyTypeNull
