/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 Continue 45on 45error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45error#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Continue_45on_45error()
 * @model annotation="Description Description='Prevents a job from failing when a step fails. Set to true to allow a job to pass when this step fails.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepscontinue-on-error'"
 *        annotation="Default Default='false'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1Continue_45on_45error extends NormalJobStepsItemsAllOf1PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Continue 45on 45error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue 45on 45error</em>' containment reference.
	 * @see #setContinue_45on_45error(NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Continue_45on_45error_Continue_45on_45error()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract getContinue_45on_45error();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45error#getContinue_45on_45error <em>Continue 45on 45error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue 45on 45error</em>' containment reference.
	 * @see #getContinue_45on_45error()
	 * @generated
	 */
	void setContinue_45on_45error(NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract value);

} // NormalJobStepsItemsAllOf1Continue_45on_45error
