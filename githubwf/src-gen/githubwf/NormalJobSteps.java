/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobSteps#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobSteps()
 * @model annotation="Type Type='array'"
 *        annotation="Description Description='A job contains a sequence of tasks called steps. Steps can run commands, run setup tasks, or run an action in your repository, a public repository, or an action published in a Docker registry. Not all steps run actions, but all actions run as a step. Each step runs in its own process in the virtual environment and has access to the workspace and filesystem. Because steps run in their own process, changes to environment variables are not preserved between steps. GitHub provides built-in steps to set up and complete a job.\nMust contain either `uses` or `run`\n'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idsteps'"
 * @generated
 */
public interface NormalJobSteps extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobStepsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobSteps_Steps()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='steps'"
	 * @generated
	 */
	EList<NormalJobStepsItems> getSteps();

} // NormalJobSteps
