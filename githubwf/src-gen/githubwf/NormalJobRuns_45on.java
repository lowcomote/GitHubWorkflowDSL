/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45on#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45on()
 * @model annotation="Description Description='The type of machine to run the job on. The machine can be either a GitHub-hosted runner, or a self-hosted runner.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idruns-on'"
 * @generated
 */
public interface NormalJobRuns_45on extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Runs 45on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs 45on</em>' containment reference.
	 * @see #setRuns_45on(NormalJobRuns_45onAbstract)
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45on_Runs_45on()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NormalJobRuns_45onAbstract getRuns_45on();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobRuns_45on#getRuns_45on <em>Runs 45on</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs 45on</em>' containment reference.
	 * @see #getRuns_45on()
	 * @generated
	 */
	void setRuns_45on(NormalJobRuns_45onAbstract value);

} // NormalJobRuns_45on
