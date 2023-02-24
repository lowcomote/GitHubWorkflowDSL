/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job If Type String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobIfTypeString#getIf_ <em>If </em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobIfTypeString()
 * @model annotation="ArrayOfTypes ArrayOfTypes='string'"
 * @generated
 */
public interface ReusableWorkflowCallJobIfTypeString extends ReusableWorkflowCallJobIfAbstract {
	/**
	 * Returns the value of the '<em><b>If </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If </em>' attribute.
	 * @see #setIf_(String)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobIfTypeString_If_()
	 * @model required="true"
	 *        annotation="Keyword Keyword='if'"
	 * @generated
	 */
	String getIf_();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobIfTypeString#getIf_ <em>If </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If </em>' attribute.
	 * @see #getIf_()
	 * @generated
	 */
	void setIf_(String value);

} // ReusableWorkflowCallJobIfTypeString
