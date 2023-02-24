/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 Timeout 45minutes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1Timeout_45minutes#getTimeout_45minutes <em>Timeout 45minutes</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Timeout_45minutes()
 * @model annotation="Type Type='number'"
 *        annotation="Description Description='The maximum number of minutes to run the step before killing the process.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepstimeout-minutes'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1Timeout_45minutes extends NormalJobStepsItemsAllOf1PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Timeout 45minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout 45minutes</em>' attribute.
	 * @see #setTimeout_45minutes(Double)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Timeout_45minutes_Timeout_45minutes()
	 * @model required="true"
	 *        annotation="Keyword Keyword='timeout-minutes'"
	 * @generated
	 */
	Double getTimeout_45minutes();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1Timeout_45minutes#getTimeout_45minutes <em>Timeout 45minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout 45minutes</em>' attribute.
	 * @see #getTimeout_45minutes()
	 * @generated
	 */
	void setTimeout_45minutes(Double value);

} // NormalJobStepsItemsAllOf1Timeout_45minutes
