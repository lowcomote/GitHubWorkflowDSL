/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of0 Type Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeInteger#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf0TypeInteger()
 * @model annotation="ArrayOfTypes ArrayOfTypes='integer'"
 * @generated
 */
public interface NormalJobRuns_45onOneOf1AnyOf0TypeInteger extends NormalJobRuns_45onOneOf1AnyOf0Abstract {
	/**
	 * Returns the value of the '<em><b>Runs 45on</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs 45on</em>' attribute.
	 * @see #setRuns_45on(Double)
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf0TypeInteger_Runs_45on()
	 * @model required="true"
	 *        annotation="Keyword Keyword='runs-on'"
	 * @generated
	 */
	Double getRuns_45on();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeInteger#getRuns_45on <em>Runs 45on</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs 45on</em>' attribute.
	 * @see #getRuns_45on()
	 * @generated
	 */
	void setRuns_45on(Double value);

} // NormalJobRuns_45onOneOf1AnyOf0TypeInteger
