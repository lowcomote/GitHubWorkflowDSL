/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Credentials Password</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ContainerCredentialsPassword#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainerCredentialsPassword()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface ContainerCredentialsPassword extends ContainerCredentialsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see githubwf.GithubwfPackage#getContainerCredentialsPassword_Password()
	 * @model required="true"
	 *        annotation="Keyword Keyword='password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link githubwf.ContainerCredentialsPassword#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // ContainerCredentialsPassword
