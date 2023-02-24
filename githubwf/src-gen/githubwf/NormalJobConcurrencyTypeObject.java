/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Concurrency Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobConcurrencyTypeObject#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobConcurrencyTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface NormalJobConcurrencyTypeObject extends NormalJobConcurrencyAbstract {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobConcurrencyPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobConcurrencyTypeObject_Concurrency()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='concurrency'"
	 * @generated
	 */
	EList<NormalJobConcurrencyPropertiesAbstract> getConcurrency();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobConcurrencyTypeObject
