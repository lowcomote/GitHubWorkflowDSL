/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Credentials Username</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ContainerCredentialsUsername#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainerCredentialsUsername()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface ContainerCredentialsUsername extends ContainerCredentialsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see githubwf.GithubwfPackage#getContainerCredentialsUsername_Username()
	 * @model required="true"
	 *        annotation="Keyword Keyword='username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link githubwf.ContainerCredentialsUsername#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

} // ContainerCredentialsUsername
