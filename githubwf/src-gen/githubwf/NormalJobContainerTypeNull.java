/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Container Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContainerTypeNull#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContainerTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface NormalJobContainerTypeNull extends NormalJobContainerAbstract {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(NullValue)
	 * @see githubwf.GithubwfPackage#getNormalJobContainerTypeNull_Container()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='container'"
	 * @generated
	 */
	NullValue getContainer();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobContainerTypeNull#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(NullValue value);

} // NormalJobContainerTypeNull
