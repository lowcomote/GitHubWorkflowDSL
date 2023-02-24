/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Url</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.EnvironmentUrl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvironmentUrl()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='A deployment URL'"
 *        annotation="Comment Comment='https://docs.github.com/en/free-pro-team@latest/actions/reference/workflow-syntax-for-github-actions#example-using-environment-name-and-url'"
 * @generated
 */
public interface EnvironmentUrl extends EnvironmentPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see githubwf.GithubwfPackage#getEnvironmentUrl_Url()
	 * @model required="true"
	 *        annotation="Keyword Keyword='url'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link githubwf.EnvironmentUrl#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // EnvironmentUrl
