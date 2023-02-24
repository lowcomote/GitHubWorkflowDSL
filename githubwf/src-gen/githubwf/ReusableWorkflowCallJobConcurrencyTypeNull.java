/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Concurrency Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobConcurrencyTypeNull#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobConcurrencyTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface ReusableWorkflowCallJobConcurrencyTypeNull extends ReusableWorkflowCallJobConcurrencyAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference.
	 * @see #setConcurrency(NullValue)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobConcurrencyTypeNull_Concurrency()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	NullValue getConcurrency();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobConcurrencyTypeNull#getConcurrency <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' containment reference.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(NullValue value);

} // ReusableWorkflowCallJobConcurrencyTypeNull
