/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Continue 45on 45error Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContinue_45on_45errorTypeNull#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContinue_45on_45errorTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface NormalJobContinue_45on_45errorTypeNull extends NormalJobContinue_45on_45errorAbstract {
	/**
	 * Returns the value of the '<em><b>Continue 45on 45error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue 45on 45error</em>' containment reference.
	 * @see #setContinue_45on_45error(NullValue)
	 * @see githubwf.GithubwfPackage#getNormalJobContinue_45on_45errorTypeNull_Continue_45on_45error()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='continue-on-error'"
	 * @generated
	 */
	NullValue getContinue_45on_45error();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobContinue_45on_45errorTypeNull#getContinue_45on_45error <em>Continue 45on 45error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue 45on 45error</em>' containment reference.
	 * @see #getContinue_45on_45error()
	 * @generated
	 */
	void setContinue_45on_45error(NullValue value);

} // NormalJobContinue_45on_45errorTypeNull
