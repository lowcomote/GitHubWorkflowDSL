/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Needs One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.JobNeedsOneOf0#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getJobNeedsOneOf0()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface JobNeedsOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Job Needs</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.JobNeedsOneOf0Items}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Needs</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getJobNeedsOneOf0_JobNeeds()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<JobNeedsOneOf0Items> getJobNeeds();

} // JobNeedsOneOf0
