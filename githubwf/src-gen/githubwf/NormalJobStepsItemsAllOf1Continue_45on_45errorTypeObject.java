/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 Continue 45on 45error Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject extends NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract {
	/**
	 * Returns the value of the '<em><b>Continue 45on 45error</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue 45on 45error</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_Continue_45on_45error()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='continue-on-error'"
	 * @generated
	 */
	EList<NormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract> getContinue_45on_45error();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject
