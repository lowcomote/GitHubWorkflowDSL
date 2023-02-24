/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Concurrency Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootConcurrencyTypeBoolean#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootConcurrencyTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface GithubwfRootConcurrencyTypeBoolean extends GithubwfRootConcurrencyAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see #setConcurrency(Boolean)
	 * @see githubwf.GithubwfPackage#getGithubwfRootConcurrencyTypeBoolean_Concurrency()
	 * @model required="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	Boolean getConcurrency();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootConcurrencyTypeBoolean#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(Boolean value);

} // GithubwfRootConcurrencyTypeBoolean
