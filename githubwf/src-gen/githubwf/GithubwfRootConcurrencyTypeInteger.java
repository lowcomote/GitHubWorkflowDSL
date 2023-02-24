/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Concurrency Type Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootConcurrencyTypeInteger#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootConcurrencyTypeInteger()
 * @model annotation="ArrayOfTypes ArrayOfTypes='integer'"
 * @generated
 */
public interface GithubwfRootConcurrencyTypeInteger extends GithubwfRootConcurrencyAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see #setConcurrency(Double)
	 * @see githubwf.GithubwfPackage#getGithubwfRootConcurrencyTypeInteger_Concurrency()
	 * @model required="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	Double getConcurrency();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootConcurrencyTypeInteger#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(Double value);

} // GithubwfRootConcurrencyTypeInteger
