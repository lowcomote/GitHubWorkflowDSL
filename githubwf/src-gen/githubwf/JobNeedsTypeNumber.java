/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Needs Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.JobNeedsTypeNumber#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getJobNeedsTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface JobNeedsTypeNumber extends JobNeedsAbstract {
	/**
	 * Returns the value of the '<em><b>Job Needs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Needs</em>' attribute.
	 * @see #setJobNeeds(Double)
	 * @see githubwf.GithubwfPackage#getJobNeedsTypeNumber_JobNeeds()
	 * @model required="true"
	 * @generated
	 */
	Double getJobNeeds();

	/**
	 * Sets the value of the '{@link githubwf.JobNeedsTypeNumber#getJobNeeds <em>Job Needs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Needs</em>' attribute.
	 * @see #getJobNeeds()
	 * @generated
	 */
	void setJobNeeds(Double value);

} // JobNeedsTypeNumber
