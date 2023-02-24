/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1Run#getRun <em>Run</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Run()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='Runs command-line programs using the operating system\'s shell. If you do not provide a name, the step name will default to the text specified in the run command.\nCommands run using non-login shells by default. You can choose a different shell and customize the shell used to run commands. For more information, see https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#using-a-specific-shell.\nEach run keyword represents a new process and shell in the virtual environment. When you provide multi-line commands, each line runs in the same shell.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepsrun'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1Run extends NormalJobStepsItemsAllOf1PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' attribute.
	 * @see #setRun(String)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Run_Run()
	 * @model required="true"
	 *        annotation="Keyword Keyword='run'"
	 * @generated
	 */
	String getRun();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1Run#getRun <em>Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run</em>' attribute.
	 * @see #getRun()
	 * @generated
	 */
	void setRun(String value);

} // NormalJobStepsItemsAllOf1Run
