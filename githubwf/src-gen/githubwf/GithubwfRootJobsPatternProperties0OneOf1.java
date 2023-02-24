/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Jobs Pattern Properties0 One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootJobsPatternProperties0OneOf1#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootJobsPatternProperties0OneOf1()
 * @model
 * @generated
 */
public interface GithubwfRootJobsPatternProperties0OneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern Properties0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Properties0</em>' containment reference.
	 * @see #setPatternProperties0(ReusableWorkflowCallJob)
	 * @see githubwf.GithubwfPackage#getGithubwfRootJobsPatternProperties0OneOf1_PatternProperties0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReusableWorkflowCallJob getPatternProperties0();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootJobsPatternProperties0OneOf1#getPatternProperties0 <em>Pattern Properties0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Properties0</em>' containment reference.
	 * @see #getPatternProperties0()
	 * @generated
	 */
	void setPatternProperties0(ReusableWorkflowCallJob value);

} // GithubwfRootJobsPatternProperties0OneOf1
