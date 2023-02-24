/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Needs Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.JobNeedsTypeString#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getJobNeedsTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface JobNeedsTypeString extends JobNeedsAbstract {
	/**
	 * Returns the value of the '<em><b>Job Needs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Needs</em>' attribute.
	 * @see #setJobNeeds(String)
	 * @see githubwf.GithubwfPackage#getJobNeedsTypeString_JobNeeds()
	 * @model required="true"
	 * @generated
	 */
	String getJobNeeds();

	/**
	 * Sets the value of the '{@link githubwf.JobNeedsTypeString#getJobNeeds <em>Job Needs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Needs</em>' attribute.
	 * @see #getJobNeeds()
	 * @generated
	 */
	void setJobNeeds(String value);

} // JobNeedsTypeString
