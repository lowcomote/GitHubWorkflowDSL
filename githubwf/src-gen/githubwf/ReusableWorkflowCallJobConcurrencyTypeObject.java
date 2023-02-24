/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Concurrency Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobConcurrencyTypeObject#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobConcurrencyTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface ReusableWorkflowCallJobConcurrencyTypeObject extends ReusableWorkflowCallJobConcurrencyAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ReusableWorkflowCallJobConcurrencyPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobConcurrencyTypeObject_Concurrency()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	EList<ReusableWorkflowCallJobConcurrencyPropertiesAbstract> getConcurrency();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // ReusableWorkflowCallJobConcurrencyTypeObject
