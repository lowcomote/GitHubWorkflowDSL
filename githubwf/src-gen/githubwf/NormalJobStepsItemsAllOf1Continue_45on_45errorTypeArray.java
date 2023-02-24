/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 Continue 45on 45error Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray extends NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract {
	/**
	 * Returns the value of the '<em><b>Continue 45on 45error</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue 45on 45error</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_Continue_45on_45error()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='continue-on-error'"
	 * @generated
	 */
	EList<NormalJobStepsItemsAllOf1Continue_45on_45errorItems> getContinue_45on_45error();

} // NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray
