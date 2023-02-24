/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Container Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContainerTypeBoolean#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContainerTypeBoolean()
 * @model annotation="ArrayOfTypes ArrayOfTypes='boolean'"
 * @generated
 */
public interface NormalJobContainerTypeBoolean extends NormalJobContainerAbstract {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(Boolean)
	 * @see githubwf.GithubwfPackage#getNormalJobContainerTypeBoolean_Container()
	 * @model required="true"
	 *        annotation="Keyword Keyword='container'"
	 * @generated
	 */
	Boolean getContainer();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobContainerTypeBoolean#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Boolean value);

} // NormalJobContainerTypeBoolean
