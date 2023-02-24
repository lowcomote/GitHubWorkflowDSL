/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Container One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContainerOneOf0#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContainerOneOf0()
 * @model annotation="Type Type='string'"
 * @generated
 */
public interface NormalJobContainerOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(String)
	 * @see githubwf.GithubwfPackage#getNormalJobContainerOneOf0_Container()
	 * @model required="true"
	 *        annotation="Keyword Keyword='container'"
	 * @generated
	 */
	String getContainer();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobContainerOneOf0#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(String value);

} // NormalJobContainerOneOf0
