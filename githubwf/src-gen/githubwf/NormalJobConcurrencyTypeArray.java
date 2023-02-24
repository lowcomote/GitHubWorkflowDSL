/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Concurrency Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobConcurrencyTypeArray#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobConcurrencyTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface NormalJobConcurrencyTypeArray extends NormalJobConcurrencyAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobConcurrencyItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobConcurrencyTypeArray_Concurrency()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	EList<NormalJobConcurrencyItems> getConcurrency();

} // NormalJobConcurrencyTypeArray
