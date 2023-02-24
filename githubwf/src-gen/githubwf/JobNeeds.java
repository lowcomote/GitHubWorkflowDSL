/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Needs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.JobNeeds#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getJobNeeds()
 * @model annotation="Description Description='Identifies any jobs that must complete successfully before this job will run. It can be a string or array of strings. If a job fails, all jobs that need it are skipped unless the jobs use a conditional statement that causes the job to continue.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idneeds'"
 * @generated
 */
public interface JobNeeds extends EObject {
	/**
	 * Returns the value of the '<em><b>Job Needs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Needs</em>' containment reference.
	 * @see #setJobNeeds(JobNeedsAbstract)
	 * @see githubwf.GithubwfPackage#getJobNeeds_JobNeeds()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JobNeedsAbstract getJobNeeds();

	/**
	 * Sets the value of the '{@link githubwf.JobNeeds#getJobNeeds <em>Job Needs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Needs</em>' containment reference.
	 * @see #getJobNeeds()
	 * @generated
	 */
	void setJobNeeds(JobNeedsAbstract value);

} // JobNeeds
