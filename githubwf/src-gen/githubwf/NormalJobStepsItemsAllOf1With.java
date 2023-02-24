/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1With#getWith <em>With</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1With()
 * @model annotation="Description Description='A map of the input parameters defined by the action. Each input parameter is a key/value pair. Input parameters are set as environment variables. The variable is prefixed with INPUT_ and converted to upper case.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepswith'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1With extends NormalJobStepsItemsAllOf1PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' containment reference.
	 * @see #setWith(Env)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1With_With()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='with'"
	 * @generated
	 */
	Env getWith();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1With#getWith <em>With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With</em>' containment reference.
	 * @see #getWith()
	 * @generated
	 */
	void setWith(Env value);

} // NormalJobStepsItemsAllOf1With
