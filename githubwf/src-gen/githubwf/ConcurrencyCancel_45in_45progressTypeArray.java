/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency Cancel 45in 45progress Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ConcurrencyCancel_45in_45progressTypeArray#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConcurrencyCancel_45in_45progressTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface ConcurrencyCancel_45in_45progressTypeArray extends ConcurrencyCancel_45in_45progressAbstract {
	/**
	 * Returns the value of the '<em><b>Cancel 45in 45progress</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ConcurrencyCancel_45in_45progressItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel 45in 45progress</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getConcurrencyCancel_45in_45progressTypeArray_Cancel_45in_45progress()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='cancel-in-progress'"
	 * @generated
	 */
	EList<ConcurrencyCancel_45in_45progressItems> getCancel_45in_45progress();

} // ConcurrencyCancel_45in_45progressTypeArray
