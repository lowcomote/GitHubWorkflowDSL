/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Needs One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.JobNeedsOneOf1#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getJobNeedsOneOf1()
 * @model
 * @generated
 */
public interface JobNeedsOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Job Needs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Needs</em>' containment reference.
	 * @see #setJobNeeds(Name)
	 * @see githubwf.GithubwfPackage#getJobNeedsOneOf1_JobNeeds()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Name getJobNeeds();

	/**
	 * Sets the value of the '{@link githubwf.JobNeedsOneOf1#getJobNeeds <em>Job Needs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Needs</em>' containment reference.
	 * @see #getJobNeeds()
	 * @generated
	 */
	void setJobNeeds(Name value);

} // JobNeedsOneOf1
