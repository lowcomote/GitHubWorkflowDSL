/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Concurrency Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootConcurrencyTypeString#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootConcurrencyTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface GithubwfRootConcurrencyTypeString extends GithubwfRootConcurrencyAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see #setConcurrency(String)
	 * @see githubwf.GithubwfPackage#getGithubwfRootConcurrencyTypeString_Concurrency()
	 * @model required="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	String getConcurrency();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootConcurrencyTypeString#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(String value);

} // GithubwfRootConcurrencyTypeString
