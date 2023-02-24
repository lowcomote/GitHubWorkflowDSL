/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 If Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1IfTypeNumber#getIf_ <em>If </em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1IfTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1IfTypeNumber extends NormalJobStepsItemsAllOf1IfAbstract {
	/**
	 * Returns the value of the '<em><b>If </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If </em>' attribute.
	 * @see #setIf_(Double)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1IfTypeNumber_If_()
	 * @model required="true"
	 *        annotation="Keyword Keyword='if'"
	 * @generated
	 */
	Double getIf_();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1IfTypeNumber#getIf_ <em>If </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If </em>' attribute.
	 * @see #getIf_()
	 * @generated
	 */
	void setIf_(Double value);

} // NormalJobStepsItemsAllOf1IfTypeNumber
