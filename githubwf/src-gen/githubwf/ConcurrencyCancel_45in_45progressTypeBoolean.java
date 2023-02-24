/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency Cancel 45in 45progress Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConcurrencyCancel_45in_45progressTypeBoolean#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConcurrencyCancel_45in_45progressTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface ConcurrencyCancel_45in_45progressTypeBoolean extends ConcurrencyCancel_45in_45progressAbstract {
	/**
	 * Returns the value of the '<em><b>Cancel 45in 45progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel 45in 45progress</em>' attribute.
	 * @see #setCancel_45in_45progress(Boolean)
	 * @see githubwf.GithubwfPackage#getConcurrencyCancel_45in_45progressTypeBoolean_Cancel_45in_45progress()
	 * @model required="true"
	 *        annotation="Keyword Keyword='cancel-in-progress'"
	 * @generated
	 */
	Boolean getCancel_45in_45progress();

	/**
	 * Sets the value of the '{@link githubwf.ConcurrencyCancel_45in_45progressTypeBoolean#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel 45in 45progress</em>' attribute.
	 * @see #getCancel_45in_45progress()
	 * @generated
	 */
	void setCancel_45in_45progress(Boolean value);

} // ConcurrencyCancel_45in_45progressTypeBoolean
