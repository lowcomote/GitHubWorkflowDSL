/**
 */
package githubwf;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Architecture#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getArchitecture()
 * @model annotation="Enum"
 * @generated
 */
public interface Architecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' containment reference.
	 * @see #setArchitecture(JsonDocument)
	 * @see githubwf.GithubwfPackage#getArchitecture_Architecture()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getArchitecture();

	/**
	 * Sets the value of the '{@link githubwf.Architecture#getArchitecture <em>Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' containment reference.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(JsonDocument value);

} // Architecture
