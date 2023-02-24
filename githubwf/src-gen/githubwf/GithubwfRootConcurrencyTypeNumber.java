/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Concurrency Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootConcurrencyTypeNumber#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootConcurrencyTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface GithubwfRootConcurrencyTypeNumber extends GithubwfRootConcurrencyAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see #setConcurrency(Double)
	 * @see githubwf.GithubwfPackage#getGithubwfRootConcurrencyTypeNumber_Concurrency()
	 * @model required="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	Double getConcurrency();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootConcurrencyTypeNumber#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(Double value);

} // GithubwfRootConcurrencyTypeNumber
