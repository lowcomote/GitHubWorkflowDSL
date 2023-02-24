/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Jobs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootJobs#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootJobs()
 * @model annotation="Type Type='object'"
 *        annotation="Description Description='A workflow run is made up of one or more jobs. Jobs run in parallel by default. To run jobs sequentially, you can define dependencies on other jobs using the jobs.&lt;job_id&gt;.needs keyword.\nEach job runs in a fresh instance of the virtual environment specified by runs-on.\nYou can run an unlimited number of jobs as long as you are within the workflow usage limits. For more information, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#usage-limits.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobs'"
 * @generated
 */
public interface GithubwfRootJobs extends GithubwfRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootJobsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootJobs_Jobs()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='jobs'"
	 * @generated
	 */
	EList<GithubwfRootJobsPropertiesAbstract> getJobs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRootJobs
