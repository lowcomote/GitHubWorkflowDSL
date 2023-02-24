/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45onTypeNull#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface NormalJobRuns_45onTypeNull extends NormalJobRuns_45onAbstract {
	/**
	 * Returns the value of the '<em><b>Runs 45on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs 45on</em>' containment reference.
	 * @see #setRuns_45on(NullValue)
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onTypeNull_Runs_45on()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='runs-on'"
	 * @generated
	 */
	NullValue getRuns_45on();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobRuns_45onTypeNull#getRuns_45on <em>Runs 45on</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs 45on</em>' containment reference.
	 * @see #getRuns_45on()
	 * @generated
	 */
	void setRuns_45on(NullValue value);

} // NormalJobRuns_45onTypeNull
