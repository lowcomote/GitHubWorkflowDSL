/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of2 Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2Tuple#getItems0 <em>Items0</em>}</li>
 *   <li>{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2Tuple#getItems1 <em>Items1</em>}</li>
 *   <li>{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2Tuple#getAdditionalItems <em>Additional Items</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf2Tuple()
 * @model annotation="Tuple"
 * @generated
 */
public interface NormalJobRuns_45onOneOf1AnyOf2Tuple extends EObject {
	/**
	 * Returns the value of the '<em><b>Items0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items0</em>' containment reference.
	 * @see #setItems0(NormalJobRuns_45onOneOf1AnyOf2Items0)
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf2Tuple_Items0()
	 * @model containment="true"
	 * @generated
	 */
	NormalJobRuns_45onOneOf1AnyOf2Items0 getItems0();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2Tuple#getItems0 <em>Items0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items0</em>' containment reference.
	 * @see #getItems0()
	 * @generated
	 */
	void setItems0(NormalJobRuns_45onOneOf1AnyOf2Items0 value);

	/**
	 * Returns the value of the '<em><b>Items1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items1</em>' containment reference.
	 * @see #setItems1(NormalJobRuns_45onOneOf1AnyOf2Items1)
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf2Tuple_Items1()
	 * @model containment="true"
	 * @generated
	 */
	NormalJobRuns_45onOneOf1AnyOf2Items1 getItems1();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2Tuple#getItems1 <em>Items1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items1</em>' containment reference.
	 * @see #getItems1()
	 * @generated
	 */
	void setItems1(NormalJobRuns_45onOneOf1AnyOf2Items1 value);

	/**
	 * Returns the value of the '<em><b>Additional Items</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobRuns_45onOneOf1AnyOf2AdditionalItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Items</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf2Tuple_AdditionalItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<NormalJobRuns_45onOneOf1AnyOf2AdditionalItems> getAdditionalItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false" required="true" ordered="false"
	 * @generated
	 */
	Integer getItemsNumber();

} // NormalJobRuns_45onOneOf1AnyOf2Tuple
