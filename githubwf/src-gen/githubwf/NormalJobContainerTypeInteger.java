/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Container Type Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContainerTypeInteger#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContainerTypeInteger()
 * @model annotation="ArrayOfTypes ArrayOfTypes='integer'"
 * @generated
 */
public interface NormalJobContainerTypeInteger extends NormalJobContainerAbstract {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(Double)
	 * @see githubwf.GithubwfPackage#getNormalJobContainerTypeInteger_Container()
	 * @model required="true"
	 *        annotation="Keyword Keyword='container'"
	 * @generated
	 */
	Double getContainer();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobContainerTypeInteger#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Double value);

} // NormalJobContainerTypeInteger
