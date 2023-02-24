/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EnvironmentName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvironmentName()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='The name of the environment configured in the repo.'"
 *        annotation="Comment Comment='https://docs.github.com/en/free-pro-team@latest/actions/reference/workflow-syntax-for-github-actions#example-using-a-single-environment-name'"
 * @generated
 */
public interface EnvironmentName extends EnvironmentPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see githubwf.GithubwfPackage#getEnvironmentName_Name()
	 * @model required="true"
	 *        annotation="Keyword Keyword='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link githubwf.EnvironmentName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EnvironmentName
