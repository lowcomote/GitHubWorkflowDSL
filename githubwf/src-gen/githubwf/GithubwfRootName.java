/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootName()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='The name of your workflow. GitHub displays the names of your workflows on your repository\'s actions page. If you omit this field, GitHub sets the name to the workflow\'s filename.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#name'"
 * @generated
 */
public interface GithubwfRootName extends GithubwfRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see githubwf.GithubwfPackage#getGithubwfRootName_Name()
	 * @model required="true"
	 *        annotation="Keyword Keyword='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GithubwfRootName
