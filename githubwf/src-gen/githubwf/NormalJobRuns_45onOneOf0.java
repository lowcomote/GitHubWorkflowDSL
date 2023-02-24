/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45onOneOf0#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf0()
 * @model annotation="Enum"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#github-hosted-runners'"
 * @generated
 */
public interface NormalJobRuns_45onOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Runs 45on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs 45on</em>' containment reference.
	 * @see #setRuns_45on(JsonDocument)
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf0_Runs_45on()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='runs-on'"
	 * @generated
	 */
	JsonDocument getRuns_45on();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobRuns_45onOneOf0#getRuns_45on <em>Runs 45on</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs 45on</em>' containment reference.
	 * @see #getRuns_45on()
	 * @generated
	 */
	void setRuns_45on(JsonDocument value);

} // NormalJobRuns_45onOneOf0
