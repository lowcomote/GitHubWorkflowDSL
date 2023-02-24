/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ContainerOptions#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainerOptions()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='Additional Docker container resource options. For a list of options, see https://docs.docker.com/engine/reference/commandline/create/#options.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idcontaineroptions'"
 * @generated
 */
public interface ContainerOptions extends ContainerPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute.
	 * @see #setOptions(String)
	 * @see githubwf.GithubwfPackage#getContainerOptions_Options()
	 * @model required="true"
	 *        annotation="Keyword Keyword='options'"
	 * @generated
	 */
	String getOptions();

	/**
	 * Sets the value of the '{@link githubwf.ContainerOptions#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' attribute.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(String value);

} // ContainerOptions
