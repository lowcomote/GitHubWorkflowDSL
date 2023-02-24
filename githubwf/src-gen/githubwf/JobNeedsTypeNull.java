/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Needs Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.JobNeedsTypeNull#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getJobNeedsTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface JobNeedsTypeNull extends JobNeedsAbstract {
	/**
	 * Returns the value of the '<em><b>Job Needs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Needs</em>' containment reference.
	 * @see #setJobNeeds(NullValue)
	 * @see githubwf.GithubwfPackage#getJobNeedsTypeNull_JobNeeds()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NullValue getJobNeeds();

	/**
	 * Sets the value of the '{@link githubwf.JobNeedsTypeNull#getJobNeeds <em>Job Needs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Needs</em>' containment reference.
	 * @see #getJobNeeds()
	 * @generated
	 */
	void setJobNeeds(NullValue value);

} // JobNeedsTypeNull
