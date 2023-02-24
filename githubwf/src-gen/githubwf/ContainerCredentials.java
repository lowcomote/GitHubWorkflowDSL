/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Credentials</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ContainerCredentials#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link githubwf.ContainerCredentials#getUsername <em>Username</em>}</li>
 *   <li>{@link githubwf.ContainerCredentials#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainerCredentials()
 * @model annotation="Type Type='object'"
 *        annotation="Description Description='If the image\'s container registry requires authentication to pull the image, you can use credentials to set a map of the username and password. The credentials are the same values that you would provide to the `docker login` command.'"
 *        annotation="Comment Comment='https://docs.github.com/en/free-pro-team@latest/actions/reference/workflow-syntax-for-github-actions#jobsjob_idcontainercredentials'"
 * @generated
 */
public interface ContainerCredentials extends ContainerPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ContainerCredentialsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getContainerCredentials_Credentials()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='credentials'"
	 * @generated
	 */
	EList<ContainerCredentialsPropertiesAbstract> getCredentials();

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see githubwf.GithubwfPackage#getContainerCredentials_Username()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see githubwf.GithubwfPackage#getContainerCredentials_Password()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ContainerCredentials
