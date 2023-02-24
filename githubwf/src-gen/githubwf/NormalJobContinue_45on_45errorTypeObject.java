/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Continue 45on 45error Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContinue_45on_45errorTypeObject#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContinue_45on_45errorTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface NormalJobContinue_45on_45errorTypeObject extends NormalJobContinue_45on_45errorAbstract {
	/**
	 * Returns the value of the '<em><b>Continue 45on 45error</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobContinue_45on_45errorPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue 45on 45error</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobContinue_45on_45errorTypeObject_Continue_45on_45error()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='continue-on-error'"
	 * @generated
	 */
	EList<NormalJobContinue_45on_45errorPropertiesAbstract> getContinue_45on_45error();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobContinue_45on_45errorTypeObject
