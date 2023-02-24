/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Container One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContainerOneOf1#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContainerOneOf1()
 * @model
 * @generated
 */
public interface NormalJobContainerOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(Container)
	 * @see githubwf.GithubwfPackage#getNormalJobContainerOneOf1_Container()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='container'"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobContainerOneOf1#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

} // NormalJobContainerOneOf1
