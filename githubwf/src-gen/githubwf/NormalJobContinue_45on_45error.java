/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Continue 45on 45error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContinue_45on_45error#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContinue_45on_45error()
 * @model annotation="Description Description='Prevents a workflow run from failing when a job fails. Set to true to allow a workflow run to pass when this job fails.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idcontinue-on-error'"
 * @generated
 */
public interface NormalJobContinue_45on_45error extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Continue 45on 45error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue 45on 45error</em>' containment reference.
	 * @see #setContinue_45on_45error(NormalJobContinue_45on_45errorAbstract)
	 * @see githubwf.GithubwfPackage#getNormalJobContinue_45on_45error_Continue_45on_45error()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NormalJobContinue_45on_45errorAbstract getContinue_45on_45error();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobContinue_45on_45error#getContinue_45on_45error <em>Continue 45on 45error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue 45on 45error</em>' containment reference.
	 * @see #getContinue_45on_45error()
	 * @generated
	 */
	void setContinue_45on_45error(NormalJobContinue_45on_45errorAbstract value);

} // NormalJobContinue_45on_45error
