/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1Name#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Name()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='A name for your step to display on GitHub.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepsname'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1Name extends NormalJobStepsItemsAllOf1PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Name_Name()
	 * @model required="true"
	 *        annotation="Keyword Keyword='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1Name#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NormalJobStepsItemsAllOf1Name
