/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Needs Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.JobNeedsTypeArray#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getJobNeedsTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface JobNeedsTypeArray extends JobNeedsAbstract {
	/**
	 * Returns the value of the '<em><b>Job Needs</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.JobNeedsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Needs</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getJobNeedsTypeArray_JobNeeds()
	 * @model containment="true"
	 * @generated
	 */
	EList<JobNeedsItems> getJobNeeds();

} // JobNeedsTypeArray
