/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Needs Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.JobNeedsTypeObject#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getJobNeedsTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface JobNeedsTypeObject extends JobNeedsAbstract {
	/**
	 * Returns the value of the '<em><b>Job Needs</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.JobNeedsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Needs</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getJobNeedsTypeObject_JobNeeds()
	 * @model containment="true"
	 * @generated
	 */
	EList<JobNeedsPropertiesAbstract> getJobNeeds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // JobNeedsTypeObject
