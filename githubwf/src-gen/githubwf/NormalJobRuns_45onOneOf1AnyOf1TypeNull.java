/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of1 Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeNull#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf1TypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface NormalJobRuns_45onOneOf1AnyOf1TypeNull extends NormalJobRuns_45onOneOf1AnyOf1Abstract {
	/**
	 * Returns the value of the '<em><b>Runs 45on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs 45on</em>' containment reference.
	 * @see #setRuns_45on(NullValue)
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf1TypeNull_Runs_45on()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='runs-on'"
	 * @generated
	 */
	NullValue getRuns_45on();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeNull#getRuns_45on <em>Runs 45on</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs 45on</em>' containment reference.
	 * @see #getRuns_45on()
	 * @generated
	 */
	void setRuns_45on(NullValue value);

} // NormalJobRuns_45onOneOf1AnyOf1TypeNull
