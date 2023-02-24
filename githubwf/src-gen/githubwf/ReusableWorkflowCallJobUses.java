/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Uses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobUses#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobUses()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='The location and version of a reusable workflow file to run as a job, of the form \'./{path/to}/{localfile}.yml\' or \'{owner}/{repo}/{path}/{filename}@{ref}\'. {ref} can be a SHA, a release tag, or a branch name. Using the commit SHA is the safest for stability and security.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/learn-github-actions/workflow-syntax-for-github-actions#jobsjob_iduses'"
 * @generated
 */
public interface ReusableWorkflowCallJobUses extends ReusableWorkflowCallJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' attribute.
	 * @see #setUses(String)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobUses_Uses()
	 * @model required="true"
	 *        annotation="Keyword Keyword='uses'"
	 * @generated
	 */
	String getUses();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobUses#getUses <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' attribute.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean regexMatch();

} // ReusableWorkflowCallJobUses
