/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of3 Items1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3Items1#getItems1 <em>Items1</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf3Items1()
 * @model
 * @generated
 */
public interface NormalJobRuns_45onOneOf1AnyOf3Items1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Items1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items1</em>' containment reference.
	 * @see #setItems1(Machine)
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf3Items1_Items1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Machine getItems1();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3Items1#getItems1 <em>Items1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items1</em>' containment reference.
	 * @see #getItems1()
	 * @generated
	 */
	void setItems1(Machine value);

} // NormalJobRuns_45onOneOf1AnyOf3Items1
