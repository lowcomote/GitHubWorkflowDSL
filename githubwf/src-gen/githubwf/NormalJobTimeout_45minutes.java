/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Timeout 45minutes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobTimeout_45minutes#getTimeout_45minutes <em>Timeout 45minutes</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobTimeout_45minutes()
 * @model annotation="Type Type='number'"
 *        annotation="Description Description='The maximum number of minutes to let a workflow run before GitHub automatically cancels it. Default: 360'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idtimeout-minutes'"
 *        annotation="Default Default='360.0'"
 * @generated
 */
public interface NormalJobTimeout_45minutes extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Timeout 45minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout 45minutes</em>' attribute.
	 * @see #setTimeout_45minutes(Double)
	 * @see githubwf.GithubwfPackage#getNormalJobTimeout_45minutes_Timeout_45minutes()
	 * @model required="true"
	 *        annotation="Keyword Keyword='timeout-minutes'"
	 * @generated
	 */
	Double getTimeout_45minutes();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobTimeout_45minutes#getTimeout_45minutes <em>Timeout 45minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout 45minutes</em>' attribute.
	 * @see #getTimeout_45minutes()
	 * @generated
	 */
	void setTimeout_45minutes(Double value);

} // NormalJobTimeout_45minutes
