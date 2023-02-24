/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Concurrency Type Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobConcurrencyTypeInteger#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobConcurrencyTypeInteger()
 * @model annotation="ArrayOfTypes ArrayOfTypes='integer'"
 * @generated
 */
public interface NormalJobConcurrencyTypeInteger extends NormalJobConcurrencyAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see #setConcurrency(Double)
	 * @see githubwf.GithubwfPackage#getNormalJobConcurrencyTypeInteger_Concurrency()
	 * @model required="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	Double getConcurrency();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobConcurrencyTypeInteger#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(Double value);

} // NormalJobConcurrencyTypeInteger
