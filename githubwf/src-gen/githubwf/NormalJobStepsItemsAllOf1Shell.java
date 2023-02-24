/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1Shell#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Shell()
 * @model
 * @generated
 */
public interface NormalJobStepsItemsAllOf1Shell extends NormalJobStepsItemsAllOf1PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' containment reference.
	 * @see #setShell(Shell)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1Shell_Shell()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='shell'"
	 * @generated
	 */
	Shell getShell();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1Shell#getShell <em>Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' containment reference.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(Shell value);

} // NormalJobStepsItemsAllOf1Shell
