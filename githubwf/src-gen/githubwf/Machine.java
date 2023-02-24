/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Machine#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getMachine()
 * @model annotation="Enum"
 * @generated
 */
public interface Machine extends EObject {
	/**
	 * Returns the value of the '<em><b>Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' containment reference.
	 * @see #setMachine(JsonDocument)
	 * @see githubwf.GithubwfPackage#getMachine_Machine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getMachine();

	/**
	 * Sets the value of the '{@link githubwf.Machine#getMachine <em>Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine</em>' containment reference.
	 * @see #getMachine()
	 * @generated
	 */
	void setMachine(JsonDocument value);

} // Machine
