/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Needs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobNeeds#getNeeds <em>Needs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobNeeds()
 * @model
 * @generated
 */
public interface NormalJobNeeds extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Needs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' containment reference.
	 * @see #setNeeds(JobNeeds)
	 * @see githubwf.GithubwfPackage#getNormalJobNeeds_Needs()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='needs'"
	 * @generated
	 */
	JobNeeds getNeeds();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobNeeds#getNeeds <em>Needs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs</em>' containment reference.
	 * @see #getNeeds()
	 * @generated
	 */
	void setNeeds(JobNeeds value);

} // NormalJobNeeds
