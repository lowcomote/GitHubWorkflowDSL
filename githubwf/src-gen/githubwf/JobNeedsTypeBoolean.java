/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Needs Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.JobNeedsTypeBoolean#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getJobNeedsTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface JobNeedsTypeBoolean extends JobNeedsAbstract {
	/**
	 * Returns the value of the '<em><b>Job Needs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Needs</em>' attribute.
	 * @see #setJobNeeds(Boolean)
	 * @see githubwf.GithubwfPackage#getJobNeedsTypeBoolean_JobNeeds()
	 * @model required="true"
	 * @generated
	 */
	Boolean getJobNeeds();

	/**
	 * Sets the value of the '{@link githubwf.JobNeedsTypeBoolean#getJobNeeds <em>Job Needs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Needs</em>' attribute.
	 * @see #getJobNeeds()
	 * @generated
	 */
	void setJobNeeds(Boolean value);

} // JobNeedsTypeBoolean
