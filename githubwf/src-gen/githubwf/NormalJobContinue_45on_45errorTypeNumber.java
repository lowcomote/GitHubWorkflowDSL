/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Continue 45on 45error Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContinue_45on_45errorTypeNumber#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContinue_45on_45errorTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface NormalJobContinue_45on_45errorTypeNumber extends NormalJobContinue_45on_45errorAbstract {
	/**
	 * Returns the value of the '<em><b>Continue 45on 45error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue 45on 45error</em>' attribute.
	 * @see #setContinue_45on_45error(Double)
	 * @see githubwf.GithubwfPackage#getNormalJobContinue_45on_45errorTypeNumber_Continue_45on_45error()
	 * @model required="true"
	 *        annotation="Keyword Keyword='continue-on-error'"
	 * @generated
	 */
	Double getContinue_45on_45error();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobContinue_45on_45errorTypeNumber#getContinue_45on_45error <em>Continue 45on 45error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue 45on 45error</em>' attribute.
	 * @see #getContinue_45on_45error()
	 * @generated
	 */
	void setContinue_45on_45error(Double value);

} // NormalJobContinue_45on_45errorTypeNumber
