/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 Uses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1Uses#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Uses()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='Selects an action to run as part of a step in your job. An action is a reusable unit of code. You can use an action defined in the same repository as the workflow, a public repository, or in a published Docker container image (https://hub.docker.com/).\nWe strongly recommend that you include the version of the action you are using by specifying a Git ref, SHA, or Docker tag number. If you don\'t specify a version, it could break your workflows or cause unexpected behavior when the action owner publishes an update.\n- Using the commit SHA of a released action version is the safest for stability and security.\n- Using the specific major action version allows you to receive critical fixes and security patches while still maintaining compatibility. It also assures that your workflow should still work.\n- Using the master branch of an action may be convenient, but if someone releases a new major version with a breaking change, your workflow could break.\nSome actions require inputs that you must set using the with keyword. Review the action\'s README file to determine the inputs required.\nActions are either JavaScript files or Docker containers. If the action you\'re using is a Docker container you must run the job in a Linux virtual environment. For more details, see https://help.github.com/en/articles/virtual-environments-for-github-actions.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepsuses'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1Uses extends NormalJobStepsItemsAllOf1PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' attribute.
	 * @see #setUses(String)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Uses_Uses()
	 * @model required="true"
	 *        annotation="Keyword Keyword='uses'"
	 * @generated
	 */
	String getUses();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1Uses#getUses <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' attribute.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(String value);

} // NormalJobStepsItemsAllOf1Uses
