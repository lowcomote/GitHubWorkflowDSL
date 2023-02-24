/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of4 Items0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4Items0#getItems0 <em>Items0</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf4Items0()
 * @model annotation="Const"
 * @generated
 */
public interface NormalJobRuns_45onOneOf1AnyOf4Items0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Items0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items0</em>' containment reference.
	 * @see #setItems0(JsonDocument)
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf4Items0_Items0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getItems0();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4Items0#getItems0 <em>Items0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items0</em>' containment reference.
	 * @see #getItems0()
	 * @generated
	 */
	void setItems0(JsonDocument value);

} // NormalJobRuns_45onOneOf1AnyOf4Items0
